//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {
        Pedido miPedido = new Pedido(5);
        Postre postre = new Postre("chocolate", -1);
        Entrada entrada = new Entrada("sopa", 5);
        PlatoFuerte platoFuerte = new PlatoFuerte("Carne", 12, 10);
        Postre postre2 = new Postre("tarta", 123, 20);
        Postre postre3 = new Postre("helado", 10);


//Llamo a los métodos de cada objeto que hemos creado, calculando su precio, agregándolos al array
        postre.calcularPrecio();
        entrada.calcularPrecio();
        platoFuerte.calcularPrecio();
        postre2.calcularPrecio();
        miPedido.agregarplatos(postre);
        miPedido.agregarplatos(entrada);
        miPedido.agregarplatos(platoFuerte);
        miPedido.agregarplatos(postre2);
        miPedido.agregarplatos(postre3);
        miPedido.agregarplatos(postre3);

        miPedido.recorrerplatos();

    }

}
