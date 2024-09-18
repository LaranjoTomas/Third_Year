package lab12.ex3;

public class Disponivel implements State {

    private Livro livro;

    public Disponivel(Livro livro) {
        this.livro = livro;
    }

    @Override
    public void regista() {
        System.out.println("Operação inválida");
    }

    @Override
    public void requisita() {
        System.out.println("Livro requisitado");
        livro.setState(new Emprestado(livro));
    }

    @Override
    public void reserva() {
        System.out.println("Livro reservado");
        livro.setState(new Reservado(livro));
    }

    @Override
    public void cancelaReserva() {
        System.out.println("Operação inválida");
    }

    @Override
    public void disponivel() {
        System.out.println("Livro disponível");
    }

    @Override
    public void devolve() {
        System.out.println("Operação inválida");
    }

    @Override
    public String toString() {
        return "Disponível";
    }
}
