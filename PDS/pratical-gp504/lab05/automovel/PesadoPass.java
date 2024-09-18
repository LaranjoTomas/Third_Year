package lab05.automovel;

public class PesadoPass extends Veiculo {
    
    public int autonomia, carga;
    public String nif;

    public PesadoPass (String matricula, String marca, String modelo, int potencia, int autonomia, String nif, int carga) {
        super(matricula, marca, modelo, potencia);
        this.autonomia = autonomia;
        this.nif = nif;
        this.carga = carga;
    }

    public int getAutonomia() {
        return this.autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "PesadoPass: " + this.matricula + "; " + this.marca + "; " + this.modelo + "; " + this.potencia + "; " + this.autonomia + "; " + this.nif + "; " + this.carga;
    }
}