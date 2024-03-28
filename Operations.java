public class Operations implements CreatedOperation {

    @Override
    public ComplexOperation createSlojenie() {
        return new Slojenie();
    }

    @Override
    public ComplexOperation createVichitanie() {
        return new Vichitanie();
    }

    @Override
    public ComplexOperation createUmnojenie() {
        return new Umnojenie();
    }

    @Override
    public ComplexOperation createDelenie() {
        return new Delenie();
    }

}
