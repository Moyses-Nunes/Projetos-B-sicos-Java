/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author MOYSES NUNES
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, tot = 0, par = 0, impar = 0, maior = 0;
        float media;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));   
            s += n;
            tot +=1;
            if(n % 2 == 0){
                par++;
            } else {
                impar++;
            } if(n > 100){
                maior++;
            }
        } while(n != 0);
        media = s / (tot-1);
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr>" + 
                "<br>Total de valores: " + (tot-1) +
                "<br>Total de Pares: " + par + 
                "<br>Total de Ímpares: " + impar +
                "<br>Acima de 100: " + maior + 
                "<br>Média dos Valores: " + media + "</html>");
    }
}
