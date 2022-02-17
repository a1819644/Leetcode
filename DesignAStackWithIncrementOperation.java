public class DesignAStackWithIncrementOperation {
    private static int[] stack;
     private static int  countPushed = -1;

    public static void main(String[] args) {
        DesignAStackWithIncrementOperation obj = new DesignAStackWithIncrementOperation(28);
        obj.push(33);
        obj.push(91);
        obj.push(76);
        obj.push(5);
        increment(3,92);
        obj.push(81);
        obj.push(11);
        pop();
        obj.push(1);




    }

    /**
     * Your CustomStack object will be instantiated and called as such:
     * CustomStack obj = new CustomStack(maxSize);
     * obj.push(x);
     * int param_2 = obj.pop();
     * obj.increment(k,val);
     */

   /* CustomStack(int maxSize) Initializes the object with maxSize which is the maximum number of elements in the stack
    or do nothing if the stack reached the maxSize.*/
       public DesignAStackWithIncrementOperation /*customStack*/ (int maxSize) {
           stack  = new int[maxSize];

        }

   /* void push(int x) Adds x to the top of the stack if the stack hasn't reached the maxSize.*/
        public void push(int x) {
            //making sure count doesn't increase automatically
            if(countPushed  < stack.length - 1){
                countPushed++;
                stack[countPushed] = x;

            }else  return;
        }

   /* int pop() Pops and returns the top of stack or -1 if the stack is empty.*/
        public static int pop() {
            if (countPushed >= 0){
                int removed = stack[countPushed];
                countPushed--;
                return removed;
            }else return -1;
        }

   /* void inc( int k, int val) Increments the bottom k elements of the stack by val. If there are less than k elements in the stack,
    just increment all the elements in the stack.*/
        public static void increment(int k, int val) {
    if (k < stack.length) {
      for (int i = 0; i < k; i++) {
        stack[i] = stack[i] + val;
      }
        }else{
        for (int i = 0; i < stack.length; i++) {
            stack[i] = stack[i] + val;
        }
    }
        }





}
