import javax.swing.*;

public class TestFrame {

    public static void main(String[] args) throws Exception {
        String str = "javax.swing.plaf.nimbus.NimbusLookAndFeel";

        UIManager.setLookAndFeel(str);

        Frame frame = new Frame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
