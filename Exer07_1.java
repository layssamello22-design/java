/*Crie uma aplicação que possibilita a entrada via console de um conjunto de notas de um aluno.
Assim que -1 for informado como nota, calcule a média das notas informadas anteriormente e
mostre na tela. Caso a nota do aluno seja inválida, mostre uma mensagem na tela solicitando
uma nova nota.
*/


import java.util.Scanner;

public class Exer07_1 {
    public static void main(String[] args) {
 /*
        int i = 1;
        float soma = 0;
        double media;
        int qtdNotas= 0;


       while (true) {
            //Pede pro usuário inserir as notas dos alunos
            Scanner inp = new Scanner(System.in);
            System.out.println("Insira a " + (i++) + "° nota:");
            double nota = inp.nextInt();

            //Se a nota é maior que zero e menor que 10
            if (nota >= 0 && nota <= 10) {
                soma += (float) nota;
                qtdNotas ++;
            }
            //Se as notas não estiverem dentro da condição acima o sistema informa pra inserir uma nova nota
            else {
                System.out.println("Insira uma nova nota");
            }
            //Se a nova for menor  que 0 ele termina o while e entra na média
            if (nota < 0) {
                break;
            }

        //média das notas
        media = soma / qtdNotas;
        System.out.println("A média das notas é:" + media);
    }*/

        Scanner input = new Scanner(System.in);
        System.out.println("Entre com quantidades de notas");

        int qtdNotas = input.nextInt();
        double [] notas = new double[qtdNotas];
        double somaNotas= 0;




    }
}
