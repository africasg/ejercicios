package clases.Clase16_10;


import javax.swing.*;

public class ImageApp {
        public static void main(String[] args) {
            // Crear el marco de la ventana
            JFrame frame = new JFrame("THIS IS MY DESIGN");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 600);
            // Crear una instancia de ImagePanel con el path a la imagen
            ImagePanel imagePanel = new ImagePanel("image.jpg");

            // Añadir el panel al marco
            frame.add(imagePanel);


            // Hacer visible la ventana
            frame.setVisible(true);
        }
}

