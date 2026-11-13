package Ejercicio1T13;

public class Main {
    public static void main(String[] args) {
        Figura rect = new Rectangulo(4.0, 6.0);
        Figura tri = new Triangulo(3.0, 8.0);

        rect.descripcion();
        System.out.println("Área del Rectángulo: " + rect.calcularArea());

        tri.descripcion();
        System.out.println("Área del Triángulo: " + tri.calcularArea());
    }
}
