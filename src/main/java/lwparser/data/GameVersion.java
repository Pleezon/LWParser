package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Requester;

public class GameVersion extends DataObject {
    public final String version;
    public GameVersion(Requester r) {
        super(r);
        version = getNextVersion();
    }
}
