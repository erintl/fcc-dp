import java.util.Arrays;
import java.util.HashMap;

public class DynamicProgramming {
    public static void main(String[] args) {
        System.out.println(Memoization.allConstruct("purple", Arrays.asList("purp", "p", "ur", "le", "purpl"),
                new HashMap<>()));
        System.out.println(Memoization.allConstruct("abcdef", Arrays.asList("ab", "abc", "cd", "def",
                "abcd", "ef", "c"), new HashMap<>()));
        System.out.println(Memoization.allConstruct("skateboard", Arrays.asList("bo", "rd", "ate", "t",
                "ska", "sk", "boar"), new HashMap<>()));
        System.out.println(Memoization.allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaz", Arrays.asList("a",
                "aa", "aaa", "aaaa", "aaaaa", "aaaaaa"), new HashMap<>()));
    }
}
