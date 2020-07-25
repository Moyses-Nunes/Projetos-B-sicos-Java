/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Arrays;

/**
 *
 * @author MOYSES NUNES
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String mes[] = {"jan","fev","mar","abr","mai","jun","jul",
            "ago","set","out","nov","dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 31};
        for (int c = 0; c<mes.length; c++){
            System.out.println("O mês de " + mes[c] + " tem ao todo "
                    + tot[c] + " dias");
        }*/
        
        /*double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v);
        for (double valor: v){
            System.out.print(valor + " ");
        }*/
        
        /*int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v:vet){
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o valor na posição " + p);*/
    
        int v[] = new int[20];
        Arrays.fill(v, 8);
        for (int valor:v){
            System.out.print(valor);
        }
    }
    
}
