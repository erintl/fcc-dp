const countSum = (targetSum, numbers, memo = {}) => {
    if (targetSum in memo) return memo[targetSum];
    if (targetSum === 0) return 1;
    if (targetSum < 0) return 0;
  
    sum = 0;
    for (let num of numbers) {
      let remainder = targetSum - num;
      sum += countSum(remainder, numbers, memo);
    }
    memo[targetSum] = sum;
    return memo[targetSum];
  }
  
  console.log(countSum(7, [2, 3]));
  console.log(countSum(7, [5, 3, 4, 7]));
  console.log(countSum(7, [2, 4]));
  console.log(countSum(8, [2, 3, 5]));
  console.log(countSum(300, [7, 14]));
  