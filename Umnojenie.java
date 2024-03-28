public class Umnojenie implements ComplexOperation {
    public NumberComplex operate(NumberComplex a, NumberComplex b) {
        double real = a.getRealNum() * b.getRealNum() - a.getMnimNum() * b.getMnimNum();
        double mnim = a.getRealNum() * b.getMnimNum() + a.getMnimNum() * b.getRealNum();
        return new NumberComplex(real, mnim);
    }
}
