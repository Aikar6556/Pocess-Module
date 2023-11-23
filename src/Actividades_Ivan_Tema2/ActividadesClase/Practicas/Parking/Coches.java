package Actividades_Ivan_Tema2.ActividadesClase.Practicas.Parking;

public class Coches {

    private String modelo;
    private String matricula;

    public Coches(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
