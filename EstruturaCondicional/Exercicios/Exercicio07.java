package EstruturaCondicional.Exercicios;
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
            
        if (x == 0 && y == 0) {
            System.out.println("origem");
        }
        else if (x > 0 && y > 0 ) {
            System.out.println("Q1");
        } else if (x < 0  && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0){
            System.out.println("Q4");
        }
        scanner.close();
    }
}
