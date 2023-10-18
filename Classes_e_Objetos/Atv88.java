package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv88 {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<Integer>(20);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            v.add(scanner.nextInt());
        }

        System.out.print("Entre com o valor de N: ");
        int n = scanner.nextInt();

        boolean existe = v.contains(n);

        if (existe) {
            v.removeIf(element -> element == n);

            System.out.println("Novo vetor sem o " + n + ": ");
            for (int i = 0; i < 19; i++) {
                System.out.println(v.get(i));
            }
        } else {
            System.out.println("O " + n + " não está no vetor.");
        }
    }
}
