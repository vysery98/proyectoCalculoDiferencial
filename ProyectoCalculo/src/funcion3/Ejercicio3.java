package funcion3;

import java.util.Scanner;
import variables.Variables;

/**
 *
 * @author vysery98
 */
public class Ejercicio3 {

    // Presentar tabla de valores de la función presentada.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // para lectura de datos

        System.out.println("\\_____EJERCICIO 3_____/");

        // función a realizar
        System.out.println("f(x)= (9)(x)(1/x) - 10");

        do {
            System.out.print(Variables.menu + "\nIngrese una opcion: ");
            Variables.opt = scan.nextInt();

            switch (Variables.opt) {

                case 1: // Solo un Valor

                    break;

                case 2: // Más de un valor

                    break;

                case 3: // Cerrar

                    Variables.salir = false;
                    System.out.println("**CERRANDO**");
                    break;

                default:
                    System.out.println("Opción invalida.\nf(x)= (9)(x)(1/x) -"
                            + " 10");
            }

        } while (Variables.salir);

    }

}
