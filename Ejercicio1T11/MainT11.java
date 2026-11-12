package Ejercicio1T11;
public class MainT11 {
    public static void main(String[] args) {
        Figura miCirculo = new Circulo(4.0);
        Figura miRectangulo = new Rectangulo(3.0, 5.0);

        System.out.println("--- CÍRCULO ---");
        miCirculo.mostrarArea();

        System.out.println("--- RECTÁNGULO ---");
        miRectangulo.mostrarArea();
    }
}