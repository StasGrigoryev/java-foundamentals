package swing.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class JFrameLesson {
    public static void main(String[] args) {

        JFrame frame = getFrame();
    }

        public static JFrame getFrame() {
            JFrame frame = new JFrame() {
            }; // анонимный класс
            frame.setVisible(true); // делаем видимой
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // чтобы закрывалась
            // frame.setSize(500, 300); // размер окна (если не задать, будет маленьким в углу)
            // frame.setLocation(400,200); // в каком месте экрана будет появляться
            // frame.setBounds(400, 200, 500, 300); // можно указать сразу и размер окна и место на экране
            Toolkit toolkit = Toolkit.getDefaultToolkit(); // лучше использовать toolkit
            Dimension dimension = toolkit.getScreenSize(); // чтобы задавать отступы в завис-ти от разрешения экрана
            frame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150,
                    500, 300); // ставим окно по середине экрана с учетом ширины и высоты окна


            frame.setTitle("Hello World"); // сообщение в заголовке окна
            //frame.setIconImage(); // можно установить иконку
            return frame;
        }





}
