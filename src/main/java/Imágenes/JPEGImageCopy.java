package Imágenes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import static Imágenes.Editor.fotoModificar;

public class JPEGImageCopy extends ImageHandler {

    File a;
    int i;
    String nom;
    protected byte[] filebytes;
    protected String copyname;

    public JPEGImageCopy(String imagename) {
        super(imagename);
        this.copyname = "copia-" + imagename;
        a = fotoModificar;
    }

    @Override
    public void readFile() throws Exception {
        try (FileInputStream input = new FileInputStream(a)) {
            filebytes = new byte[input.available()];
            input.read(filebytes);
        }
        System.out.println("Imagen leida: " + this.handledFileName);
    }

    @Override
    public void generateFiles() throws Exception {
        try (FileOutputStream output = new FileOutputStream("Copia JPEG BMP/" + copyname)) {
            output.write(filebytes);
        }
        System.out.println("Imagen generada: " + copyname);
        JOptionPane.showMessageDialog(null, "Éxito en la operación.", "", JOptionPane.INFORMATION_MESSAGE);
    }

}
