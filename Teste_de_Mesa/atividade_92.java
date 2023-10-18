package Vetores;
import java.util.Scanner;

public class Atv90 {
    public static void main(String[] args) {
        int[] vetor = new int[30];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 30; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um número para contar: ");
        int numeroParaContar = scanner.nextInt();

        int contador = 0;

        for (int i = 0; i < 30; i++) {
            if (vetor[i] == numeroParaContar) {
                contador++;
            }
        }

        System.out.println("O número " + numeroParaContar + " aparece no vetor " + contador + " vezes.");
    }
}
