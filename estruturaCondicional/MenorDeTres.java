package estruturaCondicional;

import java.util.Scanner;

public class MenorDeTres {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int a, b, c, menor;
        System.out.println("Entre com a primeira nota:");
        a = teclado.nextInt();
        System.out.println("Entre com a segunda nota:");
        b = teclado.nextInt();
        System.out.println("Entre com a terceira nota:");
        c = teclado.nextInt();
        if(a<b && a<c){
            menor = a;
        }else if(b<a && b<c){
            menor =b;
        }else{
            menor = c;
        }
        System.out.printf("MENOR NÚMERO: %d\n", menor);
    }
}
