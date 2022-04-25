import listas_deblementeEnlazadas;
public class Main{
    public static void main(String[] args) {
        listas_deblementeEnlazadas listas_deblementeEnlazadas = new listas_deblementeEnlazadas();
        System.out.println(listas_deblementeEnlazadas.estaVacia());

        for (int i = 20; i > 0; i--){
            listas_deblementeEnlazadas.insertar(i);
        }
        System.out.println(listas_deblementeEnlazadas.estaVacia());
        listas_deblementeEnlazadas.mostrarAdelante();

        listas_deblementeEnlazadas.eliminar();
        listas_deblementeEnlazadas.eliminar();

        listas_deblementeEnlazadas.mostrarAdelante();
        listas_deblementeEnlazadas.mostrarAtras();
    }
}