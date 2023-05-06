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

public class JPEGImageHandlerColors extends ImageHandler {

    File a;
    File b;
    File c;
    File s;
    int i;
    String nom; //Nombre de la foto
    BufferedImage imagR; //Imagen cargada
    BufferedImage imagG; //Imagen cargada
    BufferedImage imagB; //Imagen cargada
    BufferedImage imagS; //Imagen cargada
    Color[][] rojoM; //Matriz de pixeles rojos
    Color[][] verdeM; //Matriz de pixeles verdes
    Color[][] azulM; //Matriz de pixeles azules
    Color[][] sepiaM; //Matriz de pixeles azules

    public JPEGImageHandlerColors(String filename) {
        super(filename);
        a = fotoModificar;
        b = fotoModificar;
        c = fotoModificar;
        s = fotoModificar;
    }

    @Override
    public void readFile() throws Exception {
        //Convertir la imagen a jpeg
        i = a.getName().lastIndexOf(".");
        nom = a.getName().substring(0, i);
        try {
            FileInputStream entrada1 = new FileInputStream(a);
            FileInputStream entrada2 = new FileInputStream(b);
            FileInputStream entrada3 = new FileInputStream(c);
            FileInputStream entrada4 = new FileInputStream(s);
            FileOutputStream salida1 = new FileOutputStream("temp/convertedR-" + nom + ".bmp");
            FileOutputStream salida2 = new FileOutputStream("temp/convertedG-" + nom + ".bmp");
            FileOutputStream salida3 = new FileOutputStream("temp/convertedB-" + nom + ".bmp");
            FileOutputStream salida4 = new FileOutputStream("temp/convertedS-" + nom + ".bmp");
            BufferedImage imagen1 = ImageIO.read(entrada1);
            BufferedImage imagen2 = ImageIO.read(entrada2);
            BufferedImage imagen3 = ImageIO.read(entrada3);
            BufferedImage imagen4 = ImageIO.read(entrada4);
            ImageIO.write(imagen1, "bmp", salida1);
            ImageIO.write(imagen2, "bmp", salida2);
            ImageIO.write(imagen3, "bmp", salida3);
            ImageIO.write(imagen4, "bmp", salida4);
            salida1.close();
            salida2.close();
            salida3.close();
            salida4.close();
            entrada1.close();
            entrada2.close();
            entrada3.close();
            entrada4.close();
        } catch (IOException c) {
        }
        //Cargar imagen y crear matriz de pixeles
        imagR = ImageIO.read(new File("temp/convertedR-" + nom + ".bmp"));
        imagG = ImageIO.read(new File("temp/convertedG-" + nom + ".bmp"));
        imagB = ImageIO.read(new File("temp/convertedB-" + nom + ".bmp"));
        imagS = ImageIO.read(new File("temp/convertedS-" + nom + ".bmp"));

        rojoM = new Color[imagR.getWidth()][imagR.getHeight()];
        verdeM = new Color[imagB.getWidth()][imagB.getHeight()];
        azulM = new Color[imagG.getWidth()][imagG.getHeight()];
        sepiaM = new Color[imagS.getWidth()][imagS.getHeight()];
        System.out.println("Progreso");
        for (int i = 0; i < imagR.getWidth(); i++) {
            for (int j = 0; j < imagR.getHeight(); j++) {
                int pixels = imagR.getRGB(i, j);
                String pixelB = Integer.toBinaryString(pixels);
                System.out.println(pixelB);
                //Componentes de color en bits
                String alphaB = pixelB.substring(0, 8);
                String rojoB = pixelB.substring(8, 16);
                String verdeB = pixelB.substring(16, 24);
                String azulB = pixelB.substring(24, 32);

                //Colores en bits
                int Rojo = Integer.parseInt(rojoB, 2);
                int Verde = Integer.parseInt(verdeB, 2);
                int Azul = Integer.parseInt(azulB, 2);
                int Alpha = Integer.parseInt(alphaB, 2);

                //Sepia
                int RojoS = (int) ((0.393 * Rojo) + (0.769 * Verde) + (0.189 * Azul));
                int VerdeS = (int) ((0.349 * Rojo) + (0.686 * Verde) + (0.168 * Azul));
                int AzulS = (int) ((0.272 * Rojo) + (0.534 * Verde) + (0.131 * Azul));

                if (RojoS > 255) {
                    RojoS = 255;
                }

                if (VerdeS > 255) {
                    VerdeS = 255;
                }

                if (AzulS > 255) {
                    AzulS = 255;
                }

                //Colores convertidos
                Color rojo = new Color(Rojo, 0, 0);
                Color verde = new Color(0, Verde, 0);
                Color azul = new Color(0, 0, Azul);
                Color sepia = new Color(RojoS, VerdeS, AzulS);

                //Meter a Matriz de colores
                rojoM[i][j] = rojo;
                verdeM[i][j] = verde;
                azulM[i][j] = azul;
                sepiaM[i][j] = sepia;
            }
        }

    }

    @Override
    public void generateFiles() throws Exception {
        //Foto Roja
        FileOutputStream FotoRoja = new FileOutputStream("imágenesC/Red-" + nom + ".jpeg");
        for (int i = 0; i < imagR.getWidth(); i++) {
            for (int j = 0; j < imagR.getHeight(); j++) {
                imagR.setRGB(i, j, rojoM[i][j].getRGB());
            }
        }
        ImageIO.write(imagR, "jpeg", FotoRoja);
        FotoRoja.close();

        //Foto Verde
        FileOutputStream FotoVerde = new FileOutputStream("imágenesC/Green-" + nom + ".jpeg");
        for (int i = 0; i < imagG.getWidth(); i++) {
            for (int j = 0; j < imagG.getHeight(); j++) {
                imagG.setRGB(i, j, verdeM[i][j].getRGB());
            }
        }
        ImageIO.write(imagG, "jpeg", FotoVerde);
        FotoVerde.close();

        //Foto Azul
        FileOutputStream FotoAzul = new FileOutputStream("imágenesC/Blue-" + nom + ".jpeg");
        for (int i = 0; i < imagB.getWidth(); i++) {
            for (int j = 0; j < imagB.getHeight(); j++) {
                imagB.setRGB(i, j, azulM[i][j].getRGB());
            }
        }
        ImageIO.write(imagB, "jpeg", FotoAzul);
        FotoAzul.close();

        //Foto Sepia
        FileOutputStream FotoSepia = new FileOutputStream("imágenesC/Sepia-" + nom + ".jpeg");
        for (int i = 0; i < imagS.getWidth(); i++) {
            for (int j = 0; j < imagS.getHeight(); j++) {
                imagS.setRGB(i, j, sepiaM[i][j].getRGB());
            }
        }
        ImageIO.write(imagS, "jpeg", FotoSepia);
        JOptionPane.showMessageDialog(null, "Éxito en la operación.", "", JOptionPane.INFORMATION_MESSAGE);
        FotoSepia.close();
    }

}
