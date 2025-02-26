import java.util.Scanner;
public class exercicioif {
    public static void main(String[] args) {
          /* 
            * Verifique se o numero esta no intervalo de 10 a 20, inclusive. se estiver
           * 
          */

          Scanner scanner = new Scanner(System.in);
          System.out.println("Insira um numero");

          int numero = scanner.nextInt();

          if (numero >=10 && numero <=20) {
            System.out.println("Dentro do intervalo");
          } else {
            System.out.println("Fora do intervalo");
          }
          scanner.close();
    }
}
