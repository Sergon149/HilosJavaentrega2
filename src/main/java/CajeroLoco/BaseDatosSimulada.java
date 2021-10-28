package CajeroLoco;

public class BaseDatosSimulada {

    private static int saldo= 100;

    private static int obtenerSaldo() throws InterruptedException {
        long sleepingTime =(long) (Math.random()*1000);
        Thread.sleep(sleepingTime);
        return saldo;
    }

    private static void actualizarSaldo(int saldo) throws InterruptedException {
        long sleepingTime =(long) (Math.random()*1000);
        Thread.sleep(sleepingTime);
        BaseDatosSimulada.saldo=saldo;
    }

    public static int sacarDinero(int cantidad) throws InterruptedException {
        int saldo = obtenerSaldo();
        if(saldo - cantidad>=0){
            actualizarSaldo(saldo-cantidad);
            System.out.println("Se ha entregado al cliente "+cantidad+"€");
            return cantidad;
        }else{
            System.out.println("No habia cantidad de € suficientes");
            return 0;

        }
    }

    public static void imprimirSaldo(){
        System.out.println("En la base de datos actualmente tenemos "+ saldo + "€");
    }




}
