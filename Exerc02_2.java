public class Exerc02_2 {

    public static void main(String[] args) {
        //variável para acumular a soma dos valores (inicia em 0)
        int soma = 0;
        //for de 1 ate 100
        for (int i = 1; i <= 100; i+=2) {
            soma = soma+i;

        }
        System.out.print("Valor da soma: " + soma);
    }
}
