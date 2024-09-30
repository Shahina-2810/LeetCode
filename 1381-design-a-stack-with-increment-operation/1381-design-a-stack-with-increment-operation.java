class CustomStack {
    private int num;
    private Stack<Integer> stack;
    private List<Integer> Stackinc;

    public CustomStack(int maxSize) {
        this.num = maxSize;
        this.stack = new Stack<>();
        this.Stackinc = new ArrayList<>();
    }

    public void push(int x) {
        if (stack.size() < num) {
            stack.push(x);
            Stackinc.add(0);
        }
    }

    public int pop() {
        if (stack.isEmpty()) return -1;
        if (Stackinc.size() > 1) Stackinc.set(Stackinc.size() - 2, Stackinc.get(Stackinc.size() - 2) + Stackinc.get(Stackinc.size() - 1));
        return stack.pop() + Stackinc.remove(Stackinc.size() - 1);
    }

    public void increment(int k, int val) {
        if (!stack.isEmpty()) {
            int index = Math.min(k, Stackinc.size()) - 1;
            Stackinc.set(index, Stackinc.get(index) + val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */