package Biblioteca;

public class ListaSimple extends Listas {

    public Nodo cabecera;
    public int tamaño;

    public ListaSimple() {
        this.cabecera = null;
        this.tamaño = 0;
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    //Para acceder a la lista contenida tomar este metodo y sacarla con el metodo getContenido del nodo
    public Object find(Object e) {

        Nodo nodotemp = cabecera;

        if (tamaño == 0) {
            add(new ListaDobleE((String) e));
            nodotemp = (Nodo) find(e);
        } else {
            int c = 0; //Contador
            String nomtemp = cabecera.Contenido.nombre;
            while (nomtemp.equals(e) == false && c != (tamaño - 1)) {
                nodotemp = nodotemp.getSiguiente();
                nomtemp = nodotemp.Contenido.nombre;
                c++;
            }

            if (c == (tamaño - 1)) {
                add(new ListaDobleE((String) e));
                nodotemp = (Nodo) find(e);
            }

        }
        return nodotemp;

    }

    @Override
    public void add(Object e) {
        if (cabecera == null) {
            cabecera = new Nodo(e);
        } else {
            Nodo temp = cabecera;
            Nodo CNueva = new Nodo(e);
            CNueva.setSiguiente(temp);
            cabecera = CNueva;
        }
        tamaño++;
    }

}
