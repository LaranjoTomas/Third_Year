package lab11.ex1;

import java.util.ArrayList;

public class Client implements Observer {
    private String nome;
    private ArrayList<Produto> produtosInteressados;

    public Client(String nome) {
        this.nome = nome;
        this.produtosInteressados = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void licitar(Leilao leilao, Produto produto, double valor) {
        leilao.licitarProduto(this, produto, valor);
        if (!produtosInteressados.contains(produto)) {
            produtosInteressados.add(produto);
        }
    }

    @Override
    public void update(String mensagem) {
        System.out.println("Cliente " + nome + ": " + mensagem);
    }
}
