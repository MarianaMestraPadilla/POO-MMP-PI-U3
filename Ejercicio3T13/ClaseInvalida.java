package Ejercicio3T13;

public abstract class ClaseInvalida {
    // ERROR DE COMPILACIÓN: 
    // Las clases abstractas NO usan la palabra clave 'default'. 
    // Si se quiere un método con cuerpo en una clase abstracta, simplemente se escribe normal:
    
    /* 
    public default void metodoInvalido() { 
        // Esto da error porque 'default' solo existe en interfaces.
    } 
    */

    // FORMA CORRECTA en una clase abstracta:
    public void metodoConcretoNormal() {
        System.out.println("Este es un método con cuerpo tradicional en una clase abstracta.");
    }
}
