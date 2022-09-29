//3) Design a Data Structure SpecialStack that supports all the stack operations
// like push(), pop(), isEmpty(), isFull() and an additional operation getMin()
// which should return minimum element from the SpecialStack. (Expected complexity O(1))

import java.util.ArrayList;
import java.util.List;

class MyStack{
    List<Integer> stack = new ArrayList<>();
    private int rear = -1;
    private int size;
    private ArrayList<Integer> min = new ArrayList<>();

    MyStack(int size){
        this.size = size;
    }

    public int peek(){
        return stack.get(rear);
    }
    public void push(Integer value){
        if(this.isFull()){
            System.out.println("stack size is full");
            return;
        }
        if(min.isEmpty()){
            min.add(value);
        }else if(value<min.get(min.size()-1)){
            min.add(value);
        }

        rear++;
        stack.add(value);
    }

    public int pop(){
        if(stack.isEmpty()){
            return rear;
        }
        int value = stack.remove(rear);
        if(min.size()-1>=0 && min.get(min.size()-1)==value){
            min.remove(min.size()-1);
        }
        rear--;
        return value;
    }

    public boolean isEmpty(){
        return (rear<0);
    }

    public boolean isFull(){
        return (rear>=size);
    }

    public int getMin(){
        if(min.isEmpty()){
            return -1;
        }
        return min.get(min.size()-1);
    }

}

public class Question3 {
    public static void main(String[] args) {
        MyStack st = new MyStack(10);
        st.push(4);
        st.push(3);
        st.push(10);
        st.push(2);
        st.push(10);
        st.push(10);

        System.out.println(st.pop());
        System.out.println("Minimum"+st.getMin());
        System.out.println(st.pop());
        System.out.println("Minimum"+st.getMin());
        st.push(7);
        System.out.println("Minimum"+st.getMin());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.push(0);

//        System.out.println(st.pop());

        System.out.println(st.getMin());

    }
}
