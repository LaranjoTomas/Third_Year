package lab05.automovel;

public class Motociclo extends Veiculo{

    public String tipo;
    
    public Motociclo(String matricula, String marca, String modelo, String tipo, int potencia) {
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Motociclo:" + this.matricula + "; " + this.marca + "; " + this.modelo + "; " + this.tipo + "; " + this.potencia;
    }
}
