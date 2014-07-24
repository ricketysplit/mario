public class PyramidBuilder {

    private PyramidBuilder() {
    }

    private static PyramidBuilder pBuilder;

    public static PyramidBuilder getInstance() {
        if (pBuilder == null) {
            pBuilder = new PyramidBuilder();
        }
        return pBuilder;
    }

    public Pyramid pyramid() {
        return new Pyramid();
    }
}
