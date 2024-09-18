package lab11.ex1;

public class Gestor implements Observer {
    private String nome;

    public Gestor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("Gestor " + nome + ": " + mensagem);
    }

}
