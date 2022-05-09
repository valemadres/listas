public class  Nodo {
    private Nodo anterior ;
    private Object dato;
    private Nodo siguiente;

    public Nodo {

    }

    public Nodo getAnterior (){
        return anterior ;
    }
    public Object getDato(){
        return dato;
    }
    public void setDato (Object dato){
        this.dato = dato;
    }
    public Nodo  getSiguiente (){
        return siguiente;
    } 
    public void getSiguiente( Nodo siguiente){
        this.siguiente = siguiente;
    }
}