//Esta es la clase Entrada que extiende de plato
public class Entrada extends Plato {
    public Entrada(String nombre, double precio) {
        super(nombre, precio);
    }

    //Sobreescribimos el método calcularPrecio
    @Override
    public double calcularPrecio() {
        /*
            if (getPrecio() < 0) {
            throw new NumeroInvalidoException("El plato no puede tener un precio negativo");} else {
            */
        return getPrecio();
        }
    }

