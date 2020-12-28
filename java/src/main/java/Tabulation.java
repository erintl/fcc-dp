import java.util.Arrays;
import java.util.List;

public class Tabulation {
    public static long fib(int number) {
        long[] table = new long[number + 1];
        table[1] = 1;

        for (int i = 0; i < number; i++) {
            table[i + 1] += table[i];
            if (i + 1 < number) {
                table[i + 2] += table[i];
            }
        }
        return table[number];
    }

    public static long gridTraveler(int m, int n) {
        long[][] table = new long[m + 1][n + 1];
        table[1][1] = 1;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                long currentValue = table[i][j];
                if (j + 1 <= n) {
                    table[i][j + 1] += currentValue;
                }
                if (i + 1 <= m) {
                    table[i + 1][j] += currentValue;
                }
            }
        }
        return table[m][n];
    }

    public static boolean canSum(int targetSum, List<Integer> numbers) {
        boolean[] table = new boolean[targetSum + 1];
        table[0] = true;

        for (int i = 0; i < table.length; i++) {
            if (table[i]) {
                for (int num : numbers) {
                    if (i + num < table.length) {
                        table[i + num] = true;
                    }
                }
            }
        }
        return table[targetSum];
    }

    public static Integer[] howSum(int targetSum, int[] numbers) {
        Integer[][] table = new Integer[targetSum + 1][];
        table[0] = new Integer[0];

        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                for (int num : numbers) {
                    if (i + num < table.length) {
                        table[i + num] = new Integer[table[i].length + 1];
                        System.arraycopy(table[i], 0, table[i + num], 0, table[i].length);
                        table[i + num][table[i].length] = num;
                    }
                }
            }
        }
        return table[targetSum];
    }

    public static Integer[] bestSum(int targetSum, int[] numbers) {
        Integer[][] table = new Integer[targetSum + 1][];
        table[0] = new Integer[0];

        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                for (int num : numbers) {
                    if (i + num < table.length) {
                        if (table[i + num] == null || table[i].length + 1 < table[i + num].length) {
                            table[i + num] = new Integer[table[i].length + 1];
                            System.arraycopy(table[i], 0, table[i + num], 0, table[i].length);
                            table[i + num][table[i].length] = num;
                        }
                    }
                }
            }
        }
        return table[targetSum];
    }
}
