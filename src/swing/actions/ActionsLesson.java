package swing.actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionsLesson {
    static JFrame frame = getJFrame(); //вынесли сюда, чтобы можно было использовать в классе MyAction
    static JPanel panel = new JPanel();

    public static void main(String[] args) {
        frame.add(panel);
        JButton button = new JButton(new MyAction()); // вместо добавления addActionListener, добавляем action, созданный
        // в отдельном классе
        button.setText("I'm JB");
        panel.add(button);
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame.setBackground(new Color(190,20,255)); // это можно использовать только один раз
//            }
//        });

    }

    static class MyAction extends AbstractAction {
        public MyAction() {
            putValue(AbstractAction.SHORT_DESCRIPTION,"My small action"); // добавили описание
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.BLUE);
        }
    }


    public static JFrame getJFrame() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width/2 - 250,dimension.height/2 - 150,500,300);
        frame.setTitle("We Are The Champions");
        return frame;
    }
}
