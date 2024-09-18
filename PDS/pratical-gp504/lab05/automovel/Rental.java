package lab05.automovel;

public class Rental {

    public String nome, codigo, email, viaturas, viaturas_eletricos;
    public Veiculo[] veic = new Veiculo[7];
    private VeiculoEletrico[] veiculos_eletricos = new VeiculoEletrico[3];

    public Rental(String nome, String codigo, String email) {
        this.nome = nome;
        this.codigo = codigo; 
        this.email = email;
    }
    
    public Veiculo[] getVeiculo() {
        return this.veic;
    }

    public void addVeiculo(Veiculo v) {
        for (int i = 0; i < veic.length; i++) {
            if (veic[i] == null) {
                veic[i] = v;
                viaturas += "\n" + "\n" + v;
                break;
            }
        }
    }

    public void removeVeiculo(int i) {
        if (veic[i] != null) {
            veic[i] = null;
        }
    }

    public void addVeiculoEletrico(VeiculoEletrico viatura_eletrica){
        for(int i=0; i < veiculos_eletricos.length; i++){
            if(veiculos_eletricos[i] == null){
                veiculos_eletricos[i] = viatura_eletrica;
                viaturas_eletricos += "\n"+"\n"+viatura_eletrica;
                break;
            }
        }
    }

    public Veiculo[] getStock() {
        return this.veic;
    }

    @Override
    public String toString() {
        return this.nome + "; " + this.codigo + "; " + this.email + "; " + this.viaturas;
    }
}
