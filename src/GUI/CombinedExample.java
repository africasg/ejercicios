package GUI;

import javax.swing.*;
//JFrame:
//
//Úsalo como la ventana principal de tu aplicación.
//Contiene la mayoría de los componentes e interacciones principales.
//JDialog:
//
//Úsalo para ventanas secundarias como confirmaciones, formularios o diálogos de información.
//Configúralo como modal si necesitas que el usuario complete una acción antes de volver a la ventana principal.
public class CombinedExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana Principal (JFrame)");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton dialogButton = new JButton("Abrir Diálogo");
        frame.add(dialogButton);

        dialogButton.addActionListener(e -> {
            JDialog dialog = new JDialog(frame, "Diálogo Modal", true);
            dialog.setSize(250, 150);
            dialog.add(new JLabel("Esto es un JDialog modal", SwingConstants.CENTER));
            dialog.setLocationRelativeTo(frame);
            dialog.setVisible(true);
        });

        frame.setVisible(true);
    }
}
