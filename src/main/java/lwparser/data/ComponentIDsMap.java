package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Reader;

public class ComponentIDsMap extends DataObject {
    public final ComponentSet[] mapping;
    public final int numberOfComponentIDs;

    public class ComponentSet{
        public final int componentID;
        public final String textID;

        public ComponentSet(){
            componentID = getNextUnsignedTwoByteInt();
            textID = getNextString();
        }
        public void write(DataObject dataObject){
            dataObject.writeNextUnsignedTwoByteInt(this.componentID);
            dataObject.writeNextStringWithLengthByte(this.textID);
        }
    }

    public ComponentIDsMap(Reader r) {
        super(r);
        numberOfComponentIDs = getNextInt();
        mapping = new ComponentSet[numberOfComponentIDs];
        for(int i=0; i<numberOfComponentIDs;i++){
            mapping[i] = new ComponentSet();
        }
    }

    @Override
    public void write() {
        writeNextInt(numberOfComponentIDs);
        for(int i=0; i<numberOfComponentIDs;i++){
            mapping[i].write(this);
        }
    }
}
