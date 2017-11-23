/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmofactorprimo;

/**
 *
 * @author user
 */
public class PrimoSinIngresoDeTeclado {

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */
    /**
     *
     * @author Leonel Escobar
     */
    public static void main(String[] args) {

        long numero = 600851475143L;
        long i;

        for (i= 2; i < numero; i++) {

            while (numero % i == 0) {
                numero = numero / i;
                
                if (numero == 1) {
                    System.exit(0);
                    
                }
                
            }
        }
        
        System.out.println(i);        
    }

}
