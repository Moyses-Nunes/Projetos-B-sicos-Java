/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author MOYSES NUNES
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String nome = "Moysés";
        float nota = (float) 8.5; // Ou = 8.5f;
        System.out.println("A nota é " + nota);
        System.out.printf("A nota de %s é %.3f \n", nome, nota);
        System.out.format("A nota de %s é %.3f \n", nome, nota);*/
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %f \n", nome, nota);
        
    }
    
}
