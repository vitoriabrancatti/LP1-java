package Listas;
import java.util.ArrayList;
import java.util.Scanner;

public class Atv82 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(10);
        ArrayList<Integer> m = new ArrayList<Integer>(10);
        int x;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor");
            a.add(scanner.nextInt());
        }

        System.out.println("Digite o valor de X: ");
        x = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            m.add(a.get(i) * x);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("M[" + i + "] = " + m.get(i));
        }
    }
}
