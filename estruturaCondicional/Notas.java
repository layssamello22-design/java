package estruturaCondicional;

import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, notaFinal;
        System.out.print("Digiti a primeira nota:");
        nota1 = teclado.nextDouble();
        System.out.print("Digiti a segunda nota:");
        nota2 = teclado.nextDouble();
        notaFinal= nota1 + nota2;
        System.out.printf(" Nota final: %.1f\n", notaFinal);
        if (notaFinal < 60){
            System.out.println("REPROVADO!");
        }else {
            System.out.println("APROVADO!");
        }
    }
}



