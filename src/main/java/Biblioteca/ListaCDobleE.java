package Biblioteca;

import static Biblioteca.VentanaPrincipal.nodo;

public class ListaCDobleE extends Listas {

    public Nodo cabecera;
    public int tamaño;

    public ListaCDobleE(String nom) {
        cabecera = null;
        tamaño = 0;
        nombre = nom;
    }

    @Override
    public void add(Object e) {
        if (cabecera == null) {
            cabecera = new Nodo(e, e);
            cabecera.setSiguiente(cabecera);
            cabecera.setAnterior(cabecera);
            tamaño++;
        } else {
            Nodo temp = cabecera;
            Nodo fin = cabecera;

            for (int i = 1; i == tamaño; i++) {
                fin = fin.getSiguiente();
            }

            fin = fin.getAnterior();

            Nodo CNueva = new Nodo(e, e);
            CNueva.setSiguiente(temp);
            temp.setAnterior(CNueva);
            cabecera = CNueva;
            cabecera.setAnterior(fin);
            fin.setSiguiente(cabecera);
            tamaño++;
        }
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object find(Object e) {
        int indice;
        Nodo nodotemp = cabecera;
        String nomtemp = nodotemp.contenido.nombreFoto;
        int c1 = 1;
        while (nomtemp.equals((String) e) == false) {
            if (c1 == tamaño) {
                c1 = -1;
                break;
            }
            nodotemp = nodotemp.getSiguiente();
            nomtemp = nodotemp.contenido.nombreFoto;
            c1++;
        }
        indice = c1;
        return indice;
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getSize() {
        return tamaño;
    }

    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Object e) {
        Integer indice = (Integer) e;
        Nodo temp = cabecera;
        Nodo fin = cabecera;
        int con = 1;

        while (con != tamaño) {
            fin = fin.getSiguiente();
            con++;
        }

        if (indice == 1 && tamaño == 1) {
            cabecera = null;
            nodo = null;
            tamaño--;
        } else {
            if (indice == 1) {
                cabecera = cabecera.getSiguiente();
                fin.setSiguiente(cabecera);
                cabecera.setAnterior(fin);
                tamaño--;
            } else {
                if (indice == tamaño) {
                    fin = fin.getAnterior();
                    fin.setSiguiente(cabecera);
                    cabecera.setAnterior(fin);
                    tamaño--;
                } else {
                    int c = 1;
                    while (c < (indice - 1)) {
                        temp = temp.getSiguiente();
                        c++;
                    }
                    temp.setSiguiente(temp.getSiguiente().getSiguiente());
                    temp.getSiguiente().setAnterior(temp);
                    tamaño--;
                }
            }
        }
    }
}
