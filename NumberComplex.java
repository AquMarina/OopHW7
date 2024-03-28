public class NumberComplex {

    private double realNum;
    private double mnimNum;

    public NumberComplex(double realNum, double mnimNum) {
        this.realNum = realNum;
        this.mnimNum = mnimNum;
    }

    public double getRealNum() {
        return realNum;
    }

    public void setRealNum(double realNum) {
        this.realNum = realNum;
    }

    public double getMnimNum() {
        return mnimNum;
    }

    public void setMnimNum(double mnimNum) {
        this.mnimNum = mnimNum;
    }

    @Override
    public String toString() {
        return realNum + " + " + mnimNum + "i";
    }
}
