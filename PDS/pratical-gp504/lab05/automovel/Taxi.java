package lab05.automovel;

public class Taxi extends AutomovelLigeiro {

    private String licença;

    public Taxi(String matricula, String marca, String modelo, int potencia, String nif, int autonomia, String licença) {
        super(matricula, marca, modelo, potencia, nif, autonomia);
        this.licença = licença;
    }
    
    public String getLicença() {
        return this.licença;
    }

    public void setLicença(String licença) {
        this.licença = licença;
    }

    public String toString() {
        return "Taxi: " + this.matricula + "; " + this.marca + "; " + this.modelo + "; " + this.potencia + "; " + this.nif + "; " + this.autonomia + "; " + this.licença;
    }
}