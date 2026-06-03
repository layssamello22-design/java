/*Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7*/
package matriz;

import java.util.Random;

public class Exer02 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int maiorL5 = Integer.MIN_VALUE;
        int menorL5 = Integer.MAX_VALUE;
        int linha5 = 5;

        for (int i = 0; i < matriz[linha5].length; i++) {
            if (matriz[linha5][i] > maiorL5) {
                maiorL5 = matriz[linha5][i];

            }
            if (matriz[linha5][i] < menorL5) {
                menorL5 = matriz[linha5][i];
            }
        }
        System.out.println("Menor número da linha 5: " + menorL5);
        System.out.println("Maior número da linha 5: " + maiorL5);

        int maiorC7 = Integer.MIN_VALUE;
        int menorC7 = Integer.MAX_VALUE;
        int coluna7 = 7;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][coluna7] > maiorC7) {
                maiorC7 = matriz[i][coluna7];

            }
            if (matriz[i][coluna7] < menorC7) {
                menorC7 = matriz[i][coluna7];
            }

        }
        System.out.println("Menor número da coluna 7: " + menorC7);
        System.out.println("Maior número da coluna 7: " + maiorC7);
    }
}