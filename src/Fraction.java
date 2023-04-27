public class Fraction {

    private Fraction numerator;
    private Fraction denominator;

    public Fraction(Object numerator, Object denominator) {
        new Fraction(numerator, denominator);
    }

    private Fraction(double numerator, double denominator) {
        this.numerator = new Fraction(numerator, 1);
        this.denominator = new Fraction(denominator, 1);
    }

    private Fraction(Fraction numerator, Fraction denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private Fraction(Fraction numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = new Fraction(denominator, 1);
    }

    private Fraction(double numerator, Fraction denominator) {
        this.numerator = new Fraction(numerator, 1);
        this.denominator = denominator;
    }

    public Fraction getDenominator() {
        return denominator;
    }

    public void setDenominator(double denominator) {
        this.denominator = new Fraction(denominator, 1);
    }

    public Fraction getNumerator() {
        return numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = new Fraction(numerator, 1);
    }

    public double getNumeratorValue() {
        return Double.parseDouble(String.valueOf(this.getNumerator().getNumerator()));
    }

    public double getDenominatorValue() {
        return Double.parseDouble(String.valueOf(this.getDenominator().getNumerator()));
    }

    ///public double simplify() {}

    ///public String display() {}

    public Fraction add(Fraction b) {
        return new Fraction((this.getNumerator().getNumeratorValue()*this.getNumerator().getDenominatorValue()*b.getNumerator().getDenominatorValue()*b.getDenominator().getNumeratorValue())+(b.getNumerator().getNumeratorValue()*b.getDenominator().getDenominatorValue()*this.getNumerator().getDenominatorValue()*this.getDenominator().getNumeratorValue()), this.getNumerator().getDenominatorValue()*this.getDenominator().getNumeratorValue()*b.getNumerator().getDenominatorValue()*b.getDenominator().getNumeratorValue());
    }

    public Fraction subtract(Fraction b) {
        return new Fraction((this.getNumerator().getNumeratorValue()*this.getNumerator().getDenominatorValue()*b.getNumerator().getDenominatorValue()*b.getDenominator().getNumeratorValue())-(b.getNumerator().getNumeratorValue()*b.getDenominator().getDenominatorValue()*this.getNumerator().getDenominatorValue()*this.getDenominator().getNumeratorValue()), this.getNumerator().getDenominatorValue()*this.getDenominator().getNumeratorValue()*b.getNumerator().getDenominatorValue()*b.getDenominator().getNumeratorValue());
    }

    public Fraction multiply(Fraction b) {
        return new Fraction(this.getNumerator().getNumeratorValue()*this.getDenominator().getDenominatorValue()*b.getNumerator().getNumeratorValue()*b.getDenominator().getDenominatorValue(), this.getNumerator().getDenominatorValue()*this.getDenominator().getNumeratorValue()*b.getNumerator().getDenominatorValue()*b.getDenominator().getNumeratorValue());
    }

    public Fraction divide(Fraction b) {
        return new Fraction(this.getNumerator().getNumeratorValue()*this.getDenominator().getDenominatorValue()*b.getNumerator().getDenominatorValue()*this.getDenominator().getNumeratorValue(), this.getNumerator().getDenominatorValue()*this.getDenominator().getNumeratorValue()*b.getNumerator().getNumeratorValue()*this.getDenominator().getDenominatorValue());
    }
}
