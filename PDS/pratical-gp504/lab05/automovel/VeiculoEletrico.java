package lab05.automovel;

public interface VeiculoEletrico {
    int autonomia(); // devolve autonomia restante

    void carregar(int percentagem); // simula um carregamento até ‘percentagem’
}
