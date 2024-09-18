package TesteTipo;

public class Pedido {
    private Cliente client;
    private ICamper camper;
    private Estado state;

    public Pedido(Cliente client, ICamper camper) {
        this.client = client;
        this.camper = camper;
        this.state = Estado.Pendente;
    }

    public Estado state() {
        return state;
    }

    public Cliente getCliente() {
        return client;
    }

    public ICamper getCamper() {
        return camper;
    }
}
