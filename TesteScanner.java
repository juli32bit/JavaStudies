import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) {
        //1- Testando Scanner

        Scanner scanner = new Scanner(System.in);

        //Mensagem para o usuario
        System.out.println("Digite seu nome: ");
        
        //resgata o valor do terminal
        String nome = scanner.nextLine();

        //exibe o valor
        System.out.println("Seu nome eh: " + nome + "!");

        //ler um valor inteiro

        System.out.println("Digite um numero");

        int numero = scanner.nextInt();

        System.out.println("O numero que voce digitou eh: " + numero);
        //

        // Fechamento do scanner para evitar memory leak.
        
        //
        

        //Problema do nextLine

        System.out.println("Digite um numero: ");
       int n = scanner.nextInt();

       scanner.nextLine();

       System.out.println("Digite um texto qualquer");
       String txt = scanner.nextLine();
        
       System.out.println("Os dados sao: n =  " + n + " texto: " + txt);
 
       scanner.close();

    }


}
