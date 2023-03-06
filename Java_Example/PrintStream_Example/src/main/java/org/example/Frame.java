package org.example;

import javax.swing.*;
import java.awt.*;

public class Frame  {
    private final JTextArea textArea;
    private final JFrame frame;

    public Frame(){
        frame = new JFrame("Example");
        frame.setBounds(0,0,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textArea = new JTextArea();
        frame.getContentPane().add(textArea, BorderLayout.CENTER);

    }

    public void start(){
        frame.setVisible(true);
    }

    public void appendText(String text){
        textArea.append(text);
    }


}
