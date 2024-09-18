package lab05.automovel;

public class VehicleFactory {
    
    public static Motociclo createMotociclo(String matricula, String marca, String modelo, int potencia, String tipo) {
        return new Motociclo(matricula, marca, modelo, tipo, potencia);
    }

    public static AutomovelLigeiro createAutomovelLigeiro(String matricula, String marca, String modelo, int potencia, String nif, int autonomia) {
        return new AutomovelLigeiro(matricula, marca, modelo, potencia, nif, autonomia);
    }

    public static Taxi createTaxi(String matricula, String marca, String modelo, int potencia, String nif, int autonomia, String licença) {
        return new Taxi(matricula, marca, modelo, potencia, nif, autonomia, licença);
    }

    public static PesadoPassElec createPPEletrico(String matricula, String marca, String modelo, int potencia, int autonomia, String nif, int carga, int capacidade, int potenciaCarregamento) {
        return new PesadoPassElec(matricula, marca, modelo, potencia, autonomia, nif, carga, capacidade, potenciaCarregamento);
    }

    public static AutomovelLigeiroElec createALEletrico(String matricula, String marca, String modelo, int potencia, String nif, int autonomia, int carga, int capacidade) {
        return new AutomovelLigeiroElec(matricula, marca, modelo, potencia, nif, autonomia, carga, capacidade);
    }

    public static PesadoMerc createPesadoMercadorias(String matricula, String marca, String modelo, int potencia, String nif, int carga, int capacidade) {
        return new PesadoMerc(matricula, marca, modelo, potencia, nif, carga, capacidade);
    }

    public static PesadoPass createPesadoPassageiros(String matricula, String marca, String modelo, int potencia, int autonomia, String nif, int carga) {
        return new PesadoPass(matricula, marca, modelo, potencia, autonomia, nif, carga);
    }

}
