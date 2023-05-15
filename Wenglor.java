import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

class Wenglor {
    public static void main(String[] args) {
        try {
            // Crea una instancia de la clase Robot
            Robot robot = new Robot();
            int i = 0;

            // Captura la pantalla completa
            Rectangle pantallaRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage captura = robot.createScreenCapture(pantallaRect);

            // Guarda la captura de pantalla en un archivo
            File archivoSalida = new File("./screenshoots/foto" + i + ".png");
            ImageIO.write(captura, "png", archivoSalida);

            System.out.println("Captura de pantalla guardada en: " + archivoSalida.getAbsolutePath());
            i++;
        } catch (AWTException ex) {
            System.err.println("Error al capturar la pantalla: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Error al guardar la captura de pantalla: " + ex.getMessage());
        }
    }

}
