import java.util.Scanner;
public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Insira o valor de a");
            double a = scanner.nextDouble(); 
        System.out.println("Insira o valor de b");
            double b = scanner.nextDouble();
        System.out.println("Insira o valor de c");
            double c = scanner.nextDouble();
        

            double delta;

        delta = Math.pow(b, 2.0) - 4*a*c;

        if (delta < 0) {
            System.out.println("A equacao nao possui raizes reais");
        } else {
            double x1 = (-b + Math.sqrt(delta) / (2.0 * a));
            double x2 = (-b - Math.sqrt(delta) / (2.0 * a));

            System.out.println("O valor de x1 eh: " + x1);
            System.out.println("O valor de x2 eh: " + x2);
        }

        




        scanner.close();
    }
}
