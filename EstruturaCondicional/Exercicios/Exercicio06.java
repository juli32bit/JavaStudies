package EstruturaCondicional.Exercicios;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero entre 0 e 100");
            double x = scanner.nextDouble();

        if (x < 0.0 || x > 100.) {
          System.out.println("Fora do intervalo"); 
        } else if (x <= 25.0) {
            System.out.println("Dentro do Intervalo [0,25]");
        } else if (x <= 50 ) {
            System.out.println("Dentro do Intervalo [25,50]");
        } else if (x <= 75.0) {
            System.out.println("Dentro do intervalo [50,75]");
        } else if (x <= 100){
            System.out.println("Dentro do Intervalo [75,100]");
        }
        
        scanner.close();
    }
}
