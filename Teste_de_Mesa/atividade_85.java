package Vetores;
import java.util.Scanner;
public class Atv83 {
    public static void main(String[] args) {
        int[] vetor = new int[20];
        Scanner  scanner = new Scanner(System.in);

        for(int i = 0; i<20; i++){
            System.out.println("Digite o "+ (i+1)+"º valor:");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Inverso do vetor:");
        for(int i = 19; i>=0; i--){
            System.out.println(vetor[i]);
        }
    }
}
