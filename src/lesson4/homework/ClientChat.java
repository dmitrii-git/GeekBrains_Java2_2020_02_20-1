package lesson4.homework;

import lesson4.swing.TestForm;

import javax.swing.*;
import java.awt.*;

public class ClientChat {

    private JPanel panel1;
    private JList list1;
    private JTextArea textArea1;
    private JTextField textField1;
    private JButton sendButton;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Test Window");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new ClientChat().panel1);
        frame.setVisible(true);


    }

    public static void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }

}
