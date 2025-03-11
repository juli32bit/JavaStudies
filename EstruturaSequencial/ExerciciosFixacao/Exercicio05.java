package ExerciciosFixacao;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //  Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Codigo de uma peca 01");
            int cod1 = scanner.nextInt();
        System.out.println("Numero de pecas");
            int qntd = scanner.nextInt();
        System.out.println("Valor unitario de cada peca ");
            double preco1 = scanner.nextDouble();

            System.out.println("Codigo de uma peca 01");
            int cod2 = scanner.nextInt();
        System.out.println("Numero de pecas");
            int qntd2 = scanner.nextInt();
        System.out.println("Valor unitario de cada peca ");
            double preco2 = scanner.nextDouble();
        
        double total;

        total = preco1 * qntd + preco2 * qntd2;


	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        


        scanner.close();
    }
    
}
