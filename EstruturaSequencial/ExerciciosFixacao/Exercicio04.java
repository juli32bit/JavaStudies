package ExerciciosFixacao;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero do funcionario");
            double num = scanner.nextDouble();
        System.out.println("Horas trabalhadas");
            double hrsTrabalhadas = scanner.nextDouble();
        System.out.println("Valor por hora");
            double valorHora = scanner.nextDouble();
        
        double salario = hrsTrabalhadas * valorHora;

        System.out.println("NUMBER = "+ num);
        System.out.printf("SALARY = U$ %.2f",salario);
        

        scanner.close();


    }
}
