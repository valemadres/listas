public class listas_deblementeEnlazadas{
    Nodo inicio;
public listas_deblementeEnlazadas(){
    inicio = null;
}
public boolean estaVacia(){
    return  inicio == null;
}
public void insertar(Object dato){
    if (estaVacia()){
        Nodo nuevo = new Nodo( anterior:null, dato , siguiente:null );
        inicio = nuevo;
    }else{
        inicio.setAnterior(nuevo);
        inicio = nuevo;
    }
    public void eliminar(){
        if (!vacia()){
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
        }
    }
    }
    public void mostrarAdelante(){
        if(!estaVacia()){
            Nodo temp  = inicio;
            while (temp != null){
                System.out.print(temp.getDab()+ "  ");

                temp = temp.getSiguiente();
            }
            System.out.println();
        }
    }
    public void mostrarAtras(){
        if (!estaVacia()){
            Nodo ultimo = inicio ;
            while(ultimo.getSiguiente() !null){
                ultimo = ultimo.getSiguiente();
            }
            Nodo temp = ultimo;
            while (temp !=null){
                System.out.print(temp.getDab()+ " ");
                temp = temp.get.Anterior();

            }
            System.out.println()
        }
    }
}
}