package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Requester;

public class CircuitStates extends DataObject {
    public final int amountOfBytes;
    public final byte[] circuitStates;
    public CircuitStates(Requester r) {
        super(r);
        amountOfBytes = getNextInt();
        circuitStates = new byte[amountOfBytes];
        for(int i=0; i<amountOfBytes;i++){
            circuitStates[i] = getNextByte();
        }
    }
}
