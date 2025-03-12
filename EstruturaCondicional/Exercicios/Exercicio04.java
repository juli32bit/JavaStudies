package EstruturaCondicional.Exercicios;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
    
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Hora inicial do jogo");
            int inicio = scanner.nextInt();
        System.out.println("Hora final do jogo");
            int fim = scanner.nextInt();

            int duracao;

        if (inicio < fim ) {
                duracao = fim - inicio;
            }  else {
               duracao = 24 - inicio + fim;
            }
            System.out.println("O jogo durou: " + duracao + " horas");

        scanner.close();
    }

}
