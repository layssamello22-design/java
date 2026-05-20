package estruturaCondicional;

import java.util.Scanner;

public class TrocoVerificado {
    public static void main(String [] args){
        Scanner teclado = new Scanner (System.in);
        System.out.print("ENTRE COM O VALOR DO PRODUTO: ");
        float valor= teclado.nextFloat();
        System.out.print("ENTRE COM A QUANTIDADE DO PRODUTO: ");
        int quantidade = teclado.nextInt();
        float valorPagar= valor * quantidade;
        System.out.print("INFORME O VALOR DO DINHEIRO: ");
        float dinheiro = teclado.nextFloat();
        if (dinheiro > valorPagar){
            float troco = dinheiro - valorPagar;
            System.out.printf("VALOR DA COMPRA: R$ %.2f  \n" , valorPagar);
            System.out.printf("DINHEIRO: R$ %.2f  \n" , dinheiro);
            System.out.printf("TROCO: R$%.2f  \n" , troco);

        }else{
            System.out.printf("VALOR DA COMPRA: R$ %.2f  \n" , valorPagar);
            System.out.printf("DINHEIRO: R$ %.2f  \n" , dinheiro);
            System.out.printf("FALTA: R$%.2f  \n" , valorPagar-dinheiro);
        }
    }
}
