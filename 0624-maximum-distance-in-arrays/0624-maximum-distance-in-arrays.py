class Solution:
    def maxDistance(self, arrays: List[List[int]]) -> int:
        return reduce(lambda q,b:(max(q[0],b[-1]-q[1],q[2]-b[0]),min(q[1],b[0]),max(q[2],b[-1])),arrays,(0,inf,-inf))[0]
