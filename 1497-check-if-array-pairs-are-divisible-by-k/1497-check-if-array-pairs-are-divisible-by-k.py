class Solution:
    def canArrange(self, arr: List[int], k: int) -> bool:
        count = [0] * k
        for num in arr:
            rem = num % k
            count[rem]+=1
        for i in range(k):
            if i == 0:
                if count[i]%2!=0:
                    return False  
            elif i == k-i:
                if count[i]%2 != 0:
                    return False        
            else:
                if count[i]!=count[k-i]:
                    return False
        return True