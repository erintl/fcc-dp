# Dynamic Programming Practice

<https://www.youtube.com/watch?v=oBt53YbR9Kk&t=1s>

## Patterns

### Memoization

Uses a recursion

1. Make it work
   1. Visualize the problem as a tree
   2. Implement the tree using recursion
   3. Test it
2. Make it efficient
   1. Add a memo object
   2. Add a base base to return memo values
   3. Store return values into the memo

### Tabulation

Uses iteration

1. Visualize the problem as a table
2. Size the table based on inputs
3. Initialize the table with default values
4. Seed the trivial answer in the table
5. Iterate through the table
6. Fill further positions based on the current position

## Fibonacci

- Brute force
  - Time: `2^n`
  - Space: `n`
- Memoized
  - Time: `n`
  - Space: `n`
- Tabulation
  - Time: `n`
  - Space: `n`

## Grid Traveler

n: number of rows
m: number of columns

- Brute force
  - Time: `2^(n + m)`
  - Space: `n + m`
- Memoized
  - Time: `n * m`
  - Space: `n + m`
- Tabulation
  - Time: `n * m`
  - Space: `n * m`

## Can Sum

m: target sum (length)
n: number of array elements

- Brute force
  - Time: `n^m`
  - Space: `m`
- Memoized
  - Time: `n * m`
  - Space: `m`
- Tabulation
  - Time: `n * m`
  - Space: `m`

## How Sum

m: target sum
n: number of array elements

- Brute force
  - Time: `n^m * m`
  - Space: `m`
- Memoized
  - Time: `n * m^2`
  - Space: `m^2`
- Tabulation
  - Time: `n * m^2`
  - Space: `m^2`

## Best Sum

m: target sum
n: number of array elements

- Brute force
  - Time: `n^m * m`
  - Space: `m^2`
- Memoized
  - Time: `n * m^2`
  - Space: `m^2`

## Can Construct

m: target string length
n: number of array elements

- Brute force
  - Time: `n^m * m`
  - Space: `m^2`
- Memoized
  - Time: `n * m^2`
  - Space: `m^2`

## Count Construct

m: target string length
n: number of array elements

- Brute force
  - Time: `n^m * m`
  - Space: `m^2`
- Memoized
  - Time: `n * m^2`
  - Space: `m^2`

## All Construct

m: target string length
n: number of array elements

- Brute force
  - Time: `n^m`
  - Space: `m`
- Memoized
  - Time: `n`
  - Space: `m`

## Tabulation
