package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv87 {
    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList<Integer>(11);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor.add(scanner.nextInt());
        }

        for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (vetor.get(j) > vetor.get(j + 1)) {
                    int temp = vetor.get(j);
                    vetor.set(j, vetor.get(j + 1));
                    vetor.set(j + 1, temp);
                }
            }
        }

        System.out.print("Digite o novo número a ser inserido: ");
        int novoNumero = scanner.nextInt();

        int i;
        for (i = 9; i >= 0 && novoNumero < vetor.get(i); i--) {
            vetor.add(i + 1, vetor.get(i));
        }
        vetor.add(i + 1, novoNumero);

        System.out.println("Vetor ordenado com o novo número:");
        for (i = 0; i < 11; i++) {
            System.out.print(vetor.get(i) + " ");
        }
    }
}
