import java.util.Scanner;

public class At11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Entre com o número de carros vendidos: ");
        int numeroCarros = scanner.nextInt();

        System.out.println("Entre com o valor total de vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.println("Entre com o valor que recebe por cada carro vendido: ");
        double valorRecebido = scanner.nextDouble();

        System.out.println("O valor do salário final será: "+calcularSalarioFinal(salarioFixo, numeroCarros, valorTotalVendas, valorRecebido));
    }
    public static double calcularSalarioFinal(double salarioFixo, int numeroCarros, double valorTotalVendas, double valorRecebidoPorCarro){
        return (salarioFixo+(valorRecebidoPorCarro*numeroCarros)+(valorTotalVendas*0.05));
    }
}
