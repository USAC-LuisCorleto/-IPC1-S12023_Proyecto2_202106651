package Biblioteca;

public class ListaDobleE extends Listas {

    public Nodo cabecera;
    public int tamaño;

    public ListaDobleE(String nom) {
        cabecera = null;
        tamaño = 0;
        nombre = nom;
        add(new ListaCDobleE("General"));
    }

    @Override
    public void add(Object e) {
        if (cabecera == null) {
            cabecera = new Nodo(e);
        } else {
            Nodo temp = cabecera;
            Nodo CNueva = new Nodo(e);
            CNueva.setSiguiente(temp);
            temp.setAnterior(CNueva);
            cabecera = CNueva;
        }
        tamaño++;
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object find(Object e) {
        int indice;
        Nodo nodotemp = cabecera;
        String nomtemp = nodotemp.Contenido.nombre;
        int c1 = 1;
        while (nomtemp.equals((String) e) == false) {
            if (c1 == tamaño) {
                c1 = -1;
                break;
            }
            nodotemp = nodotemp.getSiguiente();
            nomtemp = nodotemp.Contenido.nombre;
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
        Nodo temp = cabecera;
        Nodo fin = cabecera;
        Integer indice = (Integer) e;

        if (indice == 1 && tamaño == 1) {
            cabecera = null;
        } else {
            if (indice == 1) {
                temp = temp.getSiguiente();
                cabecera = temp;
                cabecera.setAnterior(null);
                tamaño--;
            } else {
                if (indice == tamaño) {

                    int con = 1;
                    while (con != indice) {
                        fin = fin.getSiguiente();
                        con++;
                    }
                    fin = fin.getAnterior();
                    fin.setSiguiente(null);
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
