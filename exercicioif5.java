import java.util.Scanner;
public class exercicioif5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Insira uma letra.");

        char letra = scanner.nextLine().toLowerCase().charAt(0);
        scanner.close();

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
                break;
            
            }
    }
}
