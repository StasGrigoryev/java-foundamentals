package swing.actionListener;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionLesson {
    public static void main(String[] args) {
        JFrame frame = getFrame();
        JPanel jPanel = new JPanel();
        frame.add(jPanel);
        JButton jButton = new JButton("Subscribe");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 jPanel.setBackground(Color.CYAN); // при нажатии делает фон циановым
            }
        }); // создаем анонимный класс для того чтобы получить доступ к jButton и прописываем действие внутри метода
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
