package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> v1 = new ArrayList<Integer>(15);
        ArrayList<Integer> v2 = new ArrayList<Integer>(15);

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor do vetor V1: ");
            v1.add(sc.nextInt());

            System.out.print("Digite o " + (i + 1) + "º valor do vetor V2: ");
            v2.add(sc.nextInt());
        }

        int quantVezes = 0;
        for (int i = 0; i < 15; i++) {
            if (v1.get(i).equals(v2.get(i))) {
                quantVezes++;
            }
        }

        System.out.println("Quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições: " + quantVezes);
    }
}
