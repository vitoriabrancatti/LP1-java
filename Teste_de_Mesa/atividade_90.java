package Vetores;
import java.util.Scanner;

public class Atv88 {
    public static void main(String[] args) {
        int[] v = new int[20];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            v[i] = scanner.nextInt();
        }

        System.out.print("Entre com o valor de N: ");
        int n = scanner.nextInt();

        boolean existe = false;

        for (int i = 0; i < 20; i++) {
            if (n == v[i]) {
                existe = true;
                break;
            }
        }

        if (existe) {
            int[] novoVetor = new int[19];
            int newIndex = 0;

            for (int i = 0; i < 20; i++) {
                if (v[i] != n) {
                    novoVetor[newIndex] = v[i];
                    newIndex++;
                }
            }

            System.out.println("Novo vetor sem o " + n + ": ");
            for (int i = 0; i < 19; i++) {
                System.out.println(novoVetor[i]);
            }
        } else {
            System.out.println("O " + n + " não está no vetor.");
        }
    }
}
