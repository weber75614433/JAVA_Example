package org.example;


import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        try{
            //UIManager.setLookAndFeel(new FlatDarkLaf());
            FlatDarkPurpleIJTheme.setup();
            UIManager.put("Button.arc", 999);
            UIManager.put("TextComponent.arc", 15);
        }catch(Exception e){
            System.err.println("Failed to initialize LaF");
        }

        Frame frame = new Frame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}