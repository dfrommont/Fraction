public class Fraction <T extends Number, E extends Number> extends Number {

    private T numerator;
    private E denominator;
    private final boolean simple;
    private Double real_numerator;
    private Double real_denominator;

    public Fraction(T numerator, E denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simple = numerator instanceof Double && denominator instanceof Double;
        if (numerator instanceof Double) {
            real_numerator = (Double) numerator;
        } else {
            real_numerator = numerator.doubleValue();
        }
        if (denominator instanceof Double) {
            real_denominator = (Double) denominator;
        } else {
            real_denominator = denominator.doubleValue();
        }
    }

    public T getNumerator() {
        return numerator;
    }

    public E getDenominator() {
        return denominator;
    }

    public void setNumerator(T numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(E denominator) {
        this.denominator = denominator;
    }

    public boolean isSimple() {
        return simple;
    }

    @Override public int intValue() {
        return (int) (real_numerator/real_denominator);
    }

    @Override public long longValue() {
        return (long) (real_numerator/real_denominator);
    }

    @Override public float floatValue() {
        return (float) (real_numerator/real_denominator);
    }

    @Override public double doubleValue() {
        return real_numerator/real_denominator;
    }

    ///public void simplify() {}

    public String display() {
        return real_numerator+"/"+real_denominator;
    }

    public void add(Fraction<T, E> b) {
        this.real_numerator = (this.getNumerator().doubleValue()*b.getDenominator().doubleValue()) + (b.getNumerator().doubleValue()*this.getDenominator().doubleValue());
        this.numerator = (T) this.real_numerator;
        this.real_denominator = this.getDenominator().doubleValue() * b.getDenominator().doubleValue();
        this.denominator = (E) this.real_denominator;
    }

    public void subtract(Fraction<T, E> b) {
        this.real_numerator = (this.getNumerator().doubleValue()*b.getDenominator().doubleValue()) - (b.getNumerator().doubleValue()*this.getDenominator().doubleValue());
        this.numerator = (T) this.real_numerator;
        this.real_denominator = this.getDenominator().doubleValue() * b.getDenominator().doubleValue();
        this.denominator = (E) this.real_denominator;
    }

    public void multiply(Fraction<T, E> b) {
        this.real_numerator = this.getNumerator().doubleValue()*b.getNumerator().doubleValue();
        this.numerator = (T) this.real_numerator;
        this.real_denominator = this.getDenominator().doubleValue() * b.getDenominator().doubleValue();
        this.denominator = (E) this.real_denominator;
    }

    public void divide(Fraction<T, E> b) {
        this.real_numerator = this.getNumerator().doubleValue()*b.getDenominator().doubleValue();
        this.numerator = (T) this.real_numerator;
        this.real_denominator = this.getDenominator().doubleValue() * b.getNumerator().doubleValue();
        this.denominator = (E) this.real_denominator;
    }
}
