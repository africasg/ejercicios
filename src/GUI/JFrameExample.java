package GUI;

import javax.swing.*;

public class JFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana Principal (JFrame)");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Esto es un JFrame", SwingConstants.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }
}
