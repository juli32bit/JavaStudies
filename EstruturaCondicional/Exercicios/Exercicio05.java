package EstruturaCondicional.Exercicios;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        //om base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar.
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o produto");
            int produto = scanner.nextInt();
        System.out.println("Quantidade do produto");
            int quantidade = scanner.nextInt();

        double total = 0.0;
        
        if (produto == 1) {
            total = quantidade * 4.00;
        } else if (produto == 2) {
            total = quantidade * 4.50;
        } else if (produto == 3) {
            total = quantidade * 5.00;
        } else if (produto == 4) {
            total = quantidade * 2.00;
        } else if (produto == 5) {
            total = quantidade * 1.50;
        }
        
        System.out.printf("Total: R$ %.2f%n", total);
        
        



        scanner.close();

    }
}
