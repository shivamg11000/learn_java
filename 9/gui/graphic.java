import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.*;

public class graphic extends JFrame{
    // frame properties
    public graphic(){
        this.setSize(400, 400);
        this.setTitle("Drawing Shapes");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// to make sure the frame is closed on exit
        this.add(new DrawStuff(), BorderLayout.CENTER); // add the drawing stuff to the frame

        this.setVisible(true); // otherwise it is not visible
    }

    // drawing stuff
    private class DrawStuff extends JComponent{
        public void paint(Graphics g) {
            Graphics2D graph2 = (Graphics2D) g;

            graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            Shape drawLine = new Line2D.Float(20, 90, 55, 250);
            
            Shape drawArc2D = new Arc2D.Double(5, 150, 100, 100, 45, 180, Arc2D.OPEN);

            graph2.setPaint(Color.BLACK); // color to draw with

            graph2.draw(drawLine);
            graph2.draw(drawArc2D);

            Shape drawEllipse = new Ellipse2D.Float(10, 10, 100, 100);
            Shape  drawRect = new Rectangle2D.Float(150, 150, 100, 100);
            
            graph2.draw(drawEllipse);
            graph2.draw(drawRect);
        } 
    }

    // main
    public static void main(String[] args) {
        new graphic(); // initiating the frame
    }

}
