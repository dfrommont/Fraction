import java.sql.SQLOutput;

public class Fraction {

    private Object numerator;
    private Object denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(float numerator, float denominator) {
        int diff1 = ("" + numerator).length()-("" + numerator).indexOf('.')-1;
        int diff2 = ("" + denominator).length()-("" + denominator).indexOf('.')-1;
        diff1 = Math.max(diff2, diff1);
        this.numerator = (int) (numerator*Math.pow(10, diff1));
        this.denominator = (int) (denominator*Math.pow(10, diff1));
    }

    public Fraction(double numerator, double denominator) {
        int diff1 = ("" + numerator).length()-("" + numerator).indexOf('.')-1;
        int diff2 = ("" + denominator).length()-("" + denominator).indexOf('.')-1;
        diff1 = Math.max(diff2, diff1);
        this.numerator = (int) (numerator*Math.pow(10, diff1));
        this.denominator = (int) (denominator*Math.pow(10, diff1));
    }

    public Fraction(Object numerator, Object denominator) {
        if (numerator instanceof Integer && denominator instanceof Integer) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else if ((numerator instanceof Float && denominator instanceof Float) || (numerator instanceof Double && denominator instanceof Double)) {
            int diff1 = ("" + numerator).length()-("" + numerator).indexOf('.')-1;
            int diff2 = ("" + denominator).length()-("" + denominator).indexOf('.')-1;
            diff1 = Math.max(diff2, diff1);
            this.numerator = (int) ((float) numerator*Math.pow(10, diff1));
            this.denominator = (int) ((float) denominator*Math.pow(10, diff1));
        } else if (numerator instanceof Fraction && denominator instanceof Fraction) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("Inputs as Objects must be instances of Fraction class only.");
        }
    }

    private Object getDenominator() {
        return denominator;
    }

    private void setDenominator(Object denominator) {
        this.denominator = denominator;
    }

    private Object getNumerator() {
        return numerator;
    }

    private void setNumerator(Object numerator) {
        this.numerator = numerator;
    }

    private int getNumeratorValue() {
        System.out.println(numerator.getClass());
        if (numerator instanceof Integer) return (int) numerator;
        return -1;
    }

    private int getDenominatorValue() {
        if (denominator instanceof Integer) return (int) denominator;
        return -1;
    }

    public Fraction simplify(Fraction fraction) {       //Check me, not sure if right
        if (fraction.getNumerator() instanceof Fraction) fraction.setNumerator(simplify((Fraction) numerator));
        if (fraction.getDenominator() instanceof  Fraction) fraction.setDenominator(simplify((Fraction) denominator));
        if (numerator instanceof Integer && denominator instanceof Integer) {
            if (getNumeratorValue()%getDenominatorValue() == 0) {
                numerator = 1;
                denominator = getDenominatorValue()/getNumeratorValue();
            }
        }
        return fraction;
    }

    public String displayComplex(Fraction fraction) {
        if (fraction.numerator instanceof Fraction) fraction.setNumerator(displayComplex((Fraction) numerator));
        if (fraction.denominator instanceof Fraction) fraction.setDenominator(displayComplex((Fraction) denominator));
        return "("+fraction.getNumeratorValue()+"/"+fraction.getDenominatorValue()+")";
    }

    public String display() {
        if (numerator instanceof Integer && denominator instanceof Integer) {
            return "("+getNumeratorValue()+"/"+getDenominatorValue()+")";
        } else {
            return displayComplex(new Fraction(numerator, denominator));
        }
    }

    //simplify
    //add
    //sub
    //mult
    //divide via KFC
}
