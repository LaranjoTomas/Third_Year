package lab11.ex1;

public class Main {
    public static void main(String[] args) {
        // Criação dos produtos
        Produto produto1 = new Produto("Produto 1", 100.0);
        Produto produto2 = new Produto("Produto 2", 200.0);
        Produto produto3 = new Produto("Produto 3", 300.0);
        Produto produto4 = new Produto("Produto 4", 400.0);
        Produto produto5 = new Produto("Produto 5", 500.0);

        // Criação dos Clientes
        Client Client1 = new Client("Client 1");
        Client Client2 = new Client("Client 2");
        Client Client3 = new Client("Client 3");
        Client Client4 = new Client("Client 4");
        Client Client5 = new Client("Client 5");

        // Criação do gestor
        Gestor gestor = new Gestor("Gestor 1");

        // Criação do leilão
        Leilao leilao = new Leilao();
        leilao.addObserver(gestor);

        // Adição de produtos ao leilão
        leilao.addProduct(produto1, 5); // leilão por 5 segundos
        leilao.addProduct(produto2, 10); // leilão por 10 segundos
        leilao.addProduct(produto3, 15); // leilão por 15 segundos

        // Clientes licitam nos produtos
        Client1.licitar(leilao, produto1, 150.0);
        Client2.licitar(leilao, produto1, 200.0);
        Client3.licitar(leilao, produto2, 250.0);
        Client4.licitar(leilao, produto2, 300.0);
        Client5.licitar(leilao, produto3, 350.0);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verificar produtos em leilão
        leilao.addProduct(produto4, 25);
        leilao.addProduct(produto5, 30);
        System.out.println("Produtos ainda em leilão: " + leilao.getProdutosEmLeilao());
    }
}
