package FINAL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List; /**
 * Clase principal que maneja la interfaz gráfica de la aplicación.
 */
public class GestionDestinos extends JFrame {
    private List<Destino> destinos;
    private JTextArea displayArea;
    private JTextField nombreField, costoField, extraField;
    private JComboBox<String> tipoDestinoBox;

    public GestionDestinos() {
        destinos = new ArrayList<>();
        setTitle("Gestión de Destinos Vacacionales");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de entrada
        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        inputPanel.add(nombreField);

        inputPanel.add(new JLabel("Costo:"));
        costoField = new JTextField();
        inputPanel.add(costoField);

        inputPanel.add(new JLabel("Tipo:"));
        tipoDestinoBox = new JComboBox<>(new String[]{"Ciudad", "Playa"});
        inputPanel.add(tipoDestinoBox);

        inputPanel.add(new JLabel("Extra (Ciudad/Playa):"));
        extraField = new JTextField();
        inputPanel.add(extraField);

        JButton addButton = new JButton("Agregar Destino");
        inputPanel.add(addButton);

        // Área de visualización
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Acción del botón
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDestino();
            }
        });
    }

    /**
     * Agrega un destino basado en los datos ingresados por el usuario.
     */
    private void agregarDestino() {
        String nombre = nombreField.getText();
        String costoStr = costoField.getText();
        String extra = extraField.getText();
        String tipo = (String) tipoDestinoBox.getSelectedItem();

        if (nombre.isEmpty() || costoStr.isEmpty() || extra.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double costo = Double.parseDouble(costoStr);

            Destino destino;
            if (tipo.equals("Ciudad")) {
                destino = new DestinoCiudad(nombre, costo, extra);
            } else {
                destino = new DestinoPlaya(nombre, costo, extra);
            }

            destinos.add(destino);
            actualizarLista();
            limpiarCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El costo debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Actualiza el área de visualización con los destinos registrados.
     */
    private void actualizarLista() {
        displayArea.setText("");
        for (Destino destino : destinos) {
            displayArea.append(destino.toString() + "\n");
        }
    }

    /**
     * Limpia los campos de entrada después de agregar un destino.
     */
    private void limpiarCampos() {
        nombreField.setText("");
        costoField.setText("");
        extraField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GestionDestinos app = new GestionDestinos();
            app.setVisible(true);
        });
    }
}
