import java.util.Scanner;
import java.util.ArrayList;

public class TesteFibonacci {
    public static void main(String[] args) {
        fibonaci();
        inverterFrase();
    }

    public static void fibonaci() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para eu verificar na sequência fibonacci: ");
        int valor = input.nextInt();

        boolean encontrar = false;
        int a = 0;
        int b = 1;

        while (a <= valor) {
            if (a == valor) {
                encontrar = true;
                break;
            }

            int c = a + b;
            a = b;
            b = c;

            System.out.print(c + " ");
        }

        if (encontrar) {
            System.out.println("\nO valor " + valor + " está na sequência de Fibonacci!");
        } else {
            System.out.println("\nO valor " + valor + " não está na sequência de Fibonacci.");
        }
    }

    public static void inverterFrase() {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();

        int tamanho = frase.length();

        String fraseinvertida = "";

        for (int i = tamanho - 1; i >= 0; i--) {
            fraseinvertida += frase.charAt(i);
        }
        System.out.println("Frase invertida: " + fraseinvertida);
    }
}
