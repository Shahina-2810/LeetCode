class MyCalendar:
    def __init__(self):
        self.calander=[]
    def book(self, start: int, end: int) -> bool:
        for s,e in self.calander:
            if(max(s,start)<min(e,end)):
                return False
        self.calander.append((start,end))
        return True
        


# Your MyCalendar object will be instantiated and called as such:
# obj = MyCalendar()
# param_1 = obj.book(start,end)