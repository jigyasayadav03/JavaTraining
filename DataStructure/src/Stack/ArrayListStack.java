package Stack;
import java.util.ArrayList;

public class ArrayListStack {
    public static void main(String[] args) {
        Stack stack = new Stack(); // Create an instance of the Stack class

        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(6);

        System.out.println("The stack is");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("The peek function gives " + stack.peek());
    }
}

class Stack {
    private ArrayList<Integer> al = new ArrayList<>();

    public boolean isEmpty() {
        return al.isEmpty();
    }

    public void push(int data) {
        al.add(data);
    }

    public int pop() {
        if (isEmpty()) {
            return -1; // or throw an exception to indicate stack underflow
        }
        int top = al.get(al.size() - 1);
        al.remove(al.size() - 1);
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            return -1; // or throw an exception to indicate stack underflow
        }
        return al.get(al.size() - 1);
    }
}
