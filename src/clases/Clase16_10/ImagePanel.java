package clases.Clase16_10;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

    public class ImagePanel extends JPanel {
        private Image image;
        public ImagePanel(String imagePath) {
            try {
// Cargamos la imagen desde fichero
                image = ImageIO.read(getClass().getResource(imagePath));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error loading image from: " + imagePath);
            }
        }
        // Sobrescribimos paintComponent para dibujar la imagen
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (image != null) {
                g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
            }
        }
    }
