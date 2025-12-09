//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pedido miPedido = new Pedido(5);
        Postre postre = new Postre("prueba", 10);
        Entrada entrada = new Entrada("sopa", 5);
        PlatoFuerte platoFuerte = new PlatoFuerte("Carne", 12, 10);
        Postre postre2 = new Postre("pedido con descuento", 123,20);
        Postre postre3 = new Postre("prueba", 10);
        Entrada entrada2 = new Entrada("sopa", 5);
        PlatoFuerte platoFuerte2 = new PlatoFuerte("Carne", 12, 10);
        Postre postre4 = new Postre("pedido con descuento", 123,20);

        postre.calcularPrecio();
        entrada.calcularPrecio();
        platoFuerte.calcularPrecio();
        postre2.calcularPrecio();
        miPedido.agregarplatos(postre);
        miPedido.agregarplatos(entrada);
        miPedido.agregarplatos(platoFuerte);
        miPedido.agregarplatos(postre2);
        miPedido.agregarplatos(postre3);
        miPedido.agregarplatos(entrada2);
        miPedido.agregarplatos(platoFuerte2);

        miPedido.recorrerplatos();

    }

}
