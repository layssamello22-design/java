/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.*/


package repeticoes;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor de uma nota (0 a 10):");
        int nota = teclado.nextInt();
        while (true) {
            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota: " + nota + " \n Válida!");

            } else {
                System.out.println("Nota: " + nota + " \n Inválida!");

            }if(nota < 0 || nota > 10){
                System.out.println("Informe a nota novamente");
                break;

            }
        }
    }
}
