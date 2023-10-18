package Vetores;
import java.util.Scanner;
public class Atv85 {
    public static void main(String[] args) {
        double[] temperatura = new double[365];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<365; i++){
            System.out.println("Entre com a temperatura média do dia "+(i+1)+": ");
            temperatura[i] = scanner.nextDouble();
        }
        
        double menorTemp = 0;
        double maiorTemp = 0;
        double mediaTemp = 0;
    
        for(int i = 0; i<365; i++){
            if(i == 0){
                menorTemp = temperatura[i];
                maiorTemp = temperatura[i];
            }
            if(temperatura[i]>maiorTemp){
                maiorTemp = temperatura[i];
            }
            if(temperatura[i]<menorTemp){
                menorTemp = temperatura[i];
            }
            mediaTemp+=temperatura[i];
        }
        mediaTemp /= 365;
        int diasInferior = 0;

        for(int i = 0; i<365; i++){
            if(temperatura[i]<mediaTemp){
                i++;
            }
        }
        
        System.out.println("Menor Temperatura do Ano: "+menorTemp);
        System.out.println("Maior temperatura do Ano: "+maiorTemp);
        System.out.println("Média de Temperaturas do Ano: "+mediaTemp);
        System.out.println("Número de dias no ano em que a temperatura foi inferior a média anual: "+diasInferior);
    }
}
