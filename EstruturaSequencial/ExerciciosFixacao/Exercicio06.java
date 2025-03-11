package ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor A");
            double A = scanner.nextDouble();
        System.out.println("Valor B");
            double  B = scanner.nextDouble();
        System.out.println("Valor C");
            double C = scanner.nextDouble();

        double areaTri = A * C / 2; //A = B.H / 2
            System.out.printf("TRIANGULO: %.3f%n",areaTri);
        
        double pi = 3.14159;
        double areaCirc = pi * Math.pow(C,2);
            System.out.printf("CIRCULO: %.3f %n",areaCirc);

        double areaTrap = (A + B) * C / 2;
            System.out.printf("TRAPEZIO: %.3f%n",areaTrap);
        
        double areaQuad = B * B;
            System.out.printf("QUADRADO:%.3f %n", areaQuad);

        double areaRet = A * B;
            System.out.printf("RETANGULO:%.3f %n",areaRet);


        scanner.close();
    }
}
