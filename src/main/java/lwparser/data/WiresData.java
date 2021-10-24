package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Reader;

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
        public void write(DataObject object){
            object.writeNextPegAdress(firstPoint);
            object.writeNextPegAdress(secondPoint);
            object.writeNextInt(circuitStateID);
            object.writeNextFloat(rotation);
        }
    }


    public WiresData(Reader r, int amountOfWires) {
        super(r);
        wires = new Wire[amountOfWires];
        for(int i=0; i<amountOfWires; i++){
            wires[i] = new Wire();
        }
    }
    @Override
    public void write() {
        for(Wire w:wires){
            w.write(this);
        }
    }

}
