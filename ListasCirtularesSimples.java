public class ListasCirularesSimplementeEnlazadas{
    private NOD inicio;
    public int tamaño(){
        int contador=0;
        if(!estaVacia()){
            NOD ultimo = inicio;
            while(ultimo.getSiguiente() != inicio){
                ultimo = ultimo.getSiguiente();
                contador++;
            }
            contador++;
        }
        return contador ;
    }
    public void insertarFIn(Object dato){
        if (!estaVacia()){
            NOD nuevo = new  NOD();
            nuevo.setDad(dato);
            nuevo.getSiguiente(nuevo);

            inicio = nuevo;
        }else{
            NOD nuevo = new NOD();
            nuevo.setDad(dato);
            nuevo.getSiguiente(inicio);
            NOD ultimo = inicio;
            while(ultimo.getSiguiente() ! = inicio){
                ultimo = ultimo.getSiguiente();
        }
        ultimo.getSiguiente(nuevo);
    }
}
    public void eliminarFin(){
        if(!estaVacia()){
        NOD penultimo = inicio;
            while(penultimo.getSiguiente().getSiguiente() != inicio){
                penultimo = penultimo.getSiguiente();
    }
        penultimo.setSiguiente(inicio);

    }
}
    public void mostrar(){
        if (!estaVacia()){
            NOD ultimo = inicio;
                while(ultimo.getSiguiente() ! = inicio){
                    System.out.print(ultimo.getDab()+ "  ");

                    ultimo = ultimo.getSiguiente();
            }
                System.out.print(ultimo.getDab()+ "  ");
                System.out.println();
    }
}

    public void mostarCircular(int vueltas){
        if (!estaVacia()){
            int contador = 0;
            
            NOD temp = inicio;
            while(temp != null && contador < (tamaño()  * vueltas)){
                System.out.print(temp.getDab()+ "  ");

                temp = temp.getSiguiente();

                contador++;
            }
            System.out.println();
    
        }
    }
}