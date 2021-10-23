package lwparser.Data;

import lwparser.parser.DataObject;
import lwparser.parser.Requester;

import java.nio.charset.StandardCharsets;

public class Footer extends DataObject {
    public final String footer;

    public Footer(Requester r) {
        super(r);
        footer = getStringWithLength(16);
    }
}
