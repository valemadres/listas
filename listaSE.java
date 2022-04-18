public class listaSE{

    Nodo inicio;
    //metodo constructor

public listaSE(){

    this.inicio=null;
    }
    //vacia?
public boolean estaVacia(){

    return inicio ==null;
}

    //tamaño de la lista
public int tamaño(){
    int contador=0;
    Nodo aux = inicio;

    while(aux !=null){
        contador ++;
        aux=aux.getSiguiente();
    }
    return contador;
}
public Object ultimoDato(){
    Nodo aux = inicio;
    while(aux.getSiguiente()!=null){
        aux=aux.getSiguiente;
    }
    return aux.getDab();
}
}