public class Switch {
    public static void main(String[] args) {
        //11 - switch case break
        // Para validar dia de semana baseado no numero

        //1- Domingo
        switch (1) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
           case 3:
                System.out.println("3");
            default: 
                System.out.println("Dia nao encontrado");
        }




        int diaDaSemana = 1; 
        int a = 4;
        int b = 10;
        
        switch (diaDaSemana) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a * b);
                break;
            case 3:
                System.out.println(b / a);
                break;
            }
        //12 - switch case default =>  (else do switch)

        int n = 10;

        switch (n) {
            case 1:
                System.out.println("Eh 1");
                break;
            case 2: 
                System.out.println("Eh 2");
                break;
            default: //importante para feedback visual
                System.out.println("Nao eh 1 nem 2, numero nao encontrado");
                break;
        }
    }

    //Switch sem brake - fal;lthrough
    //13 - switch case fallthrough
    //Quando nao tem break, ele executa todos os cases abaixo do case que foi encontrado

    

}

