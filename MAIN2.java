public class MAIN2{
    public static void main(String[] args) {
        ListasCirularesSimplementeEnlazadas ListasCirularesSimplementeEnlazadas = new ListasCirularesSimplementeEnlazadas();
        System.out.println(ListasCirularesSimplementeEnlazadas.estaVacia());
        System.out.println(ListasCirularesSimplementeEnlazadas.tamaño());

        for (int i = 1 ; i <= 12; i++){
            ListasCirularesSimplementeEnlazadas.insertarFIn(i);
        }
        ListasCirularesSimplementeEnlazadas.mostrar();
        System.out.println(ListasCirularesSimplementeEnlazadas.tamaño());


        //ListasCirularesSimplementeEnlazadas.eliminarFin();
        //ListasCirularesSimplementeEnlazadas.eliminarFin(),


        //ListasCirularesSimplementeEnlazadas.mostrar();
        ListasCirularesSimplementeEnlazadas.mostarCircular(vueltas:2);
}