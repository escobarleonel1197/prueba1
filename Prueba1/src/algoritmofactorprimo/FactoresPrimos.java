/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoFactorPrimo;

/**
 *
 * @author Leonel Escobar
 */
public class FactoresPrimos {

    double numero;

    public FactoresPrimos(double num) {
        numero = num;
    }
    

    public void factores(double numero1) {
        double i;

        for (i = 2; i < numero1; i++) {

            while (numero1 % i == 0) {
                numero1 = numero1 / i;
                if (numero1 == 1) {
                    System.exit(0);
                }
            }
        }
        System.out.println(i);

    }

}
