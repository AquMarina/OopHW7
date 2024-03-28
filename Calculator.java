public class Calculator {
    private ComplexOperation operation;

    public Calculator(ComplexOperation operation) {
        this.operation = operation;
    }

    public NumberComplex calculate(NumberComplex a, NumberComplex b) {
        return operation.operate(a, b);
    }

}
