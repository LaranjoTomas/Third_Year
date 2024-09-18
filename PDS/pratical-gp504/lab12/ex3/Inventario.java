package lab12.ex3;

public class Inventario implements State {
    private Livro livro;

    public Inventario(Livro livro) {
        this.livro = livro;
    }

    @Override
    public void regista() {
        livro.setState(new Disponivel(livro));
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
        System.out.println("Operação inválida");
    }

    @Override
    public String toString() {
        return "Inventário";
    }
}
