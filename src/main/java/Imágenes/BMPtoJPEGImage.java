package Imágenes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import static Imágenes.Editor.fotoModificar;

public class BMPtoJPEGImage extends ImageHandler {

    File a;
    int i;
    String nom;
    FileInputStream entrada;
    FileOutputStream salida;
    BufferedImage imagen;

    public BMPtoJPEGImage(String filename) {
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
        try {
            try ( FileInputStream Entrada = new FileInputStream(a);  FileOutputStream Salida = new FileOutputStream("Copia JPEG BMP/converted-" + nom + ".jpeg")) {
                BufferedImage Imágen = ImageIO.read(Entrada);
                ImageIO.write(Imágen, "jpeg", Salida);
                JOptionPane.showMessageDialog(null, "Operación realizada", "", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException c) {
            System.out.println("No funcionó");
        }
    }
}
