package exercicios;

import java.util.Locale;

public class Exer3_1 {
    public static void main(String[] args){
        //valor para o qual o fatorial será calculada
        int valor =  10;

        long resposta = 1;

        for (int i = 2; i < valor; i++) {
            resposta *= i;
        }
        System.out.printf(" O fatorial de %d igual a %d " , valor, resposta);

    }






}
