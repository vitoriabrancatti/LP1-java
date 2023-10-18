public class Cadeira {
    private String material;
    private String cor;
    private int numeroPernas;
    private boolean reclinavel;

    public Cadeira(String material, String cor, int numeroPernas) {
        this.material = material;
        this.cor = cor;
        this.numeroPernas = numeroPernas;
        this.reclinavel = false;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroPernas() {
        return numeroPernas;
    }

    public void setNumeroPernas(int numeroPernas) {
        this.numeroPernas = numeroPernas;
    }

    public boolean isReclinavel() {
        return reclinavel;
    }

    public void reclinar() {
        reclinavel = true;
        System.out.println("Cadeira reclinada.");
    }

    public void levantar() {
        reclinavel = false;
        System.out.println("Cadeira levantada.");
    }

    public void sentar() {
        System.out.println("Sentando na cadeira.");
    }

    public void empurrar() {
        System.out.println("Empurrando a cadeira.");
    }
}
