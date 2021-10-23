package lwparser.parser;

import lwparser.Data.*;

import java.io.*;

public class World {

    public final Header header;
    public final SaveFormatVersion saveFormatVersion;
    public final GameVersion gameVersion;
    public final SaveType saveType;
    public final NumberOfComponentsAndWires numberOfComponentsAndWires;
    public final ModVersions modVersions;
    public final ComponentIDsMap componentIDsMap;
    public final ComponentsData componentsData;
    public final WiresData wiresData;
    public final CircuitStates circuitStates;
    public final Footer footer;


    public World(InputStream inputStream){
        Requester r = new Requester() {
            @Override
            public Byte nextByte() {
                try {
                    return (byte) inputStream.read();
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new Error("ERR/CRIT: couldn't read file!");
                }
            }
        };
        header = new Header(r);
        saveFormatVersion = new SaveFormatVersion(r);
        gameVersion = new GameVersion(r);
        saveType = new SaveType(r);
        numberOfComponentsAndWires = new NumberOfComponentsAndWires(r);
        modVersions = new ModVersions(r);
        componentIDsMap = new ComponentIDsMap(r);
        componentsData = new ComponentsData(r,numberOfComponentsAndWires.numberOfComponents);
        wiresData = new WiresData(r,numberOfComponentsAndWires.numberOfWires);
        circuitStates = new CircuitStates(r);
        footer = new Footer(r);
        if(footer.footer.equals("redstone sux lol")){
            System.out.println("read correctly!");
        }
    }

    public OutputStream save(File file) throws FileNotFoundException {
        OutputStream outputStream = new FileOutputStream(file);


        return outputStream;
    };


}
