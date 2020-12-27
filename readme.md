# Dynamic Programming Practice

<https://www.youtube.com/watch?v=oBt53YbR9Kk&t=1s>

## Pattern

1. Make it work
   1. Visualize the problem as a tree
   2. Implement the tree using recursion
   3. Test it
2. Make it efficient
   1. Add a memo object
   2. Add a base base to return memo values
   3. Store return values into the memo

## Memoization

### Fibonacci

- Brute force
  - Time: `2^n`
  - Space: `n`
- Memoized
  - Time: `n`
  - Space: `n`

### Grid Traveler

n: number of rows
m: number of columns

- Brute force
  - Time: `2^(n + m)`
  - Space: `n + m`
- Memoized
  - Time: `n * m`
  - Space: `n + m`

### Can Sum

m: target sum
n: number of array elements

- Brute force
  - Time: `n^m`
  - Space: `m`
- Memoized
  - Time: `n * m`
  - Space: `m`

### How Sum

m: target sum
n: number of array elements

- Brute force
  - Time: `n^m * m`
  - Space: `m`
- Memoized
  - Time: `n * m^2`
  - Space: `m^2`

### Best Sum

m: target sum
n: number of array elements

- Brute force
  - Time: `n^m * m`
  - Space: `m^2`
- Memoized
  - Time: `n * m^2`
  - Space: `m^2`

### Can Construct

m: target string length
n: number of array elements

- Brute force
  - Time: `n^m * m`
  - Space: `m^2`
- Memoized
  - Time: `n * m^2`
  - Space: `m^2`

### Count Construct

m: target string length
n: number of array elements

- Brute force
  - Time: `n^m * m`
  - Space: `m^2`
- Memoized
  - Time: `n * m^2`
  - Space: `m^2`

### All Construct

m: target string length
n: number of array elements

- Brute force
  - Time: `n^m `
  - Space: `m`
- Memoized
  - Time: `n`
  - Space: `m`

## Tabulation
