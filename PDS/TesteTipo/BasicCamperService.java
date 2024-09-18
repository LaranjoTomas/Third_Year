package TesteTipo;

import java.util.ArrayList;
import java.util.List;

public class BasicCamperService implements ICamperService {

    private List<ICamper> campers = new ArrayList<>();

    @Override
    public void registaUtilizador(Utilizador u) {

    }

    @Override
    public ICamper registaCamper(int lugares, String descricao) {
        ICamper camper = new Camper(lugares, descricao);
        campers.add(camper);
        return camper;
    }

    @Override
    public String registaAluguer(Cliente u, ICamper c) {
        if (c.getEstado() == Estado.Disponivel) {
            c.setEstado(Estado.Indisponivel);
            return "Utilizador " + u + " alugou " + c.getDescricao();
        }
        return "Camper não disponivél para aluguer: " + c.getDescricao();
    }

    @Override
    public String terminaAluguer(Cliente u, ICamper c) {
        if (c.getEstado() == Estado.Indisponivel) {
            c.setEstado(Estado.Disponivel);
            return "Utilizador " + u + " devolveu " + c.getDescricao();
        }
        return "Erro ao terminar o aluguer: " + c.getDescricao();
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

}
