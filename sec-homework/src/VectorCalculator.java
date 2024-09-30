public class VectorCalculator extends AbstractCalculator {

    public VectorCalculator() {
        super(
                (x, y) -> new Number(x.getA() + y.getA(), x.getB() + y.getB()),  // Vektoraddition
                (x, y) -> new Number(x.getA() - y.getA(), x.getB() - y.getB()),  // Vektorsubtraktion
                (x, y) -> new Number(0, x.getA() * y.getB() - x.getB() * y.getA()), // Kreuzprodukt
                (x, y) -> new Number(x.getA() * y.getA() + x.getB() * y.getB(), 0)  // Skalarprodukt
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
