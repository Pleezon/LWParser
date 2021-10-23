package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Requester;

public class ComponentsData extends DataObject {
    public final Component[] components;

    public class Component {
        public final ComponentAdress componentAdress;
        public final ComponentAdress parentAdress;

        public final int componentID;

        public final float localPosX;
        public final float localPosY;
        public final float localPosZ;

        public final float rotationX;
        public final float rotationY;
        public final float rotationZ;
        public final float rotationW;

        public final int numberOfInputs;
        public final int[] inputCircuitStateIDs;

        public final int numberOfOutputs;
        public final int[] outputCircuitStateIDs;

        public final int amountOfCustomData;
        public final byte[] customData;

        public class ComponentAdress {
            public final long adress;

            public ComponentAdress() {
                adress = getNextUnsignedInt();
            }
        }


        public Component() {
            componentAdress = new ComponentAdress();
            parentAdress = new ComponentAdress();
            componentID = getNextUnsignedTwoByteInt();

            localPosX = getNextFloat();
            localPosY = getNextFloat();
            localPosZ = getNextFloat();

            rotationX = getNextFloat();
            rotationY = getNextFloat();
            rotationZ = getNextFloat();
            rotationW = getNextFloat();

            numberOfInputs = getNextInt();
            inputCircuitStateIDs = new int[numberOfInputs];
            for (int i = 0; i < numberOfInputs; i++) {
                inputCircuitStateIDs[i] = getNextInt();
            }

            numberOfOutputs = getNextInt();
            outputCircuitStateIDs = new int[numberOfOutputs];
            for (int i = 0; i < numberOfOutputs; i++) {
                outputCircuitStateIDs[i] = getNextInt();
            }
            int temp = getNextInt();
            amountOfCustomData = Math.max(temp, 0);
            customData = new byte[amountOfCustomData];
            for (int i = 0; i < amountOfCustomData; i++) {
                customData[i] = getNextByte();
            }


        }
    }

    public ComponentsData(Requester r, int amountOfComponents) {
        super(r);
        components = new Component[amountOfComponents];
        for (int i = 0; i < amountOfComponents; i++) {
            components[i] = new Component();
        }
    }
}
