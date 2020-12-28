const bestSum = (targetSum, numbers) => {
  const table = Array(targetSum + 1).fill(null);
  table[0] = [];

  for (let i = 0; i < table.length; i++) {
    if (table[i] !== null) {
      for (let num of numbers) {
        if (i + num < table.length) {
          if (!table[i + num] || table[i].length + 1 < table[i + num].length) {
            table[i + num] = [...table[i], num];
          }
        }
      }
    }
  }
  return table[targetSum];
};

console.log(bestSum(7, [5, 3, 4, 7])); // [7]
console.log(bestSum(8, [5, 3, 4, 7])); // [3, 5]
console.log(bestSum(8, [1, 4, 5])); // [4, 4]
console.log(bestSum(100, [1, 2, 5, 25])); // [25, 25, 25, 25]
