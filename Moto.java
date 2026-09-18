package alquilervehiculos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Alquiler Iniciado");

        Vehiculo v = new Vehiculo();
        Cliente c = new Cliente();

        System.out.println(v);
        System.out.println(c);
    }
}