package lab12.ex3;

public class Reservado implements State {

    private Livro livro;

    public Reservado(Livro livro) {
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
        System.out.println("Reserva cancelada");
        livro.setState(new Disponivel(livro));
    }

    @Override
    public void disponivel() {
        System.out.println("Operação inválida");
    }

    @Override
    public void devolve() {
        System.out.println("Operação inválida");
    }

    @Override
    public String toString() {
        return "Reservado";
    }
}
