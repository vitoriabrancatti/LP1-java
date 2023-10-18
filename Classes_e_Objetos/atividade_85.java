package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o valor de N: ");
        int n = scanner.nextInt();

        ArrayList<Integer> a = new ArrayList<Integer>(n);
        ArrayList<Integer> b = new ArrayList<Integer>(n);
        ArrayList<Integer> soma = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor do vetor A:");
            a.add(scanner.nextInt());
            System.out.println("Digite o " + (i + 1) + "º valor do vetor B:");
            b.add(scanner.nextInt());
        }

        for (int i = 0; i < n; i++) {
            soma.add(a.get(i) + b.get(i));
        }

        System.out.println("Vetor Soma: ");
        for (int i = 0; i < n; i++) {
            System.out.println(soma.get(i));
        }
    }
}
