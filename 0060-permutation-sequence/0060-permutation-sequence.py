class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        factorial = [1] * n
        for i in range(1, n):
            factorial[i] = factorial[i-1] * i
    
        k -= 1
        nums = list(range(1, n + 1))
        permutation = []

        for i in range(n, 0, -1):
            index = k // factorial[i - 1]
            k %= factorial[i - 1]
            permutation.append(nums[index])
            nums.pop(index)
    
        return ''.join(map(str, permutation))