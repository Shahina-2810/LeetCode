class MyCircularDeque {
    
    private int[] deque;
    private int size;
    private int capacity;
    private int rear;
    private int front;

    public MyCircularDeque(int k) {
        deque= new int[k];
        rear=-1;
        front=0;
        size=0;
        capacity=k;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        front = (front - 1 + deque.length) % deque.length;
        deque[front]=value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        rear = (rear + 1 ) % deque.length;
        deque[rear]=value;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        front = (front + 1 ) % deque.length;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        rear = (rear - 1 + deque.length) % deque.length;
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) return -1;
        return deque[front];
    }
    
    public int getRear() {
        if(isEmpty()) return -1;
        return deque[(rear + deque.length)%deque.length];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == deque.length;
        
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */