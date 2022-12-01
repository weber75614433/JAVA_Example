import javax.swing.*;

public class Frame extends JFrame {
    private final JLabel label;
    private final JButton button;
    private final JTextField textField;

    public Frame() {
        super("Hello Swing");
        super.setLayout(null);

        label = new JLabel("Enter Your name :");
        label.setBounds(140, 50, 100, 30);
        add(label);

        button = new JButton("Click me !");
        button.setBounds(125, 200, 150, 25);
        add(button);

        textField = new JTextField(10);
        textField.setBounds(140, 100, 120, 30);
        add(textField);

    }

}
