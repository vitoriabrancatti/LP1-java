package Vetores;
import java.util.Scanner;
public class Atv89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] v1 = new int[15];
        int[] v2 = new int[15];

        for(int i = 0; i<15; i++){
            System.out.print("Digite o "+(i+1)+"º valor do vetor V1: ");
            v1[i] = sc.nextInt();

            System.out.print("Digite o "+(i+1)+"º valor do vetor V2: ");
            v2[i] = sc.nextInt();
        }

        int quantVezes = 0;
        for(int i = 0; i<15; i++){
            if(v1[i] == v2[i]){
                quantVezes++;
            }
        }

        System.out.println("Quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições: "+quantVezes);

    }
}
