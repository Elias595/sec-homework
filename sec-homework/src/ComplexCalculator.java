public class ComplexCalculator extends AbstractCalculator {

    public ComplexCalculator() {
        super(
                (x, y) -> new Number(x.getA() + y.getA(), x.getB() + y.getB()),  // Komplexe Addition
                (x, y) -> new Number(x.getA() - y.getA(), x.getB() - y.getB()),  // Komplexe Subtraktion
                (x, y) -> new Number(
                        x.getA() * y.getA() - x.getB() * y.getB(),
                        x.getA() * y.getB() + x.getB() * y.getA()),  // Komplexe Multiplikation
                (x, y) -> new Number(
                        (x.getA() * y.getA() + x.getB() * y.getB()) / (y.getA() * y.getA() + y.getB() * y.getB()),
                        (x.getB() * y.getA() - x.getA() * y.getB()) / (y.getA() * y.getA() + y.getB() * y.getB()))  // Komplexe Division
        );
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a, b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract.calc(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calc(a, b);
    }
}
