package EstruturaCondicional.Exercicios;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero");
            int x = scanner.nextInt();
        System.out.println("Digite outro numero");
            int y = scanner.nextInt();
        
        if(x % y == 0 || y % x == 0) {
            System.out.println("Multiplos");
        } else { 
            System.out.println("nao sao multiplos");
        }

        scanner.close();
    }
}
