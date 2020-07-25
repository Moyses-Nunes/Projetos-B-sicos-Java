/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author MOYSES NUNES
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.printf("A média é igual a %.1f \n", m);
        
        System.out.println("=-=-=-=-=-=-=-=-=-");
        
        int numero = 5;
        numero ++;
        System.out.println(numero);
        
        System.out.println("=-=-=-=-=-=-=-=-=-");
        
        int num = 5;
        int valor = 5 + ++num;
        System.out.println(valor);
        
        System.out.println("=-=-=-=-=-=-=-=-=-");
        
        int x = 4;
        x += 2;
        System.out.println(x);
        
        System.out.println("=-=-=-=-=-=-=-=-=-");
        
        float v = 8.9f;
        int ar = (int) Math.floor(v);
        System.out.println(ar);
        
        System.out.println("=-=-=-=-=-=-=-=-=-");
        
        float y = 4.2f;
        int arn = (int) Math.ceil(y);
        System.out.println(arn);
        
        System.out.println("=-=-=-=-=-=-=-=-=-");
        
        float k = 6.6f;
        int arnd = (int) Math.round(k);
        System.out.println(arnd);
        
        System.out.println("=-=-=-=-=-=-=-=-=-");
        
        double a = Math.random();
        int n = (int)(5 + a * (10 - 5)); // número aleatório entre 10 e 5
        System.out.println(n);
    }
    
}
