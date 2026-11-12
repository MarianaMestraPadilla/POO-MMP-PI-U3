package Ejercicio1T12;

public class Ave implements Volador, Cantante {
    private String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println("El ave " + nombre + " está volando alto en el cielo.");
    }

    @Override
    public void cantar() {
        System.out.println("El ave " + nombre + " canta alegremente por la mañana.");
    }
    
}
