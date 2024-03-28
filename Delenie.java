public class Delenie implements ComplexOperation {
    public NumberComplex operate(NumberComplex a, NumberComplex b) {
        double znamenatel = b.getRealNum() * b.getRealNum() + b.getMnimNum() * b.getMnimNum();
        double real = (a.getRealNum() * b.getRealNum() + a.getMnimNum() * b.getMnimNum()) / znamenatel;
        double mnim = (a.getMnimNum() * b.getRealNum() - a.getRealNum() * b.getMnimNum()) / znamenatel;
        return new NumberComplex(real, mnim);
    }
}
