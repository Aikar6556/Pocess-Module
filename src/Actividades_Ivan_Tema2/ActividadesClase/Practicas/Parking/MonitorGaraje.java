package Actividades_Ivan_Tema2.ActividadesClase.Practicas.Parking;


import java.util.ArrayList;

//Monitor
public class MonitorGaraje {

    //Array plazas






    ArrayList<Coches> coches = new ArrayList<>();
    //Coches[] coches = new Coches[40];

    ArrayList<Coches> garaje = new ArrayList<>();


    public MonitorGaraje(ArrayList<Coches> arrayCoche) {
        this.coches = arrayCoche;
    }

    private boolean garajeLleno;
    private boolean garajeVacio;

    public void addCoche (Coches coche){

       while (coches.size() < 40){

           coches.add(coche);

       }

    }

    public synchronized void addCocheGaraje(){

        while (garaje.size()>=10){

                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }



        }

        Coches cocheAparcado = coches.get((int)(Math.random()*coches.size()));
        garaje.add(cocheAparcado);
        coches.remove(cocheAparcado);
        System.out.println("Coche "+cocheAparcado.getMatricula()+ " aparcado ");

        notifyAll();


    }


    public synchronized void sacarCocheGaraje(){

        while (garaje.size()<1){

            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


        Coches cocheSacado = garaje.get((int)(Math.random()*garaje.size()));
        garaje.remove(cocheSacado);

        System.out.println("El coche "+ cocheSacado.getMatricula()+ " ha salido del garaje");

        notifyAll();



    }











}
