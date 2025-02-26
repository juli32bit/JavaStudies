import java.util.Scanner;
public class exercicioif4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Escolha um numero de 1 a 7");

    int dia = scanner.nextInt();
    scanner.close();

    switch (dia) {
        case 1: 
            System.out.println("Domingo");
            System.out.println("Fim de semana");
            break;
        case 7: 
            System.out.println("Sabado");
            System.out.println("Fim de semana");
            break;
        case 2: 
            System.out.println("Segunda");
            System.out.println("Dia util");
            break;
        case 3: 
            System.out.println("Terca");
            System.out.println("Dia util");
            break;
        case 4: 
            System.out.println("Quarta");
            System.out.println("Dia util");
            break;
        case 5: 
            System.out.println("Quinta");
            System.out.println("Dia util");
            break;
        case 6: 
            System.out.println("Sexta");
            System.out.println("Dia util");
            break;
        
        


        
        }
    }
}
