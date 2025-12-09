import java.util.Arrays;
import java.util.Scanner;

public class Pedido {
    int contador;


    Plato[] listaplatos;

    public Pedido(int capacidad) {
        this.listaplatos = new Plato[capacidad];
        this.contador = 0;
    }

    Scanner scanner = new Scanner(System.in);


    public void agregarplatos(Plato platoParaAgregar) {
        try {
            if (contador < listaplatos.length) {
                listaplatos[contador] = platoParaAgregar;
                contador++;
                System.out.println("Plato añadido con éxito");


            } else {
                System.out.println("El pedido ya esta lleno");

            }


        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }

        public void recorrerplatos () {
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

            System.out.println("El precio total es " + preciototal);


        }


        }















