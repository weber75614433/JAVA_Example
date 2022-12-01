import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JLabel msgLabel;

    public CardLayoutDemo(){
        prepareGui();
    }

    public static void  main(String[] args){
        CardLayoutDemo cardLayoutDemo = new CardLayoutDemo();
        cardLayoutDemo.showCardLayoutDemo();
    }

    private void showCardLayoutDemo() {
        headerLabel.setText("Layout in action : CardLayout");

        final JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setSize(300, 300);

        CardLayout layout = new CardLayout();
        layout.setHgap(10);
        layout.setVgap(10);
        panel.setLayout(layout);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(new JButton("Confirm"));
        buttonPanel.add(new JButton("Cancel"));

        JPanel textBoxPanel = new JPanel(new FlowLayout());
        textBoxPanel.add(new JLabel("Name : "));
        textBoxPanel.add(new JTextField(20));

        panel.add("Button", buttonPanel);
        panel.add("Text", textBoxPanel);

        final JComboBox listCombo = new JComboBox();
        listCombo.setSelectedIndex(0);

        JScrollPane listComboScrollPane = new JScrollPane(listCombo);
        JButton showButton = new JButton("Show");

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(listCombo.getSelectedIndex() != -1){
                    CardLayout cardLayout = (CardLayout) (panel.getLayout());
                    cardLayout.show(panel, (String)listCombo.getItemAt(listCombo.getSelectedIndex()));
                }
                statusLabel.setText("data");
            }

        });
        controlPanel.add(listComboScrollPane);
        controlPanel.add(showButton);
        controlPanel.add(panel);
        mainFrame.setVisible(true);
    }

    private void prepareGui() {
        mainFrame = new JFrame("JAVA SWING EXAMPLES");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);

        statusLabel.setSize(350, 100);
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);

    }


}
