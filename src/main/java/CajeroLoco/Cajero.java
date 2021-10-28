package CajeroLoco;

public class Cajero extends Thread{

    private final int dineroASacar;
    private final int numeroTransaccion;

    public Cajero(int dineroASacar,int numeroTransaccion) {
        this.dineroASacar = dineroASacar;
        this.numeroTransaccion=numeroTransaccion;
    }


}
