public class FractionMain {

    public static void main(String[] args) {
        Fraction<Integer, Integer> frac1 = new Fraction<Integer, Integer>(1, 2);
        Fraction<Integer, Integer> frac2 = new Fraction<Integer, Integer>(2, 3);
        Fraction<Fraction<Integer, Integer>, Fraction<Integer, Integer>> frac3 = new Fraction<>(frac1, frac2);
        frac1.add(frac2);
        System.out.println(frac1.display());
    }
}
