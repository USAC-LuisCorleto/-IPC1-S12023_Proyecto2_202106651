package Biblioteca;

import static Biblioteca.VentanaPrincipal.i;
import static Biblioteca.VentanaPrincipal.j;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static Biblioteca.VentanaPrincipal.ContenedorFotografías;
import static Biblioteca.VentanaPrincipal.contenedorCategoríasLista;
import static Biblioteca.VentanaPrincipal.contenedorFotografíasLista;
import static Biblioteca.VentanaPrincipal.nombresCategorías;
import static Biblioteca.VentanaPrincipal.nombreFotos;
import static Biblioteca.VentanaPrincipal.nombreUsuarioIngresado;
import static Biblioteca.VentanaPrincipal.fotoFile;
import static Biblioteca.VentanaPrincipal.fotosBytes;
import static Biblioteca.VentanaPrincipal.nodo;

public class Biblioteca extends javax.swing.JFrame {

    public Biblioteca() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCat = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        mostrarCat = new javax.swing.JButton();
        agregarCat = new javax.swing.JButton();
        eliminarCat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        imagenAct = new javax.swing.JList<>();
        botónAnterior = new javax.swing.JButton();
        botónSiguiente = new javax.swing.JButton();
        Salida = new javax.swing.JLabel();
        botónSalir = new javax.swing.JButton();
        botónAg = new javax.swing.JButton();
        botónEl = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listaCat.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = nombresCategorías;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaCat);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("CATEGORÍAS");

        mostrarCat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mostrarCat.setText("MOSTRAR CATEGORÍA");
        mostrarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCatActionPerformed(evt);
            }
        });

        agregarCat.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        agregarCat.setText("Agregar");
        agregarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCatActionPerformed(evt);
            }
        });

        eliminarCat.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        eliminarCat.setText("Eliminar");
        eliminarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCatActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText(nombreUsuarioIngresado);

        imagenAct.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = nombreFotos;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(imagenAct);

        botónAnterior.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botónAnterior.setText("<");
        botónAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botónAnteriorActionPerformed(evt);
            }
        });

        botónSiguiente.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botónSiguiente.setText(">");
        botónSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botónSiguienteActionPerformed(evt);
            }
        });

        botónSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botónSalir.setText("Cerrar sesión");
        botónSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botónSalirActionPerformed(evt);
            }
        });

        botónAg.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        botónAg.setText("Agregar imágen");
        botónAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botónAgActionPerformed(evt);
            }
        });

        botónEl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        botónEl.setText("Eliminar imágen");
        botónEl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botónElActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Foto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(mostrarCat, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(agregarCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eliminarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(botónAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Salida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(botónSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(91, 91, 91)
                                    .addComponent(botónAg)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                                    .addComponent(botónSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(90, 90, 90)
                                    .addComponent(botónEl)
                                    .addGap(11, 11, 11))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(103, 103, 103)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(NF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(62, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(NF, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(242, 242, 242)
                        .addComponent(botónAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(220, 220, 220)
                                        .addComponent(botónSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botónAg)
                                    .addComponent(botónEl)
                                    .addComponent(botónSalir)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mostrarCat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(eliminarCat)
                                    .addComponent(agregarCat))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botónSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botónSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botónSalirActionPerformed

    private void agregarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCatActionPerformed
        AgregarCategoría A = new AgregarCategoría();
        A.setVisible(true);
        A.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_agregarCatActionPerformed

    private void mostrarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCatActionPerformed
        String s = (String) listaCat.getSelectedValue();
        Salida.setIcon(null);
        NF.setText("");
        int p = (int) contenedorCategoríasLista.find(s);

        if (p == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una categoría en la lista antes de continuar.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            int i = 1;
            ContenedorFotografías = contenedorCategoríasLista.cabecera;
            while (i != p) {
                ContenedorFotografías = ContenedorFotografías.getSiguiente();
                i++;
            }

            contenedorFotografíasLista = (ListaCDobleE) ContenedorFotografías.Contenido;
            nodo = contenedorFotografíasLista.cabecera;
            //Añadir a pantalla
            j = contenedorFotografíasLista.getSize();
            nombreFotos = new String[j];

            int u = 0;
            Nodo aux1 = contenedorFotografíasLista.cabecera;
            while (u < contenedorFotografíasLista.tamaño) {
                nombreFotos[u] = aux1.contenido.nombreFoto;
                aux1 = aux1.getSiguiente();
                u++;

                imagenAct.setListData(nombreFotos);

                //Añadir imagen a la pantalla
                if (contenedorFotografíasLista.cabecera.contenido.contenidos == null) {

                } else {
                    try {
                        ByteArrayInputStream x = new ByteArrayInputStream((byte[]) contenedorFotografíasLista.cabecera.contenido.contenidos);
                        BufferedImage imagen = ImageIO.read(x);

                        ImageIcon imp = new ImageIcon(imagen);
                        Image image = imp.getImage();
                        Image nimp = image.getScaledInstance(600, 373, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
                        imp = new ImageIcon(nimp);
                        NF.setText(contenedorFotografíasLista.cabecera.contenido.nombreFoto);
                        Salida.setIcon(imp);

                    } catch (IOException e) {

                    }
                }
            }
        }
    }//GEN-LAST:event_mostrarCatActionPerformed

    private void eliminarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCatActionPerformed
        String s = (String) listaCat.getSelectedValue();
        Salida.setIcon(null);
        NF.setText("");
        int p = (int) contenedorCategoríasLista.find(s);
        if (s.equals("General")) {
            JOptionPane.showMessageDialog(null, "La categoría General no puede ser eliminada", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            if (p == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione una categoría para poder eliminarla", "Error", JOptionPane.WARNING_MESSAGE);
            } else {

                if (contenedorFotografíasLista.nombre.equals(s) && !(contenedorFotografíasLista.nombre.equals("General"))) {
                    contenedorFotografíasLista = null;
                }
                contenedorCategoríasLista.delete(p);
                i = contenedorCategoríasLista.getSize();
                nombresCategorías = new String[i];

                int j = 0;
                Nodo aux1 = contenedorCategoríasLista.cabecera;
                while (j < contenedorCategoríasLista.tamaño) {
                    nombresCategorías[j] = aux1.Contenido.nombre;
                    aux1 = aux1.getSiguiente();
                    j++;
                }
                listaCat.setListData(nombresCategorías);

                if (contenedorFotografíasLista == null) {

                } else {
                    if (contenedorFotografíasLista.cabecera.contenido == null) {

                    } else {
                        try {
                            ByteArrayInputStream x = new ByteArrayInputStream((byte[]) contenedorFotografíasLista.cabecera.contenido.contenidos);
                            BufferedImage imagen = ImageIO.read(x);

                            ImageIcon imp = new ImageIcon(imagen);
                            Image image = imp.getImage();
                            Image nimp = image.getScaledInstance(600, 373, java.awt.Image.SCALE_SMOOTH);
                            imp = new ImageIcon(nimp);
                            NF.setText(contenedorFotografíasLista.cabecera.contenido.nombreFoto);
                            Salida.setIcon(imp);

                        } catch (IOException e) {

                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_eliminarCatActionPerformed

    private void botónAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botónAgActionPerformed
        if (contenedorFotografíasLista == null) {
            JOptionPane.showMessageDialog(null, "Debe abrir una categoría para poder agregar imágenes", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            JFileChooser A = new JFileChooser();
            A.setMultiSelectionEnabled(true);
            A.setFileSelectionMode(JFileChooser.FILES_ONLY);

            FileNameExtensionFilter img = new FileNameExtensionFilter("Archivos JPG & JPEG", "jpg", "jpeg");
            A.setFileFilter(img);

            int s = A.showOpenDialog(this);

            if (s != JFileChooser.CANCEL_OPTION) {

                fotoFile = A.getSelectedFiles();

                try {
                    imagenAct.setListData(nombreFotos);
                    JOptionPane.showMessageDialog(null, "Seleccione de nuevo la categoría", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    for (int n = 0; n < fotoFile.length; n++) {
                        BufferedImage Imagen = ImageIO.read(fotoFile[n]);
                        ByteArrayOutputStream b = new ByteArrayOutputStream();
                        ImageIO.write(Imagen, "jpg", b);
                        fotosBytes = b.toByteArray();

                        contenedorFotografíasLista.add(new ObjetosListaCDE(fotoFile[n].getName(), fotosBytes, fotoFile[n]));
                        int imagenm = (int) contenedorFotografíasLista.find(fotoFile[n].getName()); //Guardar en un objeto para imprimir
                        int e = 1;
                        Nodo Imagenm = contenedorFotografíasLista.cabecera;

                        while (e != imagenm) {
                            Imagenm = Imagenm.getSiguiente();
                            e++;

                            j = contenedorFotografíasLista.getSize();
                            nombreFotos = new String[j];
                            int u = 0;
                            Nodo aux1 = contenedorFotografíasLista.cabecera;
                            while (u < contenedorFotografíasLista.tamaño) {
                                nombreFotos[u] = aux1.contenido.nombreFoto;
                                aux1 = aux1.getSiguiente();
                                u++;
                                imagenAct.setListData(nombreFotos);
                            }
                        }
                    }
                } catch (IOException c) {
                }
            }
        }
    }//GEN-LAST:event_botónAgActionPerformed

    private void botónElActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botónElActionPerformed
        String s = (String) imagenAct.getSelectedValue();
        if (contenedorFotografíasLista == null) {
            JOptionPane.showMessageDialog(null, "Abra la categoría en donde se encuentra la imagen que desea eliminar.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            if (contenedorFotografíasLista.cabecera == null) {
                JOptionPane.showMessageDialog(null, "No hay objetos por eliminar.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            } else {
                int p = (int) contenedorFotografíasLista.find(s);
                if (p == -1) {
                    JOptionPane.showMessageDialog(null, "No hay ninguna foto seleccionada. Seleccione una de la lista.", "Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    Salida.setIcon(null);
                    NF.setText("");
                    contenedorFotografíasLista.delete(p);

                    if (contenedorFotografíasLista.getSize() == 0) {
                        j = contenedorFotografíasLista.getSize();
                        nombreFotos = new String[j];
                        imagenAct.setListData(nombreFotos);

                    } else {

                        j = contenedorFotografíasLista.getSize();
                        nombreFotos = new String[j];
                        int u = 0;
                        Nodo aux1 = contenedorFotografíasLista.cabecera;
                        while (u < contenedorFotografíasLista.tamaño) {
                            nombreFotos[u] = aux1.contenido.nombreFoto;
                            aux1 = aux1.getSiguiente();
                            u++;
                        }
                        imagenAct.setListData(nombreFotos);

                    }
                    if (contenedorFotografíasLista.cabecera == null) {

                    } else {
                        try {
                            ByteArrayInputStream x = new ByteArrayInputStream((byte[]) contenedorFotografíasLista.cabecera.contenido.contenidos);
                            BufferedImage imagen = ImageIO.read(x);

                            ImageIcon imp = new ImageIcon(imagen);
                            Image image = imp.getImage();
                            Image nimp = image.getScaledInstance(600, 373, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
                            imp = new ImageIcon(nimp);
                            NF.setText(contenedorFotografíasLista.cabecera.contenido.nombreFoto);
                            Salida.setIcon(imp);

                        } catch (IOException e) {

                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_botónElActionPerformed

    private void botónSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botónSiguienteActionPerformed
        if (nodo == null) {

        } else {
            try {
                Salida.setIcon(null);
                NF.setText("");
                nodo = nodo.getSiguiente();
                ByteArrayInputStream x = new ByteArrayInputStream((byte[]) nodo.contenido.contenidos);
                BufferedImage imagen = ImageIO.read(x);

                ImageIcon imp = new ImageIcon(imagen);
                Image image = imp.getImage();
                Image nimp = image.getScaledInstance(600, 373, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
                imp = new ImageIcon(nimp);
                NF.setText(nodo.contenido.nombreFoto);
                Salida.setIcon(imp);

            } catch (IOException e) {

            }
        }
    }//GEN-LAST:event_botónSiguienteActionPerformed

    private void botónAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botónAnteriorActionPerformed
        if (nodo == null) {

        } else {
            try {
                Salida.setIcon(null);
                NF.setText("");
                nodo = nodo.getAnterior();
                ByteArrayInputStream x = new ByteArrayInputStream((byte[]) nodo.contenido.contenidos);
                BufferedImage imagen = ImageIO.read(x);

                ImageIcon imp = new ImageIcon(imagen);
                Image image = imp.getImage();
                Image nimp = image.getScaledInstance(600, 373, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
                imp = new ImageIcon(nimp);
                NF.setText(nodo.contenido.nombreFoto);
                Salida.setIcon(imp);

            } catch (IOException e) {

            }
        }
    }//GEN-LAST:event_botónAnteriorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JLabel NF;
    protected static javax.swing.JLabel Salida;
    private javax.swing.JButton agregarCat;
    private javax.swing.JButton botónAg;
    private javax.swing.JButton botónAnterior;
    private javax.swing.JButton botónEl;
    private javax.swing.JButton botónSalir;
    private javax.swing.JButton botónSiguiente;
    private javax.swing.JButton eliminarCat;
    private javax.swing.JList<String> imagenAct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaCat;
    private javax.swing.JButton mostrarCat;
    // End of variables declaration//GEN-END:variables
}