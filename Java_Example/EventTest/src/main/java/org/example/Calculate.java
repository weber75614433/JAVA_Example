package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Calculate extends JFrame {
    private final JLabel label, label2;
    private final JButton btn;
    private final JTextField textField;

    public Calculate(){
        super("Calculator");
        super.setLayout(null);

        label = new JLabel("Counting Result");
        label.setBounds(50, 50, 100, 30);
        add(label);

        textField = new JTextField(10);
        textField.setBounds(50, 80, 100, 30);
        add(textField);

        IsDigit isDigit = new IsDigit();
        textField.addKeyListener(isDigit);

        label2 = new JLabel();
        label2.setBounds(50, 100, 100, 30);
        add(label2);

        btn = new JButton("Calculate");
        btn.setBounds(50, 150, 100, 30);
        add(btn);

        Calculator calculator = new Calculator();
        btn.addActionListener(calculator);

    }

    private class IsDigit implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if(Character.isLetter(c)){
                e.consume();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

    }

    private class Calculator implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int number1 = 0, number2 = 0, result = 0;
            String str;
            String[] subs = new String[3];
            str = textField.getText();
            subs = str.split(" ");
            number1 = Integer.parseInt(subs[0]);
            number2 = Integer.parseInt(subs[2]);

            switch(subs[1]){
                case "+":
                    result = number1 + number2;

                case "-":
                    result = number1 - number2;

                case "*" :
                    result = number1 * number2;

                case "/" :
                    result = number1 / number2;

            }
            label2.setText(String.valueOf(result));
        }
    }
}
