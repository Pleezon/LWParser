package lwparser.parser;

import com.google.gson.Gson;
import lwparser.data.*;

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
        Reader r = new Reader() {
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
        System.out.println(new Gson().toJson(header));
        saveFormatVersion = new SaveFormatVersion(r);
        System.out.println(new Gson().toJson(saveFormatVersion));
        gameVersion = new GameVersion(r);
        System.out.println(new Gson().toJson(gameVersion));
        saveType = new SaveType(r);
        System.out.println(new Gson().toJson(saveType));
        numberOfComponentsAndWires = new NumberOfComponentsAndWires(r);
        System.out.println(new Gson().toJson(numberOfComponentsAndWires));
        modVersions = new ModVersions(r);
        System.out.println(new Gson().toJson(modVersions));
        componentIDsMap = new ComponentIDsMap(r);
        System.out.println(new Gson().toJson(componentIDsMap));
        componentsData = new ComponentsData(r,numberOfComponentsAndWires.numberOfComponents);
        System.out.println(new Gson().toJson(componentsData));
        wiresData = new WiresData(r,numberOfComponentsAndWires.numberOfWires);
        System.out.println(new Gson().toJson(wiresData));
        circuitStates = new CircuitStates(r);
        System.out.println(new Gson().toJson(circuitStates));
        footer = new Footer(r);
        if(footer.footer.equals("redstone sux lol")){
            System.out.println("read correctly!");
        }
    }

    public void save(File file) throws IOException {
        OutputStream outputStream = new FileOutputStream(file);
        Writer w = new Writer() {
            @Override
            public void writeNext(byte b) {
                try {
                    outputStream.write(b);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        header.setWriter(w);
        saveFormatVersion.setWriter(w);
        gameVersion.setWriter(w);
        saveType.setWriter(w);
        numberOfComponentsAndWires.setWriter(w);
        modVersions.setWriter(w);
        componentIDsMap.setWriter(w);
        componentsData.setWriter(w);
        wiresData.setWriter(w);
        circuitStates.setWriter(w);
        footer.setWriter(w);

        header.write();
        saveFormatVersion.write();
        gameVersion.write();
        saveType.write();
        numberOfComponentsAndWires.write();
        modVersions.write();
        componentIDsMap.write();
        componentsData.write();
        wiresData.write();
        circuitStates.write();
        footer.write();
        outputStream.close();
        System.out.println("Saved!");
    };


}
