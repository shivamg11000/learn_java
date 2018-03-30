import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

// making a GUI using swing
public class GUI extends JFrame{

    public GUI(){
        this.setSize(400, 400); // size of gui
        this.setLocationRelativeTo(null); // centers the gui

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("My First Frame");

        // panels
        JPanel thePanel = new JPanel();
        // label
        JLabel label1 = new JLabel("Tell me something");

        label1.setText("New Text");

        label1.setToolTipText("Doesn't do anything");

        thePanel.add(label1);

        JButton button1 = new JButton("Send");

        button1.setBorderPainted(false);
        button1.setContentAreaFilled(false);
        button1.setText("New Button");
        button1.setToolTipText("Its a button");
        thePanel.add(button1);
        this.add(thePanel);

        this.setVisible(true);
        
    }

    public static void main(String[] args) {
        new GUI();
    }

}


