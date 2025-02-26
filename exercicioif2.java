import java.util.Scanner;
public class exercicioif2 {
    

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira usuario");
    String usuario = scanner.nextLine();
    

    System.out.println("Insira sua senha");
    String senha = scanner.nextLine();
    
    String usuarioCorreto = "admin";
    String senhaCorreta = "1234";
    
    
    if (senha.equals(senhaCorreta) && usuario.equals(usuarioCorreto)) {
        System.out.println("Usuario autenticado");
    } else {
        System.out.println("Tente novamente");
    }
        
    scanner.close();
}
}
    