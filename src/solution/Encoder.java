package solution;
class Encoder extends Transformer {
    protected Encoder() {
        isOffsetNegated = true;
    }

    protected String encode(String plainText) {
        return transform(plainText);
    }
}
