package TesteTipo;

public class Camper implements ICamper {

    private int seats;
    private String description;
    private Estado state;

    public Camper(int seats, String description) {
        this.seats = seats;
        this.description = description;
        this.state = Estado.Disponivel;
    }

    @Override
    public void setEstado(Estado e) {
        this.state = e;
    }

    @Override
    public Estado getEstado() {
        return state;
    }

    @Override
    public int getLugares() {
        return this.seats;
    }

    @Override
    public String getDescricao() {
        return this.description;
    }

    @Override
    public String toString() {
        return description;
    }
}
