package solution;
class Decoder extends Transformer {
    protected Decoder() {
        isOffsetNegated = false;
    }

    protected String decode(String encodedText) {
        return transform(encodedText);
    }
}
