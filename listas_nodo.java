public class listas_nodo {
    Nodo inicio;

}
public listas_nodo(){
    inicio=null;

}

public boolean estaVacia(){
    return inicio == null;

}
public void insertarFinal(Object dato){
    if (estaVacia()){
        Nodo nuevo = new Nodo();
        nuevo.setAnterior(nuevo);
        nuevo.setDato(dato);
        nuevo.setSiguiente(nuevo);

        inicio = nuevo;
    }else{
        Nodo ultimo = inicio;
        while( ultimo.getSiguiente() != inicio){
            ultimo = ultimo.getSiguiente();
        }

        Nodo nuevo = new Nodo();
        nuevo.setAnterior(ultimo);
        nuevo.setDato(dato);
        nuevo.setSiguiente(inicio);

        ultimo.setSiguiente(nuevo);
        inicio.setAnterior(nuevo);
    }
}
public void eliminarFinal(){
    if (!estaVacia()){
        Nodo ultimo = inicio;
        while(ultimo.setSiguiente() !=inicio){
            ultimo = ultimo.getSiguiente();
        }

        Nodo penultimo = ultimo.setAnterior();
        penultimo.setSiguiente(inicio);

        inicio.setAnterior(penultimo);
    }
}
public void mostrar(){
    if (!estaVacia());
    Nodo temp = inicio;
    while ( temp.getSiguiente() != inicio){
        System.out.prirtn(temp.getDato() + " ");

        temp= temp.getSiguiente();

    }
    System.out.prirtln(tem.getDato ());
}
public void mostrarAdelante(int vueltas){
    if(!estaVacia(){
        Nodo temp =inicio;
        int  contador = 0; 
        while ( contador< vueltas){
            if (temp.getSiguiente() ==inicio){
                contador++;
            }
            System.out.prirtln();
        }
    }
}
public void mostrarAtras(int vueltas){
    if(!estaVacia(){
        Nodo temp =inicio.getSiguiente();
        int  contador = 0; 
        while ( contador < vueltas){
            if (temp.getAnterior() ==inicio){
                contador++;
            }
            System.out.prirtln(temp.getDato() + " ");
            temp = temp.getAnterior();
        }
        System.out.prirtln(temp.getDato())
    }
}