public class FractionMain {

    public static void main(String[] args) {
        Fraction a = new Fraction(3, 9);
        Fraction b = new Fraction(2, 5);
        Fraction c = new Fraction(a, b);
        System.out.println(a.display());
        c = c.simplify(c);
        System.out.println(c.display());
        Fraction d = a.add(b);
        Fraction e = a.subtract(b);
        Fraction f = d.multiply(a);
        Fraction g = e.divide(b);
        System.out.println(f.display());
        System.out.println(g.display());
    }
}
