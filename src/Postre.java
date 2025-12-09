public class Postre extends Plato {
    private double descuento;

    public Postre(String nombre, double precio, double descuento) {
        super(nombre, precio);
        this.descuento = descuento;
    }

    public Postre(String nombre, double precio) {
        super(nombre, precio);
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecio() {
        return calcularPrecio(getDescuento());
    }



    public double calcularPrecio(double descuento) {
        double preciocondescuento = getPrecio()*(descuento/100);
        return getPrecio()-preciocondescuento;
    }
}
