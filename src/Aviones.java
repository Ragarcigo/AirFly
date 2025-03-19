public class Aviones {
    String modelo;
    int matricula;
    int capacidad;
    static int id=0;
    int id0;

    public Aviones(String modelo, int matricula, int capacidad) {
        this.modelo = modelo;
        this.matricula= matricula;
        this.capacidad = capacidad;
        this.id0=++id;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "ID: " + id0+
                "\nModelo = " + modelo +
                "\nMatricula = " + matricula +
                "\nCapacidad = " + capacidad ;
    }
}
