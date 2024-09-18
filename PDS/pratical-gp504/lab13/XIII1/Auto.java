package lab13.XIII1;

public class Auto implements Product {

    private String matricula;
    private String descricao;
    private double kms;

    public Auto(String matricula, String descricao, double kms) {
        this.matricula = matricula;
        this.descricao = descricao;
        this.kms = kms;
    }

    @Override
    public String code() {
        return matricula;
    }

    @Override
    public String description() {
        return descricao;
    }

    @Override
    public double points() {
        return kms;
    }

    public void setCode(String code) {
        this.matricula = code;
    }

    public void setDescricao(String descricao2) {
        this.descricao = descricao2;
    }

    public void setKms(double kms2) {
        this.kms = kms2;
    }

    public Car createCar(String matricula, String descricao, double kms) {
        return new Car(matricula, descricao, kms);
    }

    public Van createVan(String matricula, String descricao, double kms) {
        return new Van(matricula, descricao, kms);
    }

    public Motorcycle createMotorcycle(String matricula, String descricao, double kms) {
        return new Motorcycle(matricula, descricao, kms);
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + ", descricao: " + descricao + ", kms: " + kms;
    }
}
