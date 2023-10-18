package Listas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atv91 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();
            lista.add(numero);
        }

        List<Integer> numerosRepetidos = new ArrayList<>();

        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).equals(lista.get(j))) {
                    if (!numerosRepetidos.contains(lista.get(i))) {
                        numerosRepetidos.add(lista.get(i));
                    }
                }
            }
        }

        if (!numerosRepetidos.isEmpty()) {
            System.out.println("Números repetidos:");
            for (Integer numero : numerosRepetidos) {
                System.out.println(numero + " na posição " + (lista.indexOf(numero) + 1));
            }
        } else {
            System.out.println("Não há números repetidos na lista.");
        }
    }
}
