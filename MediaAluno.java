import java.util.Scanner;

public class MediaAluno {
public static void main(String[] args) {
    //Instanciando o scanner
    Scanner scanner = new Scanner(System.in);

    //Nome do aluno

    System.out.println("Bem vindo ao sistema educacional cisbe, digite seu nome");

    String nomeAluno = scanner.nextLine();

    System.out.println("Bem vindo(a), "+ nomeAluno);

    //Nota 1
    System.out.println("Para ver a media, digite suas notas");
    System.out.println("Digite a nota 1");

    double nota1 = scanner.nextDouble();

    System.out.println("Digite a nota 2");

    double nota2 = scanner.nextDouble();

    double somaNotas = nota1 + nota2;

    double mediaNotas = somaNotas / 2;

        
        if (mediaNotas == 10 ) {
        System.out.println("Voce passou com a nota de: " + mediaNotas + " e esta aprovado(a)! Parabens! Voce arrasou!");
        } else if (mediaNotas >=6 ) {
            System.out.println("Voce foi aprovado(a).");
        } else if (mediaNotas < 4.5) {
            System.out.println("Sua media foi: " + mediaNotas + "e voce foi reprovado sem possibilidade de recuperar.");
            }  else {
                System.out.println("Sua media foi: " + mediaNotas + "  e voce esta de recuperacao");
        }

    scanner.close();


    
    }
}
