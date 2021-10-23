package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Requester;

public class NumberOfComponentsAndWires extends DataObject {
    public final int numberOfComponents;
    public final int numberOfWires;
    public NumberOfComponentsAndWires(Requester r) {
        super(r);
        numberOfComponents = getNextInt();
        numberOfWires = getNextInt();
    }
}
