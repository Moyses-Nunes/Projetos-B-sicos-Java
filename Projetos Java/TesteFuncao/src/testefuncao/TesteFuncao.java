/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao;

/**
 *
 * @author MOYSES NUNES
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     */
    
    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    }
    
    static int subt(int a, int b) {
        int s = a - b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        soma(7,2);
        int sub = subt(8,4);
        System.out.println(sub);
    }
    
}
