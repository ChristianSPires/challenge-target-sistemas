import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para saber se ele está presente na sequência de Fibonacci: ");
        int num = validaNumero(sc.nextInt());

        ArrayList<Integer> fibonacci = criaSequencia(num);
        verificaNumeroNaSequencia(fibonacci, num);
    }

    private static int validaNumero(int num) {
        Scanner sc = new Scanner(System.in);

        while (num < 0) {
            System.out.print("Número inválido. Por favor, digite um número não negativo: ");
            num = sc.nextInt();
        }

        return num;
    }

    private static ArrayList<Integer> criaSequencia(int num) {
        ArrayList<Integer> fibonacci = new ArrayList<>();

        fibonacci.add(0);
        fibonacci.add(1);

        while (fibonacci.get(fibonacci.size() - 1) < num) {
            int novoNumeroSequencia = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            fibonacci.add(novoNumeroSequencia);
        }

        return fibonacci;
    }

    private static void verificaNumeroNaSequencia(ArrayList<Integer> fibonacci, int num) {
        if (fibonacci.get(fibonacci.size() - 1) == num) {
            System.out.println("O número está presente na sequência!");
        } else {
            System.out.println("O número não está presente na sequência!");
        }
    }
}