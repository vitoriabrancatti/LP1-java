import java.util.Scanner;

public class At08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com a quantidade de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.println("Entre com a quantidade de votos em branco: ");
        int quantBranco = scanner.nextInt();

        System.out.println("Entre com a quantidade de votos nulos: ");
        int quantNulos = scanner.nextInt();

        System.out.println("Entre com a quantidade de votos válidos: ");
        int quantValidos = scanner.nextInt();

        System.out.println("\n==================\n");
        System.out.println("Percentuais em relação ao total: ");
        System.out.println("Votos em branco: "+calculoPorcentagem(totalEleitores, quantBranco)+"%");
        System.out.println("Votos nulos: "+calculoPorcentagem(totalEleitores, quantNulos)+"%");
        System.out.println("Votos válidos: "+calculoPorcentagem(totalEleitores, quantValidos)+"%");
    }
    public static double calculoPorcentagem(int total, int valor){
        return (valor*100)/total;
    }
}
