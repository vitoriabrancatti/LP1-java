package Vetores;
import java.util.Scanner;

public class Atv87 {
    public static void main(String[] args) {
        int[] vetor = new int[11]; 
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.print("Digite o novo número a ser inserido: ");
        int novoNumero = scanner.nextInt();
        int i;
        for (i = 9; i >= 0 && novoNumero < vetor[i]; i--) {
            vetor[i + 1] = vetor[i];
        }
        vetor[i + 1] = novoNumero;

        System.out.println("Vetor ordenado com o novo número:");
        for (i = 0; i < 11; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
