import java.util.Arrays;

public class DynamicProgramming {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Tabulation.bestSum(7, new int[]{ 5, 3, 4, 7 })));
        System.out.println(Arrays.toString(Tabulation.bestSum(8, new int[]{ 5, 3, 4, 7 })));
        System.out.println(Arrays.toString(Tabulation.bestSum(8, new int[]{ 1, 4, 5 })));
        System.out.println(Arrays.toString(Tabulation.bestSum(100, new int[]{ 1, 2, 5, 25 })));
    }
}
