const allConstruct = (target, wordBank) => {
  const table = Array(target.length + 1)
    .fill()
    .map(() => []);
  table[0] = [[]];

  for (let i = 0; i < table.length; i++) {
    for (let word of wordBank) {
      if (i + word.length < table.length) {
        if (target.slice(i, i + word.length) === word) {
          const newCombinations = table[i].map(subarray => [...subarray, word]);
          table[i + word.length].push(...newCombinations);
        }
      }
    }
  }
  return table[target.length];
};

console.log(allConstruct('purple', ['purp', 'p', 'ur', 'le', 'purpl']));
// [
//   ['purp', 'le']
//   ['p', 'ur', 'p', 'le']
// ]

console.log(allConstruct('abcdef', ['ab', 'abc', 'cd', 'def', 'abcd', 'ef', 'c']));
// [
//   ['ab', 'cd', 'ef']
//   ['ab', 'c', 'def']
//   ['abc', 'def']
//   ['abcd', 'ef]
// ]

console.log(allConstruct('skateboard', ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar']));
// []

console.log(allConstruct('aaaaaaaaaaz', ['a', 'aa', 'aaa', 'aaaa', 'aaaaa']));
// []
