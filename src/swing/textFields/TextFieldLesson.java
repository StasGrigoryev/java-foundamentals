package swing.textFields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldLesson {
    static JFrame frame = getFrame();
    static JPanel panel = new JPanel();

    public static void main(String[] args) {
        frame.add(panel);
        panel.add(new JLabel("Label:")); // подпись для поля
        panel.add(new JPasswordField(20)); // поле для пароля (сиаволы не отображаются при вводе)
        JTextArea jTextArea = new JTextArea(5, 20);
        jTextArea.setLineWrap(true); // чтобы поле не р асширялось со строкой
        JScrollPane jScrollPane = new JScrollPane(jTextArea); // чтобы можно было скроллить
                                                 // добавляем в него то поле, которое будет скроллиться
        panel.add(jScrollPane); // сюда уже добавляем бар, а не поле
        JTextField jTextField = new JTextField("Default value", 20);
        panel.add(jTextField); // добавляем поле ввода данных на 20 символов
        JButton button = new JButton();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println(((JButton)e.getSource()).get);
            }
        });
        System.out.println(jTextField.getText());
        panel.revalidate(); // перерисовка,  почти как repaint()
    }


    static JFrame getFrame(){
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 -250,dimension.height/2  -150,500,300);
        jFrame.setTitle("My New App");
        return jFrame;
    }
}
