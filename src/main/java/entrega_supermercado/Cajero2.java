package entrega_supermercado;
public class Cajero2 {
    static int salida_final=0;
    static int cont=0;
    public synchronized static void cobrar(Cliente cliente){
        int aux=0;

        for (int i =0; i<cliente.itemsCarrito.size();i++){
        aux+=cliente.itemsCarrito.get(i).precio;}
        salida_final+=aux;
        System.out.println("El cliente ha gastado "+aux);
        //System.out.println(cont);
        if (cont==9){
            System.out.println("En total se ha gastado: "+Cajero2.salida_final);
        }
        cont++;
    }


}
