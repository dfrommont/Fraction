public class Fraction <T, E> {

    private T numerator;
    private E denominator;
    private final boolean simple;

    public Fraction(T numerator, E denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simple = numerator instanceof Double && denominator instanceof Double;
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

    ///public void simplify() {}

    ///public String display() {}

    ///public void add(Fraction<T, E> b)

    ///public Fraction subtract(Fraction b)

    ///public Fraction multiply(Fraction b)

    ///public Fraction divide(Fraction b)
}
