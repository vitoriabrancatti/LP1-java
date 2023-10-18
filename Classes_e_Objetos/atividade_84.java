package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv83 {
    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList<Integer>(20);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor:");
            vetor.add(scanner.nextInt());
        }

        System.out.println("Inverso do vetor:");

        for (int i = vetor.size() - 1; i >= 0; i--) {
            System.out.println(vetor.get(i));
        }
    }
}
