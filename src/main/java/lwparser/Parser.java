package lwparser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lwparser.gui.Frame;
import lwparser.parser.World;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Parser {
    public static void main(String[] args) throws FileNotFoundException {
        //C:\Program Files (x86)\Steam\steamapps\common\Logic World\saves\Test\data.logicworld
        Frame f = new Frame();
        f.onParseClick = () -> {
            File file = new File(f.pathField.getText());
            if(file.exists()){
                FileInputStream is;
                try {
                    is = new FileInputStream(file);
                    World w = new World(is);
                    Gson g = new GsonBuilder().setPrettyPrinting().create();
                    f.jsonField.setText(g.toJson(w));
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }else{
                System.out.println("file does not exist!");
            }
        };
        f.onSaveClick = () -> {
            File file = new File(f.pathField.getText());
            if(file.exists()){
                World w = new Gson().fromJson(f.jsonField.getText(),World.class);
                try {
                    w.save(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };
    }
}
