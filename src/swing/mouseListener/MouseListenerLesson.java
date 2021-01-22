package swing.mouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListenerLesson {
    static JFrame frame = getFrame();
    static JPanel panel = new JPanel();

    public static void main(String[] args) {
        JComponent jComponent = new MyComponent();
        frame.add(jComponent);
        frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                MyComponent.xCoordinate = e.getX(); // берем координаты и записываем в переменные
                MyComponent.yCoordinate = e.getY();
                jComponent.repaint();
            }
        });

//        panel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                super.mouseClicked(e); //     тут мы просто отслеживаем клик и меняем фон по нему
//                panel.setBackground(Color.ORANGE);
//
//            }
//        });
    }

    static class MyComponent extends JComponent{
        public static int xCoordinate;
        public static int yCoordinate;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ((Graphics2D)g).drawString("Coordinates x: " + xCoordinate + " y: " + yCoordinate, 200,100);
        }
    }

    public static JFrame getFrame(){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250, dimension.height/2-150, 500, 300);
        jFrame.setTitle("Window with Mouse Listener");

        return jFrame;
    }




}
