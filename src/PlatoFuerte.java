//Esta es la clase PlatoFuerte que extiende de plato y agrega una variable llamada recargo
public class PlatoFuerte extends Plato {
    private double recargo;


    //Creamos el constructor de platofuerte usando el costructor de plato y agregando recargo
    public PlatoFuerte(String nombre, double precio, double recargo) {
        super(nombre, precio);
        this.recargo = recargo;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    //Aquí hacemos un override a calcularPrecio añadiendo el recargo
    @Override
    public double calcularPrecio() {
        //if (getPrecio() < 0) {
            //throw new NumeroInvalidoException("El plato no puede tener un precio negativo");
        //}else {
            return getPrecio() + getRecargo();
        }
    }

