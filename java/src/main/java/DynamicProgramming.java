import java.util.Arrays;

public class DynamicProgramming {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(Tabulation.allConstruct("purple",
                new String[]{"purp", "p", "ur", "le", "purpl"})));
//        System.out.println(Arrays.deepToString(Tabulation.allConstruct("abcdef",
//                new String[]{"ab", "abc", "cd", "def", "abcd", "ef", "c"})));
//        System.out.println(Arrays.deepToString(Tabulation.allConstruct("aaaaaaaaaaz",
//                new String[]{"a", "aa", "aaa", "aaaa", "aaaaa"})));
    }
}
