package Vetores;
import java.util.Scanner;

public class Atv78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite um nome para buscar: ");
        String nomeBuscado = scanner.nextLine();

        boolean encontrou = false;

        for (int i = 0; i < 10; i++) {
            if (nomeBuscado.equals(nomes[i])) {
                encontrou = true;
                break;
            }
        }

        if (encontrou) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
    }
}
