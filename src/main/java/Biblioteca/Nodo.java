package Biblioteca;

import java.io.Serializable;

public class Nodo implements Serializable{
    ObjetosListaCDE contenido;
    Listas Contenido;
    Nodo siguiente;
    Nodo anterior;
    
    public Nodo(Object contenido){
        this.Contenido = (Listas) contenido;
        this.siguiente = null;
        this.anterior = null;
    }
    
    public Nodo(Object a, Object b){
        this.contenido = (ObjetosListaCDE) a;
        this.siguiente = null;
        this.anterior = null;
    }
    
    public void setSiguiente (Nodo s){
        siguiente = s;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    
    public void setAnterior (Nodo a){
        anterior = a;
    }
    
    public Nodo getAnterior(){
        return anterior;
    }
    
    public Object getContenido(){
        return contenido;
    }
}