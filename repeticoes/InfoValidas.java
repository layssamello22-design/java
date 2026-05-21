/*Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';*/


package repeticoes;

import java.util.Scanner;

public class InfoValidas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;


        do {
            System.out.print("Entre com o nome:");
            nome = scan.next();
            if (nome.length() >= 3) {
                infoValida = true;

            } else {
                System.out.print("Nome precisa ser maior que 3 caracteres");
            }
        } while (!infoValida);
        infoValida = false;

        do {
            System.out.print("Entre com o idade:");
            idade = scan.nextInt();
            if (idade.length() >= 3) {
                infoValida = true;

            } else {
                System.out.print("Idade precisa ser menor que 150");
            }
        } while (!infoValida);
        infoValida = false;

        do {
            System.out.print("Entre com o Salário:");
            salario = scan.nextDouble();
            if (salario > 0) {
                infoValida = true;

            } else {
                System.out.print("Salário precisa ser maior que 0");
            }
        } while (!infoValida);
        infoValida = false;

        do {
            System.out.print("Entre com o sexo:");
            salario = scan.nextDouble();
            if (sexo > equa) {
                infoValida = true;

            } else {
                System.out.print("Sexo precisa ser maior que 0");
            }
        } while (!infoValida);
        infoValida = false;
    }
}
