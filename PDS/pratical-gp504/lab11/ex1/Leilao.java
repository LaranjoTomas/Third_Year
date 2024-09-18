package lab11.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Leilao {
    private List<Observer> observers;
    private Map<Produto, Double> produtosEmLeilao;
    private ScheduledExecutorService scheduler;

    public Leilao() {
        this.observers = new ArrayList<>();
        this.produtosEmLeilao = new HashMap<>();
        this.scheduler = Executors.newScheduledThreadPool(1);
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    private void notifyObservers(String mensagem) {
        for (Observer observer : observers) {
            observer.update(mensagem);
        }
    }

    public void addProduct(Produto produto, long tempo) {
        produto.setEstado("leilao");
        produto.setTempo(tempo);
        produtosEmLeilao.put(produto, produto.getPrecoBase());
        notifyObservers("Produto " + produto.getNome() + " adicionado ao leilão.");

        scheduler.schedule(() -> CloseLeilao(produto), tempo, TimeUnit.SECONDS);
    }

    public void licitarProduto(Client client, Produto produto, double valor) {
        if (produtosEmLeilao.containsKey(produto) && valor > produtosEmLeilao.get(produto)) {
            produtosEmLeilao.put(produto, valor);
            notifyObservers("Produto " + produto.getNome() + " recebeu uma nova oferta de " + valor + " por " + client.getNome() + ".");
        }
    }

    public void CloseLeilao(Produto produto) {
        if (produtosEmLeilao.containsKey(produto)) {
            double valorFinal = produtosEmLeilao.get(produto);
            produto.setEstado("vendas");
            notifyObservers("Leilão do produto " + produto.getNome() + " encerrado. Vendido por " + valorFinal + ".");
            produtosEmLeilao.remove(produto);
        } else {
            produto.setEstado("stock");
            notifyObservers("Leilão do produto " + produto.getNome() + " encerrado. Não houve lances.");
        }
    }

    public List<Produto> getProdutosEmLeilao() {
        return new ArrayList<>(produtosEmLeilao.keySet());
    }
}
