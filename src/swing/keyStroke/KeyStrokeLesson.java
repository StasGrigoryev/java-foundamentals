package swing.keyStroke;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class KeyStrokeLesson {
    static JFrame frame = getFrame();
    static JPanel panel = new JPanel();

    public static void main(String[] args) {
        AbstractAction myAction = new MyAction();
        frame.add(panel);
        JButton button = new JButton(myAction);
        panel.add(button);
        button.setText("Beep!");
        KeyStroke keyStroke = KeyStroke.getKeyStroke("alt W");
        InputMap inputMap = panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(keyStroke,"changeColor");
        ActionMap actionMap = panel.getActionMap();
        actionMap.put("changeColor", myAction);
    }

    static class MyAction extends AbstractAction{
        MyAction() {
            putValue(AbstractAction.SHORT_DESCRIPTION,"Wow!");
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.CYAN);
        }
    }

    public static JFrame getFrame(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width/2-250, dimension.height/2-150, 500, 300);
        frame.setTitle("I'm SuperFrame");
        return frame;
    }
}
