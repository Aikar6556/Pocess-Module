package Actividades_Ivan_Tema2.ActividadesClase.Practicas.Parking;


// Consumidor
public class OcuparPlazas implements Runnable {

    MonitorGaraje monitorGaraje;

    public OcuparPlazas(MonitorGaraje monitorGaraje) {
        this.monitorGaraje = monitorGaraje;
    }

    @Override
    public void run() {

        for (int i=0;i<40;i++){

            monitorGaraje.addCocheGaraje();



        }



    }
}
