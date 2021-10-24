package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Reader;

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
        public void write(DataObject object){
            object.writeNextStringWithLengthByte(textID);
            object.writeNextVersion(version);
        }
    }

    public ModVersions(Reader r) {
        super(r);
        numberOfModVersions = getNextInt();
        modVersions = new ModVersion[numberOfModVersions];
        for(int i=0; i<numberOfModVersions;i++){
            modVersions[i] = new ModVersion();
        }
    }

    @Override
    public void write() {
        writeNextInt(numberOfModVersions);
        for (ModVersion modVersion : modVersions) {
            modVersion.write(this);
        }
    }
}
