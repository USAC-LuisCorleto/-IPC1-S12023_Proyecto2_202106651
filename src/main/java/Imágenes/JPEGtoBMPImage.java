package Imágenes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import static Imágenes.Editor.fotoModificar;

public class JPEGtoBMPImage extends ImageHandler {

    File a;
    int i;
    String nom;
    FileInputStream entrada;
    FileOutputStream salida;
    BufferedImage imagen;

    public JPEGtoBMPImage(String filename) {
        super(filename);
        a = fotoModificar;
    }

    @Override
    public void readFile() throws Exception {
        i = a.getName().lastIndexOf(".");
        nom = a.getName().substring(0, i);
    }

    @Override
    public void generateFiles() throws Exception {
        System.out.println("Prueba1");
        try {
            System.out.println("Prueba2");
            try ( FileInputStream Entrada = new FileInputStream(a);  FileOutputStream Salida = new FileOutputStream("Copia JPEG BMP/converted-" + nom + ".bmp")) {
                System.out.println("Prueba3");
                BufferedImage Imágen = ImageIO.read(Entrada);
                ImageIO.write(Imágen, "bmp", Salida);
                JOptionPane.showMessageDialog(null, "Operación realizada", "", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException c) {

        }
    }

}
