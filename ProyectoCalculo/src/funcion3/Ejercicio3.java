package funcion3;

import java.util.Scanner;
import variables.Variables;

/**
 *
 * @author vysery98
 */
public class Ejercicio3 {

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

                    System.out.println("TABLA DE VALORES");

                    // entrada de datos
                    System.out.print("Ingrese el número a asignar a 'x'=");
                    Variables.varInd = scan.nextInt();

                    // proceso
                    Variables.varDep = (9 * Variables.varInd * ((double) (1)
                            / Variables.varInd)) - 10;

                    // salida
                    System.out.printf("NaN = Not a Number (resultado imposible"
                            + " de calcular).\nx\t|\tf(x)\n%d\t|\t%.2f\n",
                            Variables.varInd, Variables.varDep);

                    break;

                case 2: // Más de un valor

                    System.out.println("TABLA DE VALORES");

                    // entrada de datos
                    System.out.print("Ingrese el número desde el que desea "
                            + "empezar:");
                    Variables.limInf = scan.nextInt();

                    System.out.print("Ingrese el número hasta donde calcular "
                            + "la tabla:");
                    Variables.limSup = scan.nextInt();

                    // Cálculo del límite para los arreglos tanto de x como de y
                    if (Variables.limInf == Variables.limSup) {

                        Variables.lim = 1;

                    } else {

                        Variables.lim = Math.abs((Variables.limSup
                                - Variables.limInf));

                        if (Variables.lim == 0) {

                            Variables.lim = 1;

                        }

                    }

                    // declaración de arreglos
                    Variables.x = new double[Variables.lim + 1];
                    Variables.y = new double[Variables.lim + 1]; // f(x)

                    // proceso
                    for (int i = 0; i <= Variables.lim; i++) {

                        if (Variables.limInf <= Variables.lim) {
                            Variables.x[i] = (Variables.limInf);
                        }

                        Variables.y[i] = (9 * Variables.limInf * ((double) (1)
                                / Variables.limInf)) - 10;
                        Variables.limInf++;

                    }

                    // salida
                    System.out.println("NaN = Not a Number (resultado imposible"
                            + " de calcular).\nx\t|\tf(x)");
                    for (int i = 0; i <= Variables.lim; i++) {
                        System.out.printf("%.0f\t|\t%.2f\n", Variables.x[i],
                                Variables.y[i]);
                    }

                    break;

                case 3: // Cerrar

                    Variables.salir = false;
                    System.out.println("**CERRANDO**");
                    break;

                default:
                    System.out.println("Opción inválida.\nf(x)= (9)(x)(1/x) - "
                            + "10");
            }

        } while (Variables.salir);

    }

}
