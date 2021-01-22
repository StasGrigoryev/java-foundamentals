package swing.windowListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerLesson {
    public static void main(String[] args) {
        JFrame frame = getFrame();
        frame.addWindowListener(new WindowAdapter() { // добавляет действия при открытии/закрытии и других действиях с окном
            @Override // можно выбрать какие методы переопределить (у WindowListener нужно переопределять все)
            public void windowClosing(WindowEvent e) { // действие при закрытии окна
                int i = 0; // действие просто для примера
            }
    });
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
