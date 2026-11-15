package Ejercicio3T13;

// Clase hija que extiende la clase abstracta correctamente
class EmpleadoPrueba extends ClaseInvalida {
    // No está obligada a implementar nada porque el método de arriba es concreto,
    // pero puede heredarlo y usarlo.
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- DEMOSTRACIÓN TALLER 13 - EJERCICIO 3 ---");
        System.out.println("1. Las interfaces exigen la implementación obligatoria de sus métodos.");
        System.out.println("2. Las clases abstractas usan métodos con cuerpo normales, no 'default'.");
        
        EmpleadoPrueba emp = new EmpleadoPrueba();
        emp.metodoConcretoNormal();
    }
}
