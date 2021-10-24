package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Reader;

import java.io.DataInput;

public class ComponentsData extends DataObject {
    public final Component[] components;

    public class Component {
        public final ComponentAdress componentAdress;
        public final ComponentAdress parentAdress;

        public final int componentID;

        public float localPosX;
        public final float localPosY;
        public float localPosZ;

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
            public long adress;

            public ComponentAdress() {
                adress = getNextUnsignedInt();
            }

            public void write(DataObject object) {
                object.writeNextUnsignedInt(adress);
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
            numberOfInputs = Math.max(getNextInt(), 0);
            inputCircuitStateIDs = new int[numberOfInputs];
            for (int i = 0; i < numberOfInputs; i++) {
                inputCircuitStateIDs[i] = getNextInt();
            }

            numberOfOutputs = Math.max(getNextInt(), 0);
            outputCircuitStateIDs = new int[numberOfOutputs];
            for (int i = 0; i < numberOfOutputs; i++) {
                outputCircuitStateIDs[i] = getNextInt();
            }
            amountOfCustomData = Math.max(getNextInt(), 0);
            customData = new byte[amountOfCustomData];
            for (int i = 0; i < amountOfCustomData; i++) {
                customData[i] = getNextByte();
            }
        }

        public void write(DataObject object) {
            componentAdress.write(object);
            parentAdress.write(object);
            object.writeNextUnsignedTwoByteInt(componentID);


            object.writeNextFloat(localPosX);

            object.writeNextFloat(localPosY);
            object.writeNextFloat(localPosZ);

            object.writeNextFloat(rotationX);
            object.writeNextFloat(rotationY);
            object.writeNextFloat(rotationZ);
            object.writeNextFloat(rotationW);

            object.writeNextInt(numberOfInputs);
            for (int circuitStateID : inputCircuitStateIDs) {
                object.writeNextInt(circuitStateID);
            }

            object.writeNextInt(numberOfOutputs);
            for (int circuitStateID : outputCircuitStateIDs) {
                object.writeNextInt(circuitStateID);
            }
            object.writeNextInt(amountOfCustomData);
            for (byte b : customData) {
                object.writeNextByte(b);
            }
        }
    }

    public ComponentsData(Reader r, int amountOfComponents) {
        super(r);
        components = new Component[amountOfComponents];
        for (int i = 0; i < amountOfComponents; i++) {
            components[i] = new Component();
        }
    }

    @Override
    public void write() {
        for (Component component : components) {
            component.write(this);
        }
    }
}
