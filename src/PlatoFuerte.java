public class PlatoFuerte extends Plato {
    private double recargo;

    public PlatoFuerte(String nombre, double precio, double recargo) {
        super(nombre, precio);
        this.recargo = recargo;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(int recargo) {
        this.recargo = recargo;
    }

    @Override
    public double calcularPrecio() {
        return getPrecio() + getRecargo();
    }
}
