package lab12.ex3;

// Numa biblioteca cada livro é caracterizado por um título, ISBN, ano, e o primeiro autor. A 
// entidade livro permite operações tais como: regista, requisita, reserva, cancelaReserva, 
// disponível, etc.). No entanto, cada uma destas operações depende da situação do livro na 
// biblioteca: se está em situação de inventário, por exemplo, só permite a operação regista. 

public class Livro {
    private String titulo;
    private int ISBN;
    private int ano;
    private String autor;
    private State state;

    public Livro(String titulo, int ISBN, int ano, String autor) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.ano = ano;
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void regista() {
        state.regista();
    }

    public void requisita() {
        state.requisita();
    }

    public void reserva() {
        state.reserva();
    }

    public void cancelaReserva() {
        state.cancelaReserva();
    }

    public void disponivel() {
        state.disponivel();
    }

    public void devolve() {
        state.devolve();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return titulo + " " + autor + " [" + state + "]";
    }
}
