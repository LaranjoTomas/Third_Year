package TesteTipo;

public interface ICamperService2 {
    public void registaUtilizador(Utilizador u);

    public ICamper registaCamper(owner p, int lugares, String descrição);

    public String registaPedido(Cliente u, ICamper c);

    public String cancelaPedido(Cliente u, ICamper c);

    public String aceitaPedido(Cliente u, ICamper c);

    public String rejeitaPedido(Cliente u, ICamper c);

    public String registaDevolucao(Cliente u, ICamper c);
}
