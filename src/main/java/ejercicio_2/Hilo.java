package ejercicio_2;

import java.util.Random;

public class Hilo extends Thread {

    public String nombre;
    public long aux;
    public int vecesrep;
    boolean salida;
    public Hilo(String nombre){ this.nombre=nombre; }


    @Override
    public void run() {
        aux=System.currentTimeMillis();
        Random r = new Random();


        try {
            Thread.sleep(1000);
            vecesrep=1;
            salida=r.nextBoolean();
            while(salida) {
                Thread.sleep(1000);
                salida=r.nextBoolean();
                vecesrep++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Soy el hilo "+nombre+ " y me he repetido: " +vecesrep+ " veces");

    }
}
