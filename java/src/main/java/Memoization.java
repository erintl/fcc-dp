import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Memoization {
    public static long fib(long number, Map<Long, Long> memo) {
        if (memo.containsKey(number)) {
            return memo.get(number);
        }
        if (number <= 2) {
            return 1;
        }
        memo.put(number, fib(number - 1, memo) + fib(number - 2, memo));
        return memo.get(number);
    }

    public static long gridTraveler(int m, int n, Map<String, Long> memo) {
        String key = m  + "," + n;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (m == 1 && n == 1) {
            return  1L;
        }
        if (m == 0 || n == 0) {
            return  0L;
        }
        memo.put(key, gridTraveler(m - 1, n, memo) + gridTraveler(m, n - 1, memo));
        return memo.get(key);
    }

    public static boolean canSum(int targetSum, List<Integer> numbers, Map<Integer, Boolean> memo) {
        if (memo.containsKey(targetSum)) {
            return memo.get(targetSum);
        }
        if (targetSum == 0) {
            return true;
        }
        if (targetSum < 0) {
            return false;
        }
        for (int num : numbers) {
            int remainder = targetSum - num;
            if (canSum(remainder, numbers, memo)) {
                memo.put(targetSum, true);
                return memo.get(targetSum);
            }
        }
        memo.put(targetSum, false);
        return memo.get(targetSum);
    }

    public static List<Integer> howSum(int targetSum, List<Integer> numbers, Map<Integer, List<Integer>> memo) {
        if (memo.containsKey(targetSum)) {
            return memo.get(targetSum);
        }
        if (targetSum == 0) {
            return new ArrayList<>();
        }
        if (targetSum < 0) {
            return null;
        }
        for (int num : numbers) {
            int remainder = targetSum - num;
            List<Integer> remainderResult = howSum(remainder, numbers, memo);
            if (remainderResult != null) {
                remainderResult.add(num);
                memo.put(targetSum, remainderResult);
                return memo.get(targetSum);
            }
        }
        memo.put(targetSum, null);
        return memo.get(targetSum);
    }

    public static List<Integer> bestSum(int targetSum, List<Integer> numbers, Map<Integer, List<Integer>> memo) {
        if (memo.containsKey(targetSum)) {
            return memo.get(targetSum);
        }
        if (targetSum == 0) {
            return new ArrayList<>();
        }
        if (targetSum < 0) {
            return null;
        }

        List<Integer> shortestCombination = null;
        for (int num : numbers) {
            int remainder = targetSum - num;
            List<Integer> remainderCombination = bestSum(remainder, numbers, memo);
            if (remainderCombination != null) {
                List<Integer> combination = new ArrayList<>(remainderCombination);
                combination.add(num);
                if (shortestCombination == null || combination.size() < shortestCombination.size()) {
                    shortestCombination = combination;
                }
            }
        }
        memo.put(targetSum, shortestCombination);
        return shortestCombination;
    }
}
