class MyCalendarTwo:

    def __init__(self):
        self.calender=[]
        self.overlap=[]

    def book(self, start: int, end: int) -> bool:
        for s,e in self.overlap:
            if(start<e and end > s):
                return False
        for s,e in self.calender:
            if(start < e and end> s):
                cs=max(start,s)
                ce=min(end,e)
                self.overlap.append((cs,ce))
        self.calender.append((start,end))
        return True


# Your MyCalendarTwo object will be instantiated and called as such:
# obj = MyCalendarTwo()
# param_1 = obj.book(start,end)