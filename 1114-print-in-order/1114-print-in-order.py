class Foo:
    def __init__(self):
        
        self.done = False
        self.second_done = False



    def first(self, printFirst: 'Callable[[], None]') -> None:
        
        # printFirst() outputs "first". Do not change or remove this line.
        
        printFirst()
        self.done=True


    def second(self, printSecond: 'Callable[[], None]') -> None:
        
        # printSecond() outputs "second". Do not change or remove this line.
        while not self.done:
            continue
        self.done=False
        printSecond()
        self.second_done=True


    def third(self, printThird: 'Callable[[], None]') -> None:
        
        # printThird() outputs "third". Do not change or remove this line.
        while not self.second_done:
            continue
        printThird()
        self.second_done=True