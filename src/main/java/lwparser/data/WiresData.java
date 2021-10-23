package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Requester;

public class WiresData extends DataObject {

    public final Wire[] wires;


    public class Wire {
        public final PegAdress firstPoint;
        public final PegAdress secondPoint;
        public final int circuitStateID;
        public final float rotation;

        public Wire() {
            firstPoint = getNextPegAdress();
            secondPoint = getNextPegAdress();
            circuitStateID = getNextInt();
            rotation = getNextFloat();
        }
    }


    public WiresData(Requester r, int amountOfWires) {
        super(r);
        wires = new Wire[amountOfWires];
        for(int i=0; i<amountOfWires; i++){
            wires[i] = new Wire();
        }
    }
}
