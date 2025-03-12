package EstruturaCondicional.Exercicios;
import java.util.Scanner;
public class Exercicio01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite um numero");
            int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("Numero negativo");
        } else if (num == 0) {
            System.out.println("Numero neutro");
        } else 
            {
            System.out.println("Numero positivo");
        }


        scanner.close();
    }
    
    
    


    
}
