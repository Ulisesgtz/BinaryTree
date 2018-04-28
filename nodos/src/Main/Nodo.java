package Main;

import javax.swing.*;

public class Nodo {


    public static void main(String [] args){
        int opcion = 0;
        int elemento;
        String nombre;
        ArbolBinario arbol =new ArbolBinario();
        do {
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "" +
                        "1. Agregar nodo\n" +
                        "2. Recorrer el Arbol InOrder\n"+
                        "3. Recorrer el Arbol PreOrden\n"+
                        "4. Recorrer el Arbol PostOrden\n"+
                        "5. Salir \n" +
                        "Elige una opcion ","Arboles Binarios",JOptionPane.QUESTION_MESSAGE));
                switch (opcion){
                    case  1 :
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero del nodo"
                        ,"Agregando Nodo",JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del Nodo","Agregando Nodo",JOptionPane.QUESTION_MESSAGE);
                        arbol.agregarNodo(elemento,nombre);
                        break;
                    case 2:
                        if(!arbol.estaVacio()) {
                            arbol.inOrden(arbol.raiz);
                        }else {
                            JOptionPane.showMessageDialog(null, "El Arbol Esta Vacio","Vacio",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(!arbol.estaVacio()) {
                            arbol.preOrden(arbol.raiz);
                        }else {
                            JOptionPane.showMessageDialog(null, "El Arbol Esta Vacio","Vacio",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!arbol.estaVacio()) {
                            arbol.postOrder(arbol.raiz);
                        }else {
                            JOptionPane.showMessageDialog(null, "El Arbol Esta Vacio","Vacio",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5 :
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada","Fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default: JOptionPane.showMessageDialog(null, "Opcion incorrecta","¡Cuidado!",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null ,"error "+n.getMessage());
            }
        }while (opcion !=5);

    }
}
