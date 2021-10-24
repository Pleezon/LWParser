package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Reader;

public class Header extends DataObject {
    public final String header;


    public Header(Reader r) {
        super(r);
        header = getStringWithLength(16);
    }

    @Override
    public void write() {
        writeNextStringWithoutLengthByte(header);
    }
}
