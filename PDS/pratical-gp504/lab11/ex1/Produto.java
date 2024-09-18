package lab11.ex1;

import java.util.concurrent.atomic.AtomicInteger;

public class Produto {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int codigo;
    private String nome;
    private double precoBase;
    private String Estado;
    private long tempo;

    public Produto(String nome, double precoBase) {
        this.codigo = count.incrementAndGet();
        this.nome = nome;
        this.precoBase = precoBase;
        this.Estado = "stock";
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPrecoBase() {
        return this.precoBase;
    }

    public String getEstado() {
        return this.Estado;
    }

    public long getTempo() {
        return this.tempo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setTempo(long tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + nome + '\'' +
                ", precoBase=" + precoBase +
                ", estado='" + Estado + '\'' +
                '}';
    }
}
