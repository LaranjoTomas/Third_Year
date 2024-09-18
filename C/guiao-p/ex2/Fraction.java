public class Fraction {
    private int num;
    private int denom;

    public Fraction(int num, int denom) {
        if (denom < 0) {
            num = -num;
            denom = -denom;
        }
        this.num = num;
        this.denom = denom;
    }

    public Fraction(int num) {
        this.num = num;
        this.denom = 1;
    }

    @Override
    public String toString() {
        if(denom != 1) {
            return "" + num +"/"+ denom;
        } else {
            return "" + num;
        }
    }

    public static Fraction mulFraction(Fraction f1, Fraction f2) {
        return new Fraction(f1.num * f2.num, f1.denom * f2.denom);
    }

    public static Fraction DivFraction(Fraction f1, Fraction f2) {
        return new Fraction(f1.num * f2.denom, f1.denom * f2.num);
    }

    public static Fraction SumFraction(Fraction f1, Fraction f2) {
        return new Fraction(f1.num * f2.denom + f2.num * f1.denom, f1.denom * f2.denom);
    }

    public static Fraction SubFraction(Fraction f1, Fraction f2) {
        return new Fraction(f1.num * f2.denom - f2.num * f1.denom, f1.denom * f2.denom);
    }
}