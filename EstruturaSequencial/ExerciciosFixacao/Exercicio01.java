package ExerciciosFixacao;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero");
            int a = scanner.nextInt();
        System.out.println("Digite outro numero");
            int b = scanner.nextInt();
        
        int soma;

        soma = a + b;
        System.out.println("A soma dos numeros eh " + soma);

        scanner.close();
    
        }
}
