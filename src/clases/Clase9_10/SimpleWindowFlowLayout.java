package clases.Clase9_10;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleWindowFlowLayout {
    private JFrame jframe;
    private JLabel label;
    private JButton button;

    public SimpleWindowFlowLayout() {
        jframe = new JFrame();
        // Configuración de la ventana
        jframe.setTitle("Swing example with FlowLayout");
        jframe.setSize(300, 150);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(new FlowLayout()); // FlowLayout: Componentes alineados de izquierda a derecha

        // Crear etiqueta
        label = new JLabel("Click the button");
        jframe.add(label);

        // Crear botón
        button = new JButton("Click here");
        jframe.add(button);

        // Añadir un listener al botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("You clicked!");
            }
        });
    }

    public void mostrar() {
        // Hacer visible la ventana
        jframe.setVisible(true);
        jframe.setLocation(100, 100); // Colocar ventana en (100, 100)
    }

    public static void main(String[] args) {
        // Crear una instancia de la ventana
        SimpleWindowFlowLayout miApp = new SimpleWindowFlowLayout();
        // Mostrar la ventana
        miApp.mostrar();
    }
}
