

public class nodo{
    private Nodo  anterior;
    private Object dato;
    private Nodo siguiente;
public nodo (Nodo anterior,Object dato,Nodo siguiente){
    this.anterior = anterior;
    this.dato = dato;
    this.siguiente = siguiente;
}
public Nodo getAnterior(){

    return anterior;

}
public void setAnterior(Nodo anterior){
    this.anterior = anterior;   
}
