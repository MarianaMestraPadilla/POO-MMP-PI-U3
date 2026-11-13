package Ejercicio2T13;

public class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato despliega sus alas y vuela en formación.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato rema suavemente sobre el agua con sus patas.");
    }
}
