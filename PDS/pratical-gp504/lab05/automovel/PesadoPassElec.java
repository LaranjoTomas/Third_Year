package lab05.automovel;

public class PesadoPassElec extends PesadoPass implements VeiculoEletrico {

    public int capacidade, potenciaCarregamento;

    public PesadoPassElec(String matricula, String marca, String modelo, int potencia, int autonomia, String nif, int carga, int capacidade, int potenciaCarregamento) {
        super(matricula, marca, modelo, potencia, autonomia, nif, carga);
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

    public void carregar(int perc) {
        if (this.autonomia < 100) {
            this.autonomia += perc;
            if (this.autonomia > 100) {
                this.autonomia = 100;
            }
        }
    }

    public int autonomia() {
        return this.autonomia;
    }

    @Override
    public String toString() {
        return "PesadoPassElec: " + this.matricula + "; " + this.marca + "; " + this.modelo + "; " + this.potencia + "; " + this.autonomia + "; " + this.nif + "; " + this.carga + "; " + this.capacidade + "; " + this.potenciaCarregamento;
    }
}