package Actividades_Ivan_Tema2.ActividadesClase.Practicas.Parking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {

        ArrayList<Coches> listadoCoches = new ArrayList<>();

        for (int i=0;i<40;i++){

            Coches coche = new Coches("Honda","Matricula DK"+i);
            listadoCoches.add(coche);
        }

        MonitorGaraje monitorGaraje = new MonitorGaraje(listadoCoches);
        OcuparPlazas oc = new OcuparPlazas(monitorGaraje);
        LiberarPlazas lib = new LiberarPlazas(monitorGaraje);

        Thread ocupar = new Thread(oc);
        Thread liberar = new Thread(lib);


        ocupar.start();

        liberar.start();



        System.out.println("Todos los coches han salido del garaje ¡Hasta pronto!");

    }

}
