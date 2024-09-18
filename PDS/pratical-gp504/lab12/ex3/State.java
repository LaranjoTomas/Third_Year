package lab12.ex3;

public interface State {
    public void regista();
    public void requisita();
    public void reserva();
    public void cancelaReserva();
    public void disponivel();
    public void devolve();   
}
