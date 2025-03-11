package ExerciciosFixacao;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valor do raio");
            double raio = scanner.nextDouble(); 
        
        double pi = 3.14159;
        double A = pi * Math.pow(raio,2);

        System.out.printf("O valor da area do circulo eh %.4f", A);

        
        scanner.close();
    }
    
}
