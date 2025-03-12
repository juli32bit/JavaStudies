package EstruturaCondicional.Exercicios;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite um numero");
            int numero = scanner.nextInt();

            if (numero % 2 != 0) {
                System.out.println("Numero impar");
            } else {
                System.out.println("Numero par");
            }


        scanner.close();
    }
}
