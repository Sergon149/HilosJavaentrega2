package entrega_supermercado;

public class Supermercado {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Cliente aux = new Cliente();
            aux.start();
        }
    }
}
