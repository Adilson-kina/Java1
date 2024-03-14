/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short num1, num2, operacao;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        num1 = input.nextShort();
        System.out.print("Digite o tipo de operação \n1.Adição \n2.Subtração \n3.Multiplicação \n4.Divisão");
        operacao = input.nextShort();
        if (operacao <= 4 && operacao >= 1){
            
        }
        else{
            System.out.println("Você não digitou um valor valido");
            main(args);
        }
    }
}
