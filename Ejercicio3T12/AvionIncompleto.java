package Ejercicio3T12;
interface Controlable {
    void encenderSistema();
    void apagarSistema();
}

// ERROR DE COMPILACIÓN: 
// Si una clase implementa una interfaz, ESTÁ OBLIGADA a definir TODOS sus métodos abstractos.
// Si se omite alguno, Java arrojará un error de compilación: "AvionIncompleto is not abstract and does not override abstract method..."
public class AvionIncompleto implements Controlable {
    @Override
    public void encenderSistema() {
        System.out.println("Sistema encendido.");
    }
    // Falta implementar apagarSistema() -> CAUSA ERROR DE COMPILACIÓN
}