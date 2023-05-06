package Biblioteca;

import java.io.File;
import java.io.Serializable;

public class ObjetosListaCDE implements Serializable {
    File ruta = null;
    Object contenidos = null;
    String nombreFoto = null;
    
    public ObjetosListaCDE(String nombre, Object contenido, File Ruta){
        this.contenidos = contenido;
        nombreFoto = nombre;
        ruta = Ruta;
    }
}
