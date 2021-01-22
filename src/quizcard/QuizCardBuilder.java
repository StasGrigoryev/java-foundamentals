package quizcard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class QuizCardBuilder {

    public void go() {
        // формируем и выврдим GUI
    }


    private class NextCardListener implements ActionListener {

        //добавляем текщую карточку в список и очищаем текстовые области
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class SaveMenuListener implements ActionListener {

        //вызываем тестовое окно позволяющее пользователю назвать и сохранить набор
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class NewMenuListener implements ActionListener {

        //очщаем список карточек и тесктовые области
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private void saveFile(File file) {
        //проходим по списку корточек и записываем
        // каждый элемент в текстовыый файл, который потом
        // можно будет прочитать
        //(то есть с чистыми разделителями между частями)
    }








}
