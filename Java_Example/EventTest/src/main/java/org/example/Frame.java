package org.example;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame{
    private final JLabel label1, label2;
    private final JTextField textField;
    private final JButton btn, btn2;

    public Frame() {
        super("Hello World");
        super.setLayout(null);

        label1 = new JLabel("Hello, Please enter your name :");
        label1.setBounds(50, 50, 300, 20);
        add(label1);

        textField = new JTextField("Name",10);
        textField.setBounds(50, 80, 150, 20);
        add(textField);

        label2 = new JLabel();
        label2.setBounds(50, 150, 150 ,20);
        add(label2);

        btn = new JButton();
        btn.setBounds(70, 200, 260, 40);
        add(btn);

        btn2 = new JButton("Calculate");
        btn2.setBounds(70, 250, 260, 40);
        add(btn2);

        ButtonHandler buttonHandler = new ButtonHandler();
        btn.addActionListener(buttonHandler);
        CalculateHandler calculateHandler = new CalculateHandler();
        btn2.addActionListener(calculateHandler);
        //內鍵字子大小設計 可套用 修改字型位置 FlatLaf 2.6 內的 FlatLaf.properties
        label1.putClientProperty("FlatLaf.styleClass", "h3");
        btn.setFont(UIManager.getFont("Monospaced.font"));
        btn2.setFont(UIManager.getFont("semibold.font"));

        //可設定圖像，建議放置於 resource 資料夾當中，要注意圖像大小
        btn.setIcon(new ImageIcon("C:\\Users\\WB\\Desktop\\folder2.png"));



    }
    //可自定義名稱，需要 implements ActionListener
    private class ButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                String str;
                str = textField.getText();
                label2.setText(str);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                        "Please Your Name !", "TextFiled Empty", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private class CalculateHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Calaulater();
        }
    }

    public static void Calaulater(){
        try{
            FlatDarkPurpleIJTheme.setup();
            UIManager.put("Button.arc", 999);
            UIManager.put("TextComponent.arc", 15);
        }catch(Exception e){
            System.err.println("Failed to initialize LaF");
        }
        Calculate calculate = new Calculate();
        calculate.setSize(300, 300);
        calculate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculate.setVisible(true);

    }
}
