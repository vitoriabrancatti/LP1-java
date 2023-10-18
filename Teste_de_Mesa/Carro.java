package Vetores;
import java.util.Scanner;

public class Atv91 {
    public static void main(String[] args) {
        int[] VET = new int[50];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            VET[i] = scanner.nextInt();
        }

        boolean[] repetidos = new boolean[50];

        for (int i = 0; i < 49; i++) {
            for (int j = i + 1; j < 50; j++) {
                if (VET[i] == VET[j]) {
                    repetidos[i] = true;
                    repetidos[j] = true;
                }
            }
        }

        boolean temRepetidos = false;

        for (int i = 0; i < 50; i++) {
            if (repetidos[i]) {
                temRepetidos = true;
                System.out.println("Número repetido " + VET[i] + " na posição " + (i + 1));
            }
        }

        if (!temRepetidos) {
            System.out.println("Não há números repetidos no vetor.");
        }
    }
    
}
