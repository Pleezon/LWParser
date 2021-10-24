package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Reader;

public class SaveType extends DataObject {
    public final byte type;
    public SaveType(Reader r) {
        super(r);
        type = getNextByte();
    }

    @Override
    public void write() {
        writeNextByte(type);
    }
}
