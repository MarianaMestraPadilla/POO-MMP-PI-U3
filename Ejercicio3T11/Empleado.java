package Ejercicio3T11;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void evaluarDesempeno() {
        System.out.println("Evaluación estándar: Desempeño promedio para el empleado " + nombre);
    }
}
