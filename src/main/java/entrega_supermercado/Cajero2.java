package entrega_supermercado;

public class Cajero2 {

    public synchronized static int cobrar(Cliente cliente){
        int aux=0;
        for (int i =0; i<cliente.itemsCarrito.size();i++)
        aux+=cliente.itemsCarrito.get(i).precio;
    return aux;
    }


}
