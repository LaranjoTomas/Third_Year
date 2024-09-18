package lab05.automovel;

public class PesadoMerc extends Veiculo{

    private String nif;
    private int carga, capacidade;
    
    public PesadoMerc(String matricula, String marca, String modelo, int potencia, String nif, int carga, int capacidade) {
        super(matricula, marca, modelo, potencia);
        this.nif = nif;
        this.carga = carga;
        this.capacidade = capacidade;

    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "PesadoMerc: " + this.matricula + "; " + this.marca + "; " + this.modelo + "; " + this.potencia + "; " + this.nif + "; " + this.carga + "; " + this.capacidade;
    }
}