package Main;

public class NodoArbol {

    private int dato;
    private String nombre;
    NodoArbol hijoIzquierdo, hijoDerecho;

    public NodoArbol(int dato, String nombre) {
        this.dato = dato;
        this.nombre = nombre;
        this.hijoIzquierdo= null;
        this.hijoDerecho = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoArbol getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbol hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbol getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbol hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public String ToString(){
        return nombre + " Su Dato es: "+ dato;
    }
}
