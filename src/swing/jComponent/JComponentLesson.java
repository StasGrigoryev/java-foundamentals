package swing.jComponent;

import javafx.scene.shape.Ellipse;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class JComponentLesson {

    public static void main(String[] args) {
        JFrame frame = getFrame();

        frame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Bitstream charter",Font.BOLD,20);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            g2.drawString("Hello World", 10, 20);
            Point2D p1 = new Point2D.Double(0,30);
            Point2D p2 = new Point2D.Double(500,30  );
            //Line2D l2 = new Line2D.Double(0, 30, 500  ,30);
            Line2D l2 = new Line2D.Double(p1,p2);
            g2.draw(l2);
            g2.setColor(Color.ORANGE); // выбираем цвет, которым будем рисовать
            Ellipse2D el = new Ellipse2D.Double(100,100, 100, 50);
            g2.draw(el); //рисуем эллипс
            //  g2.fill(el); // закрашивает область  el (необязательно перед этим рисовать его)
            Rectangle2D r2 = new Rectangle2D.Double(100, 100, 100, 50);
            g2.draw(r2);

            Image image = new ImageIcon(getClass().getResource("/img/play.png")).getImage();
            g2.drawImage(image, 200, 50, null);

        }
    }

    static JFrame getFrame(){
        JFrame frame = new JFrame() {};
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width/2 -250,dimension.height/2  -150,500,300);
        frame.setTitle("My New App");
        return frame;
    }
}
