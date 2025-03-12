package EstruturaCondicional;
import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas horas?");
            int hora = scanner.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
            } else if (hora < 18) {
                System.out.println("Boa tarde!");
                } else {
                    System.out.println("Boa noite!");
                }

        scanner.close();
    
    }
}
