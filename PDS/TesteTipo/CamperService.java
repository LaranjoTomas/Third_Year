package TesteTipo;

import java.util.ArrayList;
import java.util.List;

public class CamperService implements ICamperService2 {

    private List<ICamper> campers = new ArrayList<>();
    private List<Utilizador> utilizadores = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    @Override
    public void registaUtilizador(Utilizador u) {
        utilizadores.add(u);
    }

    @Override
    public ICamper registaCamper(owner p, int lugares, String descricao) {
        ICamper camper = new Camper(lugares, descricao);
        campers.add(camper);
        return camper;
    }

    public List<ICamper> getCampersDisponiveis() {
        List<ICamper> campersDisp = new ArrayList<>();
        for (ICamper c : campers) {
            if (c.getEstado() == Estado.Disponivel) {
                campersDisp.add(c);
            }
        }
        return campersDisp;
    }

    public List<Pedido> getPedidosPendentes() {
        return pedidos;
    }

    public String registaPedido(Cliente u, ICamper c) {
        if (c.getEstado() == Estado.Disponivel) {
            c.setEstado(Estado.Pendente);
            pedidos.add(new Pedido(u, c));
            return "Pedido do utilizador" + u + " foi registado para o camper " + c.getDescricao();
        }
        return "Pedido do utilizador " + u + ", nao foi possivel ser registado.";
    }

    public String cancelaPedido(Cliente u, ICamper c) {
        for (Pedido p : pedidos) {
            if (p.getCliente().equals(u) && p.getCamper().equals(c)) {
                pedidos.remove(p);
                c.setEstado(Estado.Disponivel);
                return "Pedido cancelado: " + u + " do camper: " + c.getDescricao();
            }
        }
        return "Pedido nao foi encontrado para cancelar";
    }

    public String aceitaPedido(Cliente u, ICamper c) {
        for (Pedido p : pedidos) {
            if (p.getCamper().equals(c)) {
                pedidos.remove(p);
                c.setEstado(Estado.Indisponivel);
                return "Pedido aceito: " + u + " do camper: " + c.getDescricao();
            }
        }
        return "Pedido nao foi encontrado para ser aceite.";
    }

    public String rejeitaPedido(Cliente u, ICamper c) {
        for (Pedido p : pedidos) {
            if (p.getCamper().equals(c)) {
                pedidos.remove(p);
                c.setEstado(Estado.Disponivel);
                return "Pedido rejeitado: " + u + " do camper: " + c.getDescricao();
            }
        }
        return "Pedido nao foi encontrado para ser rejeitado";
    }

    public String registaDevolucao(Cliente u, ICamper c) {
        if (c.getEstado() == Estado.Indisponivel) {
            c.setEstado(Estado.Disponivel);
            return "Utilizador " + u + " devolveu " + c.getDescricao();
        }
        return "Erro ao terminar o aluguer: " + c.getDescricao();
    }

}
