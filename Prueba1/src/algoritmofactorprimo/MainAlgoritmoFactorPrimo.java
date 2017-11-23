package AlgoritmoFactorPrimo;

import java.util.Scanner;

/**
 *
 * @author Leonel Escobar
 */
public class MainAlgoritmoFactorPrimo {

    public static void main(String[] args) {

        Scanner tecla = new Scanner(System.in);
        System.out.println("Numero: ");
        double num = Double.valueOf(tecla.nextLine());
        FactoresPrimos primo = new FactoresPrimos(num);
        System.out.println("Numeros primos:");
        primo.factores(num);

    }

}
