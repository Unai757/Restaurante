public class Postre extends Plato {
    private double descuento;

    //Hacemos una sobrecarga de costructores para poder poner descuento o dejarlo sin descuento
    public Postre(String nombre, double precio, double descuento) {
        super(nombre, precio);
        this.descuento = descuento;
    }

    //Creamos el costructor sin descuento
    public Postre(String nombre, double precio) {
        super(nombre, precio);
    }

    //Creamos los getters y setters
    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    //Hacemos un override para calcular el precio utilizando el método de calcular descuento, si no tiene descuento el postre
    //mostrara el precio normal
    @Override
    public double calcularPrecio() {
        return calcularPrecio(getDescuento());
    }


    //Aquí creamos un método que calculara el precio si tiene descuento si no mostrara el precio normal
    public double calcularPrecio(double descuento) {
        double preciocondescuento = getPrecio() * (descuento / 100);
        return getPrecio() - preciocondescuento;
    }
}
