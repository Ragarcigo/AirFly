public class Empleado {
    String nombre;
    byte id;
    String departamento;

    public Empleado(String nombre, byte id, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getId() {
        return id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre +
                "\nId = " + id +
                "\nDepartamento = " + departamento;
    }
}
