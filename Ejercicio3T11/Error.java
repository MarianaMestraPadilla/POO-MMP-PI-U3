package Ejercicio3T11;

abstract class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public void encender() {
        System.out.println("El vehículo está encendido.");
    }
}

public class Error {
    public static void main(String[] args) {
        /* 
         * ERROR DE COMPILACIÓN:
         * Si se intenta ejecutar la siguiente línea:
         * Vehiculo v = new Vehiculo("Toyota");
         * 
         * El compilador de Java arrojará el siguiente error:
         * "Vehiculo is abstract; cannot be instantiated"
         * 
         * ¿Por qué ocurre? Las clases abstractas están incompletas por diseño 
         * y sirven solo como plantillas; Java prohíbe crear objetos (instancias) 
         * directos de ellas mediante 'new'.
         */
        System.out.println("Las clases abstractas no se pueden instanciar directamente con 'new'.");
    }
}
