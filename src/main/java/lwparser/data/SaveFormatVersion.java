package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Reader;

public class SaveFormatVersion extends DataObject {
    public final byte version;
    public SaveFormatVersion(Reader r) {
        super(r);
        version = getNextByte();
    }

    @Override
    public void write() {
        writeNextByte(version);
    }
}
