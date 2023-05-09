public class FractionMain {

    public static void main(String[] args) {
        Fraction<Double, Double> frac1 = new Fraction<Double, Double>(1.0, 2.0);
        Fraction<Double, Double> frac2 = new Fraction<Double, Double>(3.0, 4.0);
        Fraction<Fraction<Double, Double>, Fraction<Double, Double>> frac3 = new Fraction<Fraction<Double, Double>, Fraction<Double, Double>>(frac1, frac2);
    }
}
