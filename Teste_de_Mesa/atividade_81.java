package Vetores;
import java.util.Scanner;

public class Atv79 {
    public static void main(String[] args){
        double[] notas = new double[20];
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        int quantAlunosAcimaMedia = 0;
        
        for(int i = 0; i <20; i++){
            System.out.println("Digite a nota do aluno "+(i+1)+":" );
            notas[i] = scanner.nextDouble();
        }
        for(int i = 0; i<20; i++){
            media += notas[i];
            if(notas[i] >= 5){
                quantAlunosAcimaMedia++;
            }
        }

        media = media/20;
        System.out.println("A média da turma é "+ media+"\nQuantidade de alunos que obtiveram a nota acima da média: "+quantAlunosAcimaMedia);
    }
}
