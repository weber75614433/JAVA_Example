import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo {
    static boolean shouldFill = true;
    static boolean shouldWeightX = true;
    static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPane(Container pane){
        if(RIGHT_TO_LEFT){
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
        JButton button;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if(shouldFill){
            //natural height, maximum width
            c.fill = GridBagConstraints.HORIZONTAL;
        }

        button = new JButton("Button 1");
        if(shouldWeightX){
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(button, c);

        button = new JButton("Button 2");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 100;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(button, c);

        button = new JButton("Button 3");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        pane.add(button, c);

        /*button = new JButton("Long-Named Button 4");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;  // make this Component tall
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(button, c);

        button = new JButton("5");
        c.fill = GridBagConstraints.BOTH;
        c.ipady = 0;
        c.weighty = 1.0;
        c.anchor = GridBagConstraints.PAGE_END; // 指定元件在顯示區域中的擺放位置
        c.insets = new Insets(10, 0, 0, 0);
        c.gridx = 1;
        c.gridwidth = 2;
        c.gridy = 2;*/

        pane.add(button, c);
    }

    /**
     * Create the GUI and show it. For thread safety,
     * this method should be invoked from the event-dispatching thread.
     */
    private static void createAndShowGUI(){
        //Create and set up the window
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
