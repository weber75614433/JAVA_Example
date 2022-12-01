package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener{

    public JPanel contentPane;
    MyFrame(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 設定我們的視窗在螢幕上的(740, 350)位置出現，寬450高300
        setBounds(740, 350, 450, 300);

        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(2, 4, 4, 5));
        // 絕對位置 => null(不需要版面配置)   元件 => Controls.add(int x, int y, int width, int height)
        // BorderLayout(int, int) => 元件間距 *不需要間距需填上 0, 0
        // 元件 => Panel.add(Controls, BorderLayout.*) => NORTH, WEST, EAST, SOUTH, CENTER
        // FlowLayout : FLowLayout(FlowLayout.* , int, int)  * => Left, Center, Right 間距如不需要，可空白
        // FLowLayout 元件排序方法 => 從左至右，從上到下         * => 靠左對齊, 置中對齊, 靠右對齊
        // GridLayout => GridLayout(int rows, int cols, int, int)  rows => 水平列數  cols => 垂直行數  元件間距不需要可以空白
        // FlowLayout, GridLayout 元件 => 直接加入容器即可

        JButton btn1 = new JButton("Button 1");
        //btn1.setBounds(20, 20, 100, 30); (Absolute Position)
        // contentPane.add(btn1, BorderLayout.Center); (BorderLayout)
        contentPane.add(btn1);

        JButton btn2 = new JButton("Button 2");
        contentPane.add(btn2);

        JButton btn3 = new JButton("Button 3");
        contentPane.add(btn3);

        JButton btn4 = new JButton("Button 4");
        contentPane.add(btn4);

        JButton btn5 = new JButton("Button 5");
        contentPane.add(btn5);

        setTitle("我們的JFrame");
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "事件處理中");
    }
}
public class Main extends JPanel {
    public static void main(String[] args) {
        MyFrame window = new MyFrame();

    }
}