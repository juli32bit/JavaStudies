import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();
        double imposto;

        if (salario <= 2000.00) {
            imposto = 0.0;
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else if (salario <= 4500.00) {
            imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        }
        scanner.close();


    }
    
}