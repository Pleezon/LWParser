package lwparser.gui;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Callable;

public class Frame extends JFrame {
    public JTextArea jsonField;
    public Runnable onParseClick;
    public Runnable onSaveClick;
    public JTextField pathField;
    public Frame(){
        super("LWParser");
        this.setLayout(null);
        this.pack();
        this.setResizable(false);
        JLabel pathLabel = new JLabel("path to gamesave:");
        pathLabel.setBounds(20,10,440,20);
        this.add(pathLabel);
        pathField = new JTextField();
        pathField.setText("C:\\Program Files (x86)\\Steam\\steamapps\\common\\Logic World\\saves\\");
        pathField.setBounds(20,30,440,20);
        this.add(pathField);
        JButton parseButton = new JButton("parse!");
        parseButton.addActionListener((a)->{
            onParseClick.run();
        });
        parseButton.setBounds(20,50,440,20);
        this.add(parseButton);
        JButton saveButton = new JButton("save!");
        saveButton.addActionListener((a)->{
            onSaveClick.run();
        });
        saveButton.setBounds(20,70,440,20);
        this.add(saveButton);


        jsonField = new JTextArea();
        JScrollPane jsonPane = new JScrollPane(jsonField);
        jsonPane.setBounds(20,90,440,610);
        this.add(jsonPane);

        //scrollPane.setBounds(20,70,440,300);


        this.setSize(500 ,750);
        this.setVisible(true);
    }
}
