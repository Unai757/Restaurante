public class Entrada extends Plato {
    public Entrada(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularPrecio() {
        return getPrecio();
    }
}
