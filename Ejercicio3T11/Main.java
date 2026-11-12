package Ejercicio3T11;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- DEMOSTRACIÓN EJERCICIO 3 (TALLER 11) ---");
        
        Desarrollador dev = new Desarrollador("Carlos", "Java");
        dev.programar();
        
        // Al no estar obligado a sobrescribirse (por ser un método concreto y no abstract),
        // heredará el mensaje genérico en lugar de uno personalizado para desarrolladores.
        dev.evaluarDesempeno();
    }
}