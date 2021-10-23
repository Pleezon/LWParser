package lwparser.Data;

import lwparser.parser.DataObject;
import lwparser.parser.Requester;

public class SaveFormatVersion extends DataObject {
    public final byte version;
    public SaveFormatVersion(Requester r) {
        super(r);
        version = getNextByte();
    }
}
