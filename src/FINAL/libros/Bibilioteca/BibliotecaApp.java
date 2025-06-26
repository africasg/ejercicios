package FINAL.libros.Bibilioteca;

import FINAL.libros.Libro;
import FINAL.libros.LibroFiccion;
import FINAL.libros.LibroNoFiccion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa la interfaz gráfica de usuario para gestionar los libros.
 */

public class BibliotecaApp {
    private List<Libro> libros; // Lista para almacenar los libros
    private JTextArea areaTexto; // Área para mostrar los libros registrados
    private JTextField campoTitulo; // Campo de entrada para el título
    private JTextField campoAutor; // Campo de entrada para el autor

    public BibliotecaApp() {
        libros = new ArrayList<>();
        inicializarUI();
    }

    /**
     * Inicializa la interfaz gráfica de usuario.
     */
    private void inicializarUI() {
        JFrame ventana = new JFrame("Gestión de Libros");
        ventana.setSize(500, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        // Panel superior para los campos de entrada
        JPanel panelEntrada = new JPanel(new GridLayout(2, 2));
        panelEntrada.add(new JLabel("Título:"));
        campoTitulo = new JTextField();
        panelEntrada.add(campoTitulo);
        panelEntrada.add(new JLabel("Autor:"));
        campoAutor = new JTextField();
        panelEntrada.add(campoAutor);
        ventana.add(panelEntrada, BorderLayout.NORTH);

        // Panel central para el área de texto
        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaTexto);
        ventana.add(scrollPane, BorderLayout.CENTER);

        // Panel inferior para los botones
        JPanel panelBotones = new JPanel();
        JButton botonAgregarFiccion = new JButton("Agregar Ficción");
        JButton botonAgregarNoFiccion = new JButton("Agregar No Ficción");
        panelBotones.add(botonAgregarFiccion);
        panelBotones.add(botonAgregarNoFiccion);
        ventana.add(panelBotones, BorderLayout.SOUTH);

        // Acciones para los botones
        botonAgregarFiccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarLibro(new LibroFiccion(campoTitulo.getText(), campoAutor.getText()));
            }
        });

        botonAgregarNoFiccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarLibro(new LibroNoFiccion(campoTitulo.getText(), campoAutor.getText()));
            }
        });

        ventana.setVisible(true);
    }

    /**
     * Agrega un libro a la lista y actualiza el área de texto.
     *
     * @param libro el libro a agregar.
     */
    private void agregarLibro(Libro libro) {
        if (libro.getTitulo().isEmpty() || libro.getAutor().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;
        }
        libros.add(libro);
        actualizarAreaTexto();
        limpiarCampos();
    }

    /**
     * Actualiza el área de texto con la lista de libros registrados.
     */
    private void actualizarAreaTexto() {
        StringBuilder builder = new StringBuilder();
        for (Libro libro : libros) {
            builder.append(libro.toString()).append("\n");
        }
        areaTexto.setText(builder.toString());
    }

    /**
     * Limpia los campos de entrada de texto.
     */
    private void limpiarCampos() {
        campoTitulo.setText("");
        campoAutor.setText("");
    }
}