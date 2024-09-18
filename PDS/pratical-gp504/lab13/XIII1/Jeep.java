package lab13.XIII1;

public class Jeep extends Auto{

    public Jeep(OldJeep oj) {
        super("", "", 0);
        String oldjeepString = oj.getData();
        
        String code = oldjeepString.split(";")[0];
        String descricao = oldjeepString.split(";")[1];
        double kms = Double.parseDouble(oldjeepString.split(";")[2]);
        super.setCode(code);
        super.setDescricao(descricao);
        super.setKms(kms);
    }

}
