package estruturaCondicional;

import java.util.Scanner;

public class Repita {

    public static void main(String[] args) {
       /* Scanner teclado = new Scanner(System.in);
        int contador = 0;
        System.out.println("Entre com a tabuada:");
        int tabuada = teclado.nextInt();
        do{
        System.out.printf("%d x %d = %d \n", tabuada, contador, (tabuada*contador));
        contador ++;
        }
        while(contador<=10);*/

        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        System.out.print("Entre com a tabuada:");
        int tabuada = teclado.nextInt();
        for (int i = 0; i <= 10; i++) {
        System.out.printf("%d x %d = %d \n", tabuada, i, (tabuada * i));
    }

    }
}
