package solution;

/**
 * This class uses a simple substitution cipher to encode and decode text.
 * It reduces code duplication by using a common base class for encoding and decoding.
 */
abstract class Transformer {
    protected boolean isOffsetNegated;

    protected String transform(String input) {
        char firstChar = input.charAt(0);
        if (!Ref.contains(firstChar)) {
            return input.substring(1);
        }
        int offset = Ref.getIdx(firstChar);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Ref.contains(c)) {
                int index = Ref.getIdx(c) + (isOffsetNegated ? -offset : offset);
                sb.append(Ref.getCharSafe(index));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
