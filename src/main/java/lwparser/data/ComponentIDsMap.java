package lwparser.data;

import lwparser.parser.DataObject;
import lwparser.parser.Requester;

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
    }

    public ComponentIDsMap(Requester r) {
        super(r);
        numberOfComponentIDs = getNextInt();
        mapping = new ComponentSet[numberOfComponentIDs];
        for(int i=0; i<numberOfComponentIDs;i++){
            mapping[i] = new ComponentSet();
        }
    }
}
