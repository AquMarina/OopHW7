public class Vichitanie implements ComplexOperation {

    public NumberComplex operate(NumberComplex a, NumberComplex b) {
        return new NumberComplex(a.getRealNum() - b.getRealNum(), a.getMnimNum() - b.getMnimNum());
    }

}
