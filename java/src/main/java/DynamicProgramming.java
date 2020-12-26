import java.util.Arrays;
import java.util.HashMap;

public class DynamicProgramming {
    public static void main(String[] args) {
        System.out.println(Memoization.countConstruct("purple", Arrays.asList("purp", "p", "ur", "le", "purpl"),
                new HashMap<>()));
        System.out.println(Memoization.countConstruct("abcdef", Arrays.asList("ab", "abc", "cd", "def", "abcd"),
            new HashMap<>()));
        System.out.println(Memoization.countConstruct("skateboard", Arrays.asList("bo", "rd", "ate", "t", "ska", "sk", "boar"),
            new HashMap<>()));
        System.out.println(Memoization.countConstruct("enterapotentpot", Arrays.asList("a", "p", "ent", "enter", "ot", "o", "t"),
            new HashMap<>()));
        System.out.println(Memoization.countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
            Arrays.asList("e", "ee", "eee", "eeee", "eeeee", "eeeeee"), new HashMap<>()));
    }
}
