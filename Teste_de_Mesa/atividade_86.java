package Vetores;
import java.util.Scanner;
public class Atv84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o valor de N: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] soma = new int[n];

        for(int i = 0; i<n; i++){
            System.out.println("Digite o "+ (i+1)+"º valor do vetor A:");
            a[i] = scanner.nextInt();
            System.out.println("Digite o "+ (i+1)+"º valor do vetor B:");
            b[i] = scanner.nextInt();
        }
        for(int i=0; i < n; i++) {
            soma[i] = a[i] + b[i];
        }

        System.out.println("Vetor Soma: ");
        for(int i=0; i<n; i++) {
            System.out.println(soma[i]);
        }
    }
    
}
