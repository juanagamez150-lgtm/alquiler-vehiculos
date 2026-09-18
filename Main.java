public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Alquiler Iniciado");

        Vehiculo v;
        v = new Vehiculo(50.0) {
            @Override
            public double calcularCostoAlquiler(int dias) {
                return dias * costoPorDia;
            }
        };

        System.out.println(v.calcularCostoAlquiler(5));
    }

    private static abstract class Vehiculo {
        protected double costoPorDia;

        public Vehiculo(double costoPorDia) {
            this.costoPorDia = costoPorDia;
        }

        public abstract double calcularCostoAlquiler(int dias);
    }
}
