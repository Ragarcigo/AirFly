/**
 * La aerolínea AirFly necesita un sistema básico para gestionar su personal y flota de aviones. Se requiere desarrollar una aplicación en Java que contemple lo siguiente:
 *
 * Gestión de Personal
 * Implementar una clase Empleado con atributos como nombre, ID y departamento.
 * Crear objetos de tipo Empleado con diferentes datos y mostrarlos en pantalla.
 * Gestión de Flota de Aviones
 * Implementar una clase Avion con atributos como matrícula, modelo y capacidad de pasajeros.
 * Crear objetos de tipo Avion con diferentes datos y mostrarlos en pantalla.
 * Programa Principal (Main)
 * En la clase Main, instanciar al menos tres empleados y dos aviones.
 * Mostrar en pantalla la información de cada objeto utilizando System.out.println().
 *
 *
 */

public class Main {
    public static void main(String[] args) {
        Empleado p1=new Empleado("Raúl",(byte) 10,"Atencion");
        System.out.println(p1);
        Empleado p2=new Empleado("Jose",(byte) 15,"Mantenimiento");
        System.out.println(p2);
        Empleado p3=new Empleado("Sergio",(byte) 16,"Equipamiento");
        System.out.println(p3);
        Aviones a1=new Aviones("Airbus A350", 6574566,  348);
        System.out.println(a1);
        Aviones a2=new Aviones("Airbus A321XLR", 6547841,  182);
        System.out.println(a2);
        Aviones a3=new Aviones("Airbus A330-200", 6574100,  288);
        System.out.println(a3);
    }

}