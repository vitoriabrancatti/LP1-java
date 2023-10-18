import java.util.Scanner;

public class At07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Você possui:\nAnos: "+ano(idade)+"\nMeses: "+meses(idade)+"\nDias: "+dias(idade));
    }
    public static int ano(int ano){
        return ano;
    }
    public static int meses(int meses){
        return (meses*12);
    }
    public static int dias(int dias){
        return (dias*365);
    }
}
