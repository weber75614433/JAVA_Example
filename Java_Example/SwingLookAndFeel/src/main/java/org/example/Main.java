package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //String str = "javax.swing.plaf.nimbus.NimbusLookAndFeel";

        //改變視窗外觀 一般用 jsvsx.swing.plaf
        String str = "com.jtattoo.plaf.graphite.GraphiteLookAndFeel";
        UIManager.setLookAndFeel(str);

        Frame frame = new Frame();
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}