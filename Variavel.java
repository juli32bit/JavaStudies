public class Variavel {
    public static void main(String[] args) {
        String nome = "julia";
        int idade = 24;
        System.out.println(nome);
        System.out.println(idade);

        String teste = "teste";

        String testando = teste;
        System.out.println(testando);

        long numeroGrande = 9999999;

        System.out.println(numeroGrande);

        String firstName = "Julia";
        String secondName = "Mesquita";

        System.out.println(firstName + " " + secondName);

        String fullName = firstName + " " + secondName;

        System.out.println(fullName);

        // char - S

        char letra = 'A';

        System.out.println(letra);

        String letra2 = "A";

        System.out.println(letra2);

        char simbolo = '$';

        System.out.println(simbolo);


        int n = 42;
        
        System.out.println(n + 5);
        System.out.println(n * 5);
        System.out.println(n / 5);

        int soma = n + 12;

        System.out.println(soma);


        //long numeros inteiros muuuito grandes - 8 bytes seguido de L para indicar o tipo

        long numeroEnorme = 780000000000000L;

        System.out.println(numeroEnorme);

//Double

double preco = 19.99;

System.out.println(preco);

System.out.println(preco - 2);

System.out.println(preco / 2);

double pi = 3.141_592_123;

System.out.println(pi);

double valorComD = 12.1D;

System.out.println(valorComD);

//Operadores aritmeticos

int soma2 = 12 + 5;

int divisao = 12 / 2;

float divisao2 = 12f / 5; //colocando o ponto flutuante para demosntrar o resultado correto

System.out.println(soma2);
System.out.println(divisao);
System.out.println(divisao2);
System.out.println(10.0 / 3);
System.out.println(10 % 3); // o que sobra da divisao exata

int number = 55;

++number;

System.out.println(number);

--number;

System.out.println(number);

number+=5;

System.out.println(number);

number-=5;

System.out.println(number);

//type casting

//(Widening) casting implicito
int numero2 = 42;

long numeroLong = numero2;

double numeroDouble = numero2;

System.out.println(numeroLong);

System.out.println(numeroDouble);



//casting explicito (narrowing)

double valorDouble = 9.78;
int valorInt = (int) valorDouble;

System.out.println(valorInt);

//casting de char para int 

char letra3 = 'A';

int codigo = (int) letra3;

System.out.println(codigo);

//12- constantes

final int DIAS_DA_SEMANA = 7;

System.out.println("DIas da semana: " + DIAS_DA_SEMANA);


/*Inferencia de tipo com var em JAVA
Tipo estatico, imutavel
deve ser inicializado no momento da declaracao e nao pode ser usado para variaveis nao inicializadas
*/
var z = 10;

System.out.println(z);




    // comentario
    /*comentario de varias linhas! */
    /**Comentario de documentacao!*/
    }
}
