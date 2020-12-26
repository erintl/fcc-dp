import java.util.Arrays;
import java.util.HashMap;

public class DynamicProgramming {
    public static void main(String[] args) {
        System.out.println(Memoization.bestSum(7, Arrays.asList(5, 3, 4, 7), new HashMap<>()));
        System.out.println(Memoization.bestSum(8, Arrays.asList(5, 3, 4, 7), new HashMap<>()));
        System.out.println(Memoization.bestSum(8, Arrays.asList(1, 4, 5), new HashMap<>()));
        System.out.println(Memoization.bestSum(100, Arrays.asList(1, 2, 5, 25), new HashMap<>()));
    }
}
