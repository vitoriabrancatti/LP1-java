package Listas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Atv78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
        }

        System.out.print("Digite um nome para buscar: ");
        String nomeBuscado = scanner.nextLine();

        boolean encontrou = false;

        for (String nome : nomes) {
            if (nomeBuscado.equals(nome)) {
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
