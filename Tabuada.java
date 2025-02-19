package exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite um numero ");
        int n = scanner.nextInt();
        //exercicio 1 - criar uma tabuada
        //para i = 1, sendo i <= 10, i + 1
        for (int i = 1 ;i <=10;i++) {
            
            System.out.println(n + " * " + i + " = "+ n * i);
            
        }
        scanner.close();
        
    }
}
