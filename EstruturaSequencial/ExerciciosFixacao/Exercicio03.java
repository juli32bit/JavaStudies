package ExerciciosFixacao;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("Digite um valor");
            int A = scanner.nextInt();
            
        System.out.println("Digite um valor");
            int B = scanner.nextInt();
            
        System.out.println("Digite um valor");
            int C = scanner.nextInt();
            
        System.out.println("Digite um valor");
            int D = scanner.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("Diferenca eh "+ diferenca);
        
        scanner.close();
    }
}
