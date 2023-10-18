import java.util.Scanner;

public class At06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.println("Informe a altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = (base*altura)/2;
        System.out.println("A área do triângulo é "+area);
    }
}
