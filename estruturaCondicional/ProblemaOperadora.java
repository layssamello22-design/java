package estruturaCondicional;

import java.util.Scanner;

public class ProblemaOperadora {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com a quantidade de minutos:");
        int minuto = teclado.nextInt();

        double valorPagar = 50.00;
        if(minuto < 100){
            valorPagar = (minuto-100)*2;

        }
        System.out.printf("VALOR A PAGAR : %.2f\n" , valorPagar );
    }

}
