package Imágenes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import static Imágenes.Editor.fotoModificar;

public class JPEGImageHandlerBN extends ImageHandler {

    File a;
    int i;
    String nom; //Nombre de la foto
    BufferedImage imag; //Imagen cargada
    Color[][] BNM; //Matriz de pixeles rojos

    public JPEGImageHandlerBN(String filename) {
        super(filename);
        a = fotoModificar;
    }

    @Override
    public void readFile() throws Exception {
        //Convertir la imagen a jpeg
        i = a.getName().lastIndexOf(".");
        nom = a.getName().substring(0, i);
        try {
            FileInputStream entrada1 = new FileInputStream(a);
            FileOutputStream salida1 = new FileOutputStream("temp/convertedBN-" + nom + ".bmp");
            BufferedImage imagen1 = ImageIO.read(entrada1);
            ImageIO.write(imagen1, "bmp", salida1);
            salida1.close();
            entrada1.close();
        } catch (IOException c) {
        }
        //Cargar imagen y crear matriz de pixeles
        imag = ImageIO.read(new File("temp/convertedBN-" + nom + ".bmp"));
        BNM = new Color[imag.getWidth()][imag.getHeight()];
        System.out.println("Progreso");
        for (int i = 0; i < imag.getWidth(); i++) {
            for (int j = 0; j < imag.getHeight(); j++) {
                int pixels = imag.getRGB(i, j);
                String pixelB = Integer.toBinaryString(pixels);
                System.out.println(pixelB);
                //Componentes de color en bits
                String alphaB = pixelB.substring(0, 8);
                String rojoB = pixelB.substring(8, 16);
                String verdeB = pixelB.substring(16, 24);
                String azulB = pixelB.substring(24, 32);

                //Colores en bits
                int Rojo = (int) (Integer.parseInt(rojoB, 2) * 0.299);
                int Verde = (int) (Integer.parseInt(verdeB, 2) * 0.599);
                int Azul = (int) (Integer.parseInt(azulB, 2) * 0.111);
                int Alpha = Integer.parseInt(alphaB, 2);

                int Suma = Rojo + Verde + Azul;
                if (Suma > 255) {
                    Suma = 255;
                }
                //Colores convertidos
                Color BN = new Color(Suma, Suma, Suma);

                //Meter a Matriz de colores
                BNM[i][j] = BN;
            }
        }
    }

    @Override
    public void generateFiles() throws Exception {
        //Foto BN
        FileOutputStream FotoBN = new FileOutputStream("imágenesC/BN-" + nom + ".jpeg");
        for (int i = 0; i < imag.getWidth(); i++) {
            for (int j = 0; j < imag.getHeight(); j++) {
                imag.setRGB(i, j, BNM[i][j].getRGB());
            }
        }
        ImageIO.write(imag, "jpeg", FotoBN);
        JOptionPane.showMessageDialog(null, "Éxito en la operación.", "", JOptionPane.INFORMATION_MESSAGE);
        FotoBN.close();
    }

}
