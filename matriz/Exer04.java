package matriz;
/*. Faça um programa para armazenar em uma matriz os
compromissos de uma agenda pessoal. Cada dia do mês deve
conter 24 horas, onde para cada uma destas 24 horas podemos
associar um tarefa específica (compromisso agendado). O
programa deve ter um menu onde o usuário indica o dia do mês
que deseja alterar e a hora, entrando em seguida com o
compromisso, ou então, o usuário pode também consultar a
agenda, fornecendo o dia e a hora para obter o
compromisso armazenado.*/

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[][] agenda = new String[31][24];
        boolean sair = false;
        byte opcao;

        while (!sair) {
            System.out.println("Digite 1 para adicionar compromissos.");
            System.out.println("Digite 2 para consultar compromissos.");
            System.out.println("Digite 0 para sair do sistema.");

            opcao = teclado.nextByte();

            if (opcao == 1) {
               boolean diaValido = false;
                int dia = 0;

                while (!diaValido){//adicionar compromisso
                    System.out.println("Entre com o dia do mês");
                    dia = teclado.nextByte();
                    if(dia>0 && dia<31){
                        diaValido =  true;
                    }else{
                        System.out.println("Dia inválido, digite novamente:");
                    }
                }
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Entre com a hora do compromisso");
                    hora = teclado.nextByte();
                    if(hora>0 && hora<24){
                        horaValida=  true;
                    }else{
                        System.out.println("Hora inválido, digite novamente:");
                    }
                }

                dia --;
                System.out.println("Digite o compromisso:");
                agenda [dia][hora] = teclado.nextLine();

            }else if(opcao == 2 ){//consultar compromisso
                boolean diaValido = false;
                int dia = 0;

                while (!diaValido){//adicionar compromisso
                    System.out.println("Entre com o dia do mês");
                    dia = teclado.nextByte();
                    if(dia>0 && dia<31){
                        diaValido =  true;
                    }else{
                        System.out.println("Dia inválido, digite novamente:");
                    }
                }
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Entre com a hora do compromisso");
                    hora = teclado.nextByte();
                    if(hora>0 && hora<24){
                        horaValida=  true;
                    }else{
                        System.out.println("Hora inválido, digite novamente:");
                    }
                }

                dia --;
                System.out.println("Consultar compromisso:");
                System.out.println(agenda[dia][hora]);
            } else if (opcao==0) {
                sair = true;
            }else{
                System.out.println("Opção inválida!");
            }
        }

    }
}