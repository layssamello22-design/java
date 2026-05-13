/*6 Exercício
Verifique a validade de uma data e mostre uma mensagem na tela dizendo se a data é válida
ou inválida. Deve haver três variáveis para armazenar esta data: uma para o dia, outra para o
mês e outra para o ano. Considere que fevereiro pode ter somente 28 dias.*/


import java.util.Scanner;

public class Exer06_1 {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.println("Entre com o dia: ");
        int dia = inp.nextInt();

        System.out.println("Entre com o mês: ");
        int mes= inp.nextInt();

        System.out.println("Entre com o ano: ");
        int ano= inp.nextInt();


        if (dia < 1 || dia > 31 ){
            System.out.println("Dia inválido");

        }else if ((dia <= 31) && (ano <=12)){
            System.out.println("Data valida");

            if ((dia <= 28) && (mes == 2)) {
                System.out.println("Data valida");
            }else{
                System.out.println("Data inválida");
            }
        }else{
            System.out.println("Data inválida");
        }
    }
}
