public class Nodo() {
    
    //dato 
    Object dato;
    Nodo siguiente;

    //metodo constructor
    public Nodo(Object dato,Nodo siguiente){
        
        this.dato = dato;
        this.siguiente=siguiente;
    }
    public Object getDab(){
        return this.dab;
    }
    public void setDab (Object dab){
        this.dato=dab;
    }
    public  Nodo getSiguiente(){
        return this.siguiente;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }
}