package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Reader;

public class NumberOfComponentsAndWires extends DataObject {
    public final int numberOfComponents;
    public final int numberOfWires;
    public NumberOfComponentsAndWires(Reader r) {
        super(r);
        numberOfComponents = getNextInt();
        numberOfWires = getNextInt();
    }

    @Override
    public void write() {
        writeNextInt(numberOfComponents);
        writeNextInt(numberOfWires);
    }
}
