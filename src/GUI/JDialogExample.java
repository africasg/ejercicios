package GUI;

import javax.swing.*;

public class JDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana Principal (JFrame)");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Abrir Diálogo");
        frame.add(button);

        button.addActionListener(e -> {
            JDialog dialog = new JDialog(frame, "Diálogo Secundario (JDialog)", true);
            dialog.setSize(300, 200);
            dialog.add(new JLabel("Esto es un JDialog", SwingConstants.CENTER));
            dialog.setLocationRelativeTo(frame); // Centrar respecto al JFrame
            dialog.setVisible(true);
        });

        frame.setVisible(true);
    }
}
