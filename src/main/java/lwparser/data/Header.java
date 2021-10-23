package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Requester;

public class Header extends DataObject {
    public final String header;


    public Header(Requester r) {
        super(r);
        header = getStringWithLength(16);
    }
}
