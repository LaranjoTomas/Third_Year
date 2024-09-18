package lab05.automovel;

public class AutomovelLigeiro extends Veiculo{

    public int autonomia;
    public String nif;

    public AutomovelLigeiro(String matricula, String marca, String modelo, int potencia, String nif, int autonomia) {
        super(matricula, marca, modelo, potencia);
        this.nif = nif;
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return this.autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "AutomovelLigeiro: " + this.matricula + "; " + this.marca + "; " + this.modelo + "; " + this.potencia + "; " + this.nif + "; " + this.autonomia;
    }
}