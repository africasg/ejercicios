package GUI;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//Se utiliza para manejar eventos del mouse (clics, entradas, salidas, presiones, y liberaciones)
public class MouseListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseListener Example");
        JLabel label = new JLabel("Hover or Click Me");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked!");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed!");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released!");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse Exited!");
            }
        });

        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
