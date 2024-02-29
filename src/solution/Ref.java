package solution;
import java.util.HashMap;

/**
 * Ref class contains the reference table and only provides methods to query it but not change it, making it immutable.
 * It makes sure that there is only one reference table, and is used consistently.
 */
final class Ref {
    private static final char[] REF_TABLE = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
        'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3',
        '4', '5', '6', '7', '8', '9', '(', ')', '*', '+',
        ',', '-', '.', '/'
    };

    private static final HashMap<Character, Integer> REF_MAP = new HashMap<>();
    static {
        for (int i = 0; i < REF_TABLE.length; i++) {
            REF_MAP.put(REF_TABLE[i], i);
        }
    }

    static boolean contains(char c) {
        return REF_MAP.containsKey(c);
    }

    static int getIdx(char c) { return REF_MAP.getOrDefault(c, 0); }

    static char getCharSafe(int idx) {
        return REF_TABLE[(idx + Ref.getLength()) % Ref.getLength()];
    }

    static int getLength() {
        return REF_TABLE.length;
    }
}
