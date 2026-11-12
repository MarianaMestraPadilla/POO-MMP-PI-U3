package Ejercicio2T12;

public class Pez implements Nadador, Respirador {
    private String especie;

    public Pez(String especie) {
        this.especie = especie;
    }

    @Override
    public void nadar() {
        System.out.println("El pez " + especie + " nada rápidamente utilizando su cola.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez " + especie + " respira oxígeno disuelto mediante branquias.");
    }
}
