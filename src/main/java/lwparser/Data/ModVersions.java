package lwparser.Data;

import lwparser.parser.DataObject;
import lwparser.parser.Requester;

public class ModVersions extends DataObject {
    public final int numberOfModVersions;
    public final ModVersion[] modVersions;

    public class ModVersion{
        public final String textID;
        public final String version;
        public ModVersion(){
            textID = getNextString();
            version = getNextVersion();
        }
    }

    public ModVersions(Requester r) {
        super(r);
        numberOfModVersions = getNextInt();
        modVersions = new ModVersion[numberOfModVersions];
        for(int i=0; i<numberOfModVersions;i++){
            modVersions[i] = new ModVersion();
        }
    }
}