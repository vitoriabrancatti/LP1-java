

public class Aluno {
    private String nome;
    private int idade;
    private double nota;
    public Aluno(){

    }
    public Aluno(String nome, int idade, double nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setNota(double nota){
        this.nota = nota;
    }
    public double getNota(){
        return this.nota;
    }

    public void visualizarDetalhes(){
        System.out.println("Nome do Aluno: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Nota: "+this.nota);
    }
    public double atribuirNota(double nota){
        return this.nota+=nota;
    }
    public void verificarAprovacao(){
        if(this.nota>=5){
            System.out.println("Aluno "+this.nome+" APROVADO com "+this.nota+" de nota");
        }else{
            System.out.println("Aluno "+this.nome+" REPROVADO com "+this.nota+" de nota");
        }
    }
}
