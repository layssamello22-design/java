/*3. Capture do teclado valores para preenchimento de uma matriz M
3x3. Após a captura imprima a matriz criada e encontre a
quantidade de números pares, a quantidade de números ímpares.*/

package matriz;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Entre com o valor na posição" + "["+ i + ","+ j +"]");
            }
            System.out.println(" ");
        }
        int qtdPar = 0;
        int qtdImpar = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] %2==0) {
                    qtdPar++;
                }else{
                    qtdImpar++;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");

            }
            System.out.println(" ");
        }
        System.out.println("Quantidade de números pares: " + qtdPar);
        System.out.println("Quantidade de números impar: " + qtdImpar);
    }
}
