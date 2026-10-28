import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        int numero =  scanner.nextInt();
        int contador = 1;

        while (contador <= 10){
            int multiplicacao = contador * numero;
            System.out.println(numero + "x" + contador +"= " + multiplicacao);

            contador++ ;
        }
    }
}