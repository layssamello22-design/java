package estruturaCondicional;

import java.util.Scanner;

public class MenorDeTresll {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int [] nota = new int[3];
        int menor;

            for (int i = 0; i < nota.length; i++) {
                System.out.println("Entre com a " +(i+1)+"° nota:");
                nota[i]= teclado.nextInt();

        }
        menor = Integer.MAX_VALUE;

        for (int i = 0; i < nota.length; i++) {
            if (nota[i]<menor){
                menor= nota[i];

            }
        }
        System.out.print("A menor nota número: " + menor);
    }
}
