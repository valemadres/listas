import listas_nodo;

public class Main {
    public static void main (String [] args){
        listas_nodo listas_nodo= new listas_nodo();
        System.out.prirtln(listas_nodo.estaVacia());
        for (int i = 1 ; i <= 5 ;i++){
            listas_nodo.insertarFinal(i);
        }
        listas_nodo.mostrar();
        listas_nodo.eliminarFinal();
        listas_nodo.eliminarFinal();
        listas_nodo.mostrar();
        
        listas_nodo.mostrarAdelante(vueltas: 4);
        listas_nodo.mostrarAtras(vueltas4);
    }
}