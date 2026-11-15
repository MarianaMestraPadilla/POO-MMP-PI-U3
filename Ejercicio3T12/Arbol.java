package Ejercicio3T12;

interface Corredor {
    void correr();
}

// MALA PRÁCTICA: El código compila, pero lógicamente un Árbol no puede correr ("es-un" vs "puede-hacer").
public class Arbol implements Corredor {
    @Override
    public void correr() {
        System.out.println("Los árboles no tienen piernas para correr."); // Lógica incoherente
    }
}
