import java.util.Scanner;
public class Exer04 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Informe qual tabuada: ");
        int tabuada = input.nextInt();
        System.out.println("Tabuada do " + tabuada + " até o décimo valor");
        //tabuada do 9
        for (int i = 0; i <= 10; i++) {
            System.out.println(tabuada +  "x" +i + " = " + (tabuada*i));
        }
    }
}

