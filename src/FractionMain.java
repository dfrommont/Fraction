public class FractionMain {

    public static void main(String[] args) {
        Fraction a = new Fraction(3, 9);
        Fraction b = new Fraction(2, 5);
        Fraction c = new Fraction(a, b);
        System.out.println(a.display());
        c = c.simplify(c);
        System.out.println(c.display());
    }
}
