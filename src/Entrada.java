//Esta es la clase Entrada que extiende de plato
public class Entrada extends Plato {
    public Entrada(String nombre, double precio) {
        super(nombre, precio);
    }

    //Sobreescribimos el método calcularPrecio
    @Override
    public double calcularPrecio() {
        return getPrecio();
    }
}
