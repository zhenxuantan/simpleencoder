To encode, simply use the following command:
```
import solution.Solution;
public class Main {
    public static void main(String[] args) {
        String plainText = "BHELLO WORLD";
        String encodedText = Solution.encode(plainText);
        System.out.println(encodedText);
    }
}
```
This prints ``GDKKN VNQKC``.

To decode, simply use the following command:
```
import solution.Solution;
public class Main {
    public static void main(String[] args) {
        String encodedText = "FC/GGJ RJMG.";
        String plainText = Solution.decode(encodedText);
        System.out.println(plainText);
    }
}
```
This prints ``HELLO WORLD``.