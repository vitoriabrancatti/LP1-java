package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv86 {
    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList<Integer>(10);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor.add(scanner.nextInt());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (vetor.get(j) > vetor.get(j + 1)) {
                    int temp = vetor.get(j);
                    vetor.set(j, vetor.get(j + 1));
                    vetor.set(j + 1, temp);
                }
            }
        }

        System.out.println("Vetor ordenado em ordem crescente:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor.get(i) + " ");
        }
    }
}
