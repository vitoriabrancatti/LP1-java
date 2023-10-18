import java.util.Scanner;

public class At10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        System.out.println("O valor do carro para o consumidor é: "+calculoConsumidor(custoFabrica));
    }
    public static double calculoConsumidor(double custoFabrica){
        return (custoFabrica+(custoFabrica*0.28)+(custoFabrica*0.45));
    }
}
