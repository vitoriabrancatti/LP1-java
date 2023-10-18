package Vetores;
import java.util.Scanner;

public class Atv81 {
    public static void main(String[] args) {
        int[] q = new int[20];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<20; i++){
            System.out.println("Entre com um número inteiro positivo: ");
            int verificador = scanner.nextInt();

            if(verificador <0) {
                System.out.println("É aceito apenas números positivos");
                i--;
             }else{
                q[i] = verificador; 
             }
        } 

        int menorvalor = 0;
        int posicao = 0;
        for(int i= 0; i<20; i++){
            if(i == 0){
                menorvalor = q[i];
                posicao = i;
            }
            if(q[i]<menorvalor){
                menorvalor = q[i];
                posicao = i;
            }
        }

        System.out.println("Menor Valor: "+menorvalor+"\nPosição: "+(posicao+1));
    
    }
}
