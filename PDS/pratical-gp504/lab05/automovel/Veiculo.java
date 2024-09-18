package lab05.automovel;

public class Veiculo implements KmPercorridosInterface {
    
    public String matricula, marca, modelo;
    public int potencia, quilometros = 0, ultQui;;

    public Veiculo(String matricula, String marca, String modelo, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matr) {
        this.matricula = matr;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String mod) {
        this.modelo = mod;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int pot) {
        this.potencia = pot;
    }

    public void trajeto(int quilometros) {
        this.ultQui = quilometros;
        this.quilometros += quilometros;
    }   

    public int ultimoTrajeto() {
        return this.ultQui;
    }

    public int distanciaTotal() {
        return this.quilometros;
    }
}
