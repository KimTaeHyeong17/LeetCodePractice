import java.util.*;
class MinStack {

    Stack<Integer> stack = new Stack();
    Stack<Integer> min = new Stack();
    /** initialize your data structure here. */
    public MinStack() {

    }
    
    public void push(int x) {
        stack.push(x);
        if(min.isEmpty()){
            min.push(x);
        }else if(x <= min.peek()){
            min.push(x);
        }

        System.out.println(min);

    }

    public void pop() {
        int x = stack.pop();
        if(x== min.peek()){
            //update min
            min.pop();
            System.out.println(min);

        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
if(stack.pop() == min.peek()) 	//false
-----------------------------
int x = stack.pop()
if (x == min.peek())			//true


출처: https://haningya.tistory.com/32?category=874020 [하닝야의 개발 블로그]
