import java.util.Scanner;
public class Operadores {
    public static void main(String[] args) {
        // AND
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua idade");

        int idade = scanner.nextInt();
        
        if (idade >= 18) {
            System.out.println("voce e maior de idade e pode dirigir");
        } else {
            System.out.println("Espere alguns anos para dirigir.");
        }

        

        int i = 18;
        boolean carteiraMotorista = true;

        System.out.println(i >= 18 && carteiraMotorista);

        System.out.println(i >= 18 && carteiraMotorista == false);
    
    

        //OR

        boolean estaChovendo = false;
        boolean temGuardaChuva = true;

        System.out.println(estaChovendo || temGuardaChuva);

        System.out.println(false || false);

        System.out.println(10 > 20 || 100 == 200);

        int idade2 = 18;

        boolean membro = true;

        if (idade2 >= 18 || membro) {
            System.out.println("Voce pode entrar");
        } else {
            System.out.println("Voce nao pode entrar");
        }



        // NOT

        System.out.println(estaChovendo); // false
        System.out.println(!estaChovendo); //true

        System.out.println(estaChovendo || !temGuardaChuva); // false, um ou outro precisa ser true para ser true

        scanner.close();
    }

}
