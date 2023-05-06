package Imágenes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import static Imágenes.Editor.fotoModificar;

public class JPEGImageHandlerRotator extends ImageHandler {

    File a;
    File b;
    int i;
    String nom; //Nombre de la foto
    BufferedImage imagH; //Imagen cargada
    BufferedImage imagR; //Imagen cargada
    int[][] HM; //Matriz de pixeles invertidos horizontales
    int[][] VM; //Matriz de pixeles invertidos verticales

    public JPEGImageHandlerRotator(String filename) {
        super(filename);
        a = fotoModificar;
        b = fotoModificar;
    }

    @Override
    public void readFile() throws Exception {
        //Convertir la imagen a jpeg
        i = a.getName().lastIndexOf(".");
        nom = a.getName().substring(0, i);
        try {
            FileInputStream entrada1 = new FileInputStream(a);
            FileInputStream entrada2 = new FileInputStream(b);
            FileOutputStream salida1 = new FileOutputStream("temp/convertedRV-" + nom + ".bmp");
            FileOutputStream salida2 = new FileOutputStream("temp/convertedRH-" + nom + ".bmp");
            BufferedImage imagen1 = ImageIO.read(entrada1);
            BufferedImage imagen2 = ImageIO.read(entrada2);
            ImageIO.write(imagen1, "bmp", salida1);
            ImageIO.write(imagen2, "bmp", salida2);
            salida1.close();
            salida2.close();
            entrada1.close();
            entrada2.close();
        } catch (IOException c) {
        }
        //Cargar imagen y crear matriz de pixeles
        imagH = ImageIO.read(new File("temp/convertedRV-" + nom + ".bmp"));
        imagR = ImageIO.read(new File("temp/convertedRH-" + nom + ".bmp"));

        HM = new int[imagH.getWidth()][imagH.getHeight()];
        VM = new int[imagR.getWidth()][imagR.getHeight()];
        System.out.println("Progreso");
        for (int i = 0; i < imagR.getWidth(); i++) {
            for (int j = 0; j < imagR.getHeight(); j++) {
                int pixels = imagR.getRGB(i, j);
                String pixelB = Integer.toBinaryString(pixels);
                System.out.println(pixelB);

                //Meter a Matriz de colores
                HM[i][(imagH.getHeight() - 1) - j] = pixels;
                VM[(imagR.getWidth() - 1) - i][j] = pixels;
            }
        }

    }

    @Override
    public void generateFiles() throws Exception {
        //Foto rotada horizontal
        FileOutputStream FotoH = new FileOutputStream("imágenesC/Hrotation-" + nom + ".jpeg");
        for (int i = 0; i < imagH.getWidth(); i++) {
            for (int j = 0; j < imagH.getHeight(); j++) {
                imagH.setRGB(i, j, HM[i][j]);
            }
        }
        ImageIO.write(imagH, "jpeg", FotoH);
        FotoH.close();

        //Foto Vertical
        FileOutputStream FotoV = new FileOutputStream("imágenesC/Vrotation-" + nom + ".jpeg");
        for (int i = 0; i < imagR.getWidth(); i++) {
            for (int j = 0; j < imagR.getHeight(); j++) {
                imagR.setRGB(i, j, VM[i][j]);
            }
        }
        ImageIO.write(imagR, "jpeg", FotoV);
        JOptionPane.showMessageDialog(null, "Éxito en la operación.", "", JOptionPane.INFORMATION_MESSAGE);
        FotoV.close();
    }
}
