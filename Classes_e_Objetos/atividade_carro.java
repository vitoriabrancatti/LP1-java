/*
* @author Jhony Souza
* */
public class Carro {
    /*ATRIBUTOS DA CLASSE*/
    private double velocidadeAtual;
    private String placa;
    private String cor;
    private String marca;
    private String modelo;

    /*CONSTRUTOR VAZIO*/
    public Carro() {
    }
    /*CONSTRUTOR COM VALOR DEFINIDO*/
    public Carro(double velocidadeAtual, String placa, String cor, String marca, String modelo){
        this.velocidadeAtual = velocidadeAtual;
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    /*
    * MÉTODOS GETTERS E SETTERS
    * GETTER - PEGAR O VALOR
    * SETTER - ALTERAR O VALOR
    * */
    public void setVelocidadeAtual(double velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    /*MÉTODOS CRIADOS SEPARADOS*/
    public void andar(double distancia){
        System.out.println("Estamos andando na velocidade de "+this.velocidadeAtual+" km/h em uma distância de "+distancia+"km");
    }
    public void acelerar(){
        System.out.println("Estamos acelerando...");
    }
    public void freiar(){
        System.out.println("Freiando...");
    }
}
