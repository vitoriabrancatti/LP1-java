import java.util.Scanner;

public class At09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o salário atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Entre com a porcentagen de aumento: ");
        double porcentagem = scanner.nextDouble();

        System.out.println("\nNovo salário: "+novoSalario(salarioAtual, porcentagem));
    }
    public static double novoSalario(double salario, double aumento){
        return (salario+(salario*(aumento/100)));
    }

}
