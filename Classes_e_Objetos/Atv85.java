package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv85 {
    public static void main(String[] args) {
        ArrayList<Double> temperatura = new ArrayList<Double>(365);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 365; i++) {
            System.out.println("Entre com a temperatura média do dia " + (i + 1) + ": ");
            temperatura.add(scanner.nextDouble());
        }

        double menorTemp = Double.MAX_VALUE;
        double maiorTemp = Double.MIN_VALUE;
        double mediaTemp = 0;

        for (int i = 0; i < 365; i++) {
            if (temperatura.get(i) > maiorTemp) {
                maiorTemp = temperatura.get(i);
            }
            if (temperatura.get(i) < menorTemp) {
                menorTemp = temperatura.get(i);
            }
            mediaTemp += temperatura.get(i);
        }
        mediaTemp /= 365;

        int diasInferior = 0;

        for (int i = 0; i < 365; i++) {
            if (temperatura.get(i) < mediaTemp) {
                diasInferior++;
            }
        }

        System.out.println("Menor Temperatura do Ano: " + menorTemp);
        System.out.println("Maior temperatura do Ano: " + maiorTemp);
        System.out.println("Média de Temperaturas do Ano: " + mediaTemp);
        System.out.println("Número de dias no ano em que a temperatura foi inferior à média anual: " + diasInferior);
    }
}
