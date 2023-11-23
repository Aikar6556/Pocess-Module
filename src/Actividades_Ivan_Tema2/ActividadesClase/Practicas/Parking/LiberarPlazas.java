package Actividades_Ivan_Tema2.ActividadesClase.Practicas.Parking;


//Productor
public class LiberarPlazas implements Runnable {


    MonitorGaraje monitorGaraje;

    public LiberarPlazas(MonitorGaraje monitorGaraje) {
        this.monitorGaraje = monitorGaraje;
    }

    @Override
    public void run() {

        for (int i=0; i<40 ; i++){

            try {
                Thread.sleep(100+(long) (Math.random()*300));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            monitorGaraje.sacarCocheGaraje();





        }

    }
}
