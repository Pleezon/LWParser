package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Requester;

public class SaveType extends DataObject {
    public final byte type;
    public SaveType(Requester r) {
        super(r);
        type = getNextByte();
    }
}
