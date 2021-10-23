package lwparser.Data;

import lwparser.parser.DataObject;
import lwparser.parser.Requester;

import java.nio.charset.StandardCharsets;

public class Header extends DataObject {
    public final String header;


    public Header(Requester r) {
        super(r);
        header = getStringWithLength(16);
    }
}
