package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Reader;

public class Footer extends DataObject {
    public final String footer;

    public Footer(Reader r) {
        super(r);
        footer = getStringWithLength(16);
    }

    @Override
    public void write() {
        writeNextStringWithoutLengthByte(footer);
    }
}
