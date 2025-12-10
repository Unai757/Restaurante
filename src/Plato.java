//Creamos la clase Plato abstracta, ya que contentra métodos que van a ser sobreescritos por otras clases
public abstract class Plato {
    private String nombre;
    private double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        if (precio<0) {
            throw new NumeroInvalidoException("El precio no puede ser negativo");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        //Aquí comprobamos que si el precio es menor que 0 salga el mensaje de nuestra excepcion personalizada

            return precio;


    }
    public void setPrecio(double precio) {
        this.precio = precio;


    }

    //Este será el método que sobreescribiremos
    public abstract double calcularPrecio();
}
