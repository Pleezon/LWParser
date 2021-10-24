package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Reader;

public class GameVersion extends DataObject {
    public final String version;
    public GameVersion(Reader r) {
        super(r);
        version = getNextVersion();
    }

    @Override
    public void write() {
        writeNextVersion(version);
    }
}
