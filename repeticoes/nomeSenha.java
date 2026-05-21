/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.*/


package repeticoes;

import java.util.Scanner;

public class nomeSenha {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean infoValida = false;

        do{
            System.out.print("Entre com o nome:");
            String nome = scan.next();
            System.out.print("Entre com a senha");
            String senha = scan.next();

            if(nome.equalsIgnoreCase(senha)){
                System.out.println("Senha igual ao usuário, digite novamente!");
            }else{
                infoValida = true;
                System.out.println("Senha e usuário válidos!");
            }

        }while (!infoValida);


    }
}
