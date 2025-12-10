import java.util.Arrays;
import java.util.Scanner;

public class Pedido {
    int contador;


    Plato[] listaplatos;

    //Esto lo usamos para crear un costructor creando que el array de platos tendra la capacidad que le digamos
    // y diciendo que lista platos es ahora el array de Plato
    // y empezando el contador en 0
    public Pedido(int capacidad) {
        this.listaplatos = new Plato[capacidad];
        this.contador = 0;
    }


    //Con este metodo vamos a agregar los platos que creemos
    public void agregarplatos(Plato platoParaAgregar) {
        /*Aquí agregaremos los platos haciendo un try and catch para capturar por si se intenta introducir mas platos de
         *los disponibles que hay en el array
         */
        try {
//Aquí añadimos los platos haciendo que agreguemos platos en la posición que queramos,
// cuando agregamos el plato pasamos a la siguiente posición
            listaplatos[contador] = platoParaAgregar;
            contador++;
            System.out.println("Plato añadido con éxito");


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("!No puedes añadir mas platos¡");
        }
    }

    //Este método recorre el array de platos y muestra su información
    public void recorrerplatos() {
        double preciofinal;
        double preciototal = 0;
        for (int i = 0; i < contador; i++) {
            System.out.println("-------------------------------------------------");
            System.out.println(" El nombre del plato es " + listaplatos[i].getNombre());
            System.out.println(" El precio del plato es " + listaplatos[i].calcularPrecio());
            preciofinal = listaplatos[i].calcularPrecio();
            preciototal += preciofinal;
            System.out.println("-------------------------------------------------");


        }
//Aquí muestra el precio de todos los platos
        System.out.println("El precio total es " + preciototal);


    }


}















