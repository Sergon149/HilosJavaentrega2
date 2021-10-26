package ejercicio_2;

import java.util.ArrayList;

public class Main {
    static ArrayList<Hilo> al= new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            Hilo aux = new Hilo("Hilo " + i);
            aux.start();
            al.add(aux);
        }
        System.out.println(escribirFinalistas());
        System.out.println(escribirSubCampeones());
    }


    public static String escribirFinalistas(){
        int campeon=sacarCampeon();
        String salida="";


        for (Hilo hilo : al){
            if(hilo.vecesrep==campeon)
                salida=salida.concat("El " +hilo.nombre+" se ha ejecutado "+hilo.vecesrep+"\n");

        }
        return "Hilos finalistas\n"+salida;
        }

    public static String escribirSubCampeones() {
        int campeon = sacarCampeon();
        int cont = 1;
        String salida = "";
        boolean salir = false;

        do {
            for (Hilo hilo : al) {
                if (hilo.vecesrep == campeon-cont){
                    salida = salida.concat("El " + hilo.nombre + " se ha ejecutado " + hilo.vecesrep + "\n");
                    salir = true;}
            }

            cont++;
        } while (!salir);
        return "Hilos subcampeones\n"+salida;

    }



    public static int sacarCampeon(){
        int campeon=0;
        for (Hilo hilo : al) {
            try {
                hilo.join();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(hilo.vecesrep>campeon)
                campeon=hilo.vecesrep;
        }
        return campeon;
    }


}

