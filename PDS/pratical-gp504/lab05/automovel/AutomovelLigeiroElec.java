package lab05.automovel;

public class AutomovelLigeiroElec extends AutomovelLigeiro implements VeiculoEletrico {

    public int capacidade, potenciaCarregamento;

    public AutomovelLigeiroElec(String matricula, String marca, String modelo, int potencia, String nif, int autonomia, int capacidade, int potenciaCarregamento) {
        super(matricula, marca, modelo, potencia, nif, autonomia);
        this.capacidade = capacidade;
        this.potenciaCarregamento = potenciaCarregamento;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPotenciaCarregamento() {
        return this.potenciaCarregamento;
    }

    public void setPotenciaCarregamento(int potenciaCarregamento) {
        this.potenciaCarregamento = potenciaCarregamento;
    }

    public int autonomia() {
        return this.autonomia;
    }

    public void carregar(int perc) {
        if (this.autonomia < 100) {
            this.autonomia += perc;
            if (this.autonomia > 100) {
                this.autonomia = 100;
            }
        }
    }

    @Override
    public String toString() {
        return "AutomovelLigeiroElec: " + this.matricula + "; " + this.marca + "; " + this.modelo + "; " + this.potencia + "; " + this.nif + "; " + this.autonomia + "; " + this.capacidade + "; " + this.potenciaCarregamento;
    }
}