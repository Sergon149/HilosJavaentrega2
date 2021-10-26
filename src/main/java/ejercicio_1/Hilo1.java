package ejercicio_1;

/*public class Hilo extends Thread {

    public String nombre;
    public long tiempoFinalizacion= System.currentTimeMillis();
    public long aux;

    public Hilo(String nombre){ this.nombre=nombre; }


    @Override
    public void run() {
        aux=System.currentTimeMillis();

        try {
            Thread.sleep((long) Main.getRandomTimeInMills());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Main.alOrdenada.add(this);
        System.out.println("Soy el hilo "+nombre+ " y me he dormido durante: " +(System.currentTimeMillis()-aux)+ " milisegundos");

    }
}
*/