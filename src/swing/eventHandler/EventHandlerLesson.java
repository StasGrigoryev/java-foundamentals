package swing.eventHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class EventHandlerLesson {
    public static void main(String[] args) {
        JFrame frame = getFrame();
        JPanel jPanel = new JPanel();
        frame.add(jPanel);
        JButton jButton = new JButton("Wow!");
        jPanel.add(jButton);
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame.setTitle(((JButton)e.getSource()).getText()); // устанавливаем заголовок окна как в подписи кнопки
//            } // то есть берем у эвента (здесь это кнопка) текст и ставим его как заголовок окна
//        });
        jButton.addActionListener(EventHandler.create(ActionListener.class,frame,"title",
                                                                "source.text"));
    } //последняя строка заменяет предыдущие закомментированные

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
