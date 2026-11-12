package Ejercicio3T11;

// La clase compila perfectamente, aunque no personalice la evaluación de desempeño,
// lo cual representa una mala práctica si la lógica de negocio exigía una evaluación especializada.
public class Desarrollador extends Empleado {
    private String lenguaje;

    public Desarrollador(String nombre, String lenguaje) {
        super(nombre);
        this.lenguaje = lenguaje;
    }

    public void programar() {
        System.out.println(nombre + " está escribiendo código en " + lenguaje);
    }
}