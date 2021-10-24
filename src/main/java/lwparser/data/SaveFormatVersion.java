package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Reader;

public class SaveFormatVersion extends DataObject {
    public final byte saveFormatVersion;
    public SaveFormatVersion(Reader r) {
        super(r);
        saveFormatVersion = getNextByte();
    }

    @Override
    public void write() {
        writeNextByte(saveFormatVersion);
    }
}
