package entrega_supermercado;

import java.util.ArrayList;

public class Cliente extends Thread{
     ArrayList<Items> itemsCarrito = new ArrayList<>();
    int max=10;
    int numero = (int)(Math.random()*max+1);

    @Override
    public void run() {

        try {
            llenarCarrito();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Cajero2.cobrar(this);
    }

    public void llenarCarrito() throws InterruptedException {
    do{
        numero = (int)(Math.random()*max+1);
        Thread.sleep(1000);
        max-=1;
        itemsCarrito.add(new Items("Item"+Math.random(),(Math.random()*100)+1));
    }while(numero!=1);

    }
}
