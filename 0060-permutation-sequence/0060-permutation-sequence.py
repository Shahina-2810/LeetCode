class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        numbers = list(range(1, n + 1))
        # Adjust k to be zero-indexed
        k -= 1
        permutation = []

        # Generate permutation
        for i in range(n, 0, -1):
            # Determine the index of the current position
            factorial = math.factorial(i - 1)
            index = k // factorial
            k %= factorial

            # Append the number and remove it from the list
            permutation.append(numbers[index])
            numbers.pop(index)

        return ''.join(map(str, permutation))