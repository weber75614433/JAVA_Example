package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.util.Objects;

public class Frame extends JFrame {
    private final JLabel label, label2;
    private final JButton button, btn;
    private final JTextField textField;

    public Frame() {
        super("Hello Swing");
        super.setLayout(null);

        label = new JLabel("Enter Your name:");
        label.setBounds(140, 50, 200, 30);
        add(label);

        label2 = new JLabel();
        label.setBounds(140, 150, 100, 30);
        add(label2);

        button = new JButton("Click me !");
        button.setBounds(125, 200, 150, 25);
        add(button);

        ButtonHandler hanlder = new ButtonHandler();
        button.addActionListener(hanlder);

        textField = new JTextField(10);
        textField.setBounds(140, 100, 120, 30);
        add(textField);

        btn = new JButton("Test");
        btn.setBounds(125, 250, 150, 30);
        add(btn);
        btn.setEnabled(false);

    }

    private class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String str;
            try{
                str = textField.getText();
                label2.setText(str);
                if(str.equals("123")){
                    btn.setEnabled(true);
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Wrong", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }


}
