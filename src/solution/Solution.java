package solution;

/**
 * This class is an entry point for encoding and decoding text.
 */
public class Solution {
    private static final Encoder encoder = new Encoder();
    private static final Decoder decoder = new Decoder();

    /**
     * Encodes the given text.
     *
     * @param plainText the text to encode
     * @return the encoded text
     */
    public static String encode(String plainText) {
        return encoder.encode(plainText);
    }

    /**
     * Decodes the given text.
     *
     * @param encodedText the text to decode
     * @return the decoded text
     */
    public static String decode(String encodedText) {
        return decoder.decode(encodedText);
    }
}
