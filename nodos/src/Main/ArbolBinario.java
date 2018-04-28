package Main;

public class ArbolBinario {

    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }
    //Insert
    public void agregarNodo(int dato, String nombre){
        NodoArbol nuevoArbol = new NodoArbol(dato, nombre);
        if(raiz == null){
            raiz = nuevoArbol;
        }else {
            NodoArbol auxiliar  = raiz;
            NodoArbol padre;
            while (true){
                padre = auxiliar;
                if(dato < auxiliar.getDato()){
                    auxiliar = auxiliar.getHijoIzquierdo();
                    if (auxiliar==null){
                        padre.setHijoIzquierdo(nuevoArbol);
                        return;
                    }
                }else {
                    auxiliar = auxiliar.getHijoDerecho();
                    if (auxiliar==null){
                        padre.setHijoDerecho(nuevoArbol);
                        return;
                    }
                }
            }
        }
    }

    //checar arbol vacio
    public boolean estaVacio(){
        return  raiz == null;
    }
    //InOrder
    public void inOrden(NodoArbol r ){
        if (r != null){
            inOrden(r.getHijoIzquierdo());
            System.out.println(r.getDato());
            inOrden(r.getHijoDerecho());
        }

    }

    //PreOrden
    public void preOrden(NodoArbol r){
        if(r != null){
            System.out.println(r.getDato());
            preOrden(r.getHijoIzquierdo());
            preOrden(r.getHijoDerecho());
        }
    }

    //PostOrden
    public void postOrder(NodoArbol r){
        if(r != null){
            postOrder(r.getHijoIzquierdo());
            postOrder(r.getHijoDerecho());
            System.out.println(r.getDato());
        }
    }

}
