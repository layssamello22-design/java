package exercicios;

public class Exer01 {

    /*Um aluno tirou nota 8.5, 7.5 e 6.0 em provas que tinham peso 3, 2 e 5, respectivamente. Escreva um programa que imprima a média do aluno.*/

    public static void main(String[] args) {

        //notas dos alunos nas provas
        double nota1 = 8.5;
        double nota2 = 7.5;
        double nota3 = 6.0;

        //peso das notas
        int peso1 = 3;
        int peso2 = 2;
        int peso3 = 5;

        //Cálculo parcial da nota, multiplicando a nota pelo peso
        double parcial1 = nota1 * peso1;
        double parcial2 = nota2 * peso2;
        double parcial3 = nota3 * peso3;

        //Cálculo da média, onde ocorre a soma das parciais, dividida pela soma dos pesos
        // a presença dos parênteses é obrigatória para que as adições seja feita antes da divisão

        double media = (parcial1 + parcial2 + parcial3) / (peso1 + peso2 + peso3);

        System.out.println("Média: " + media);

    }
}