package lab12.ex3;

public class Emprestado implements State {

    private Livro livro;

    public Emprestado(Livro livro) {
        this.livro = livro;
    }

    @Override
    public void regista() {
        System.out.println("Operação inválida");
    }

    @Override
    public void requisita() {
        System.out.println("Operação inválida");
    }

    @Override
    public void reserva() {
        System.out.println("Operação inválida");
    }

    @Override
    public void cancelaReserva() {
        System.out.println("Operação inválida");
    }

    @Override
    public void disponivel() {
        System.out.println("Operação inválida");
    }

    @Override
    public void devolve() {
        System.out.println("Livro devolvido");
        livro.setState(new Disponivel(livro));
    }

    @Override
    public String toString() {
        return "Emprestado";
    }
}
