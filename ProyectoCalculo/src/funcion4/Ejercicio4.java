package funcion4;

import java.util.Scanner;
import variables.Variables;

/**
 *
 * @author vysery98
 */
public class Ejercicio4 {

    // Presentar tabla de valores de la función presentada.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // para lectura de datos

        System.out.println("\\_____EJERCICIO 4_____/");

        // función a realizar
        System.out.println("f(x)= ((x^3)(x^10))/(x^11) + (9x^3)/((x^3)^(1/2))");

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
                    System.out.println("Opción invalida.\nf(x)= 2x^3 + 2x - 7");
            }

        } while (Variables.salir);

    }

}
