package Vetores;
import java.util.Scanner;
public class Atv82 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] m = new int[10];
        int x;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<10; i++){
            System.out.println("Digite o "+ (i+1)+ "º valor");
            a[i] = scanner.nextInt();
        }
        System.out.println("Digite o valor de X: ");
        x = scanner.nextInt();

        for(int i = 0; i<10;i++){
            m[i] = a[i]*x;
        }
        for(int i = 0; i<10;i++){
            System.out.println("M["+i+"] = "+m[i]);
        }
    }
}
