package Ejercicio2T11;

public class MainT11 {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Carlos Mendoza", 3500000, 1500000);
        Empleado vendedor = new Vendedor("Lucía Torres", 1400000, 600000);

        System.out.println("--- DETALLES GERENTE ---");
        gerente.mostrarDetalles();

        System.out.println("\n--- DETALLES VENDEDOR ---");
        vendedor.mostrarDetalles();
    }
}
