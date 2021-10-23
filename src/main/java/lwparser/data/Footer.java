package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Requester;

public class Footer extends DataObject {
    public final String footer;

    public Footer(Requester r) {
        super(r);
        footer = getStringWithLength(16);
    }
}
