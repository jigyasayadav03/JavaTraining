package Prc_121_150;

import java.util.Arrays;

class Stack {
	int size;
	int top;
	int[] arr;

	public Stack(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == size - 1);
	}

	public void push(int value) {
		if (!isFull()) {
			arr[++top] = value;
		} else {
			System.out.println("Stack overflow" + value);
		}
	}

	public int pop() {
		if (!isEmpty()) {
			return arr[top--];
		} else {
			System.out.println("Stack empty");
			return -1;
		}
	}

	public int peek() {
		if (!isEmpty()) {
			return arr[top];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public int size() {
		return top + 1;
	}
}

public class prc_136 {
	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.push(1);
		s.push(2);
		s.push(3);

		System.out.println("Stack: " + Arrays.toString(s.arr));
		System.out.println("Peek: " + s.peek());

		int poppedItem = s.pop();
		System.out.println("Popped item: " + poppedItem);

		System.out.println("Stack after pop: " + Arrays.toString(s.arr));
	}

}