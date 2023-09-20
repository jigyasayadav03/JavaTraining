package Stack;

import Stack.ImplementingStack.Stack;

public class StackimplementationwiithArray {
		  int[] arr;
		  int topOfStack;

		  public StackimplementationwiithArray(int size) {
		    this.arr = new int[size];
		    this.topOfStack = -1;
		    System.out.println("The Stack is created with size of: " + size);
		  }

		  // isEmpty
		  public boolean isEmpty() {
		    if (topOfStack == -1) {
		      return true;
		    } else {
		      return false;
		    }
		  }

		  // isFull

		  public boolean isFull() {
		    if (topOfStack == arr.length-1) {
		      // System.out.println("The Stack is full!");
		      return true;
		    } else {
		      return false;
		    }
		  }

		  // Push
		  public void push(int value) {
		    if (isFull()) {
		      System.out.println("The Stack is full!");
		    } else {
		      arr[topOfStack+1] = value;
		      topOfStack++;
		      System.out.println("The value is successfully inserted");
		    }
		  }

		  // pop

		 public int pop() {
		    if (isEmpty()) {
		      System.out.println("The stack is empty");
		      return -1;
		    } else {
		      int topStack = arr[topOfStack];
		      topOfStack--;
		      return topStack;
		    }
		  }

		// Peek method
		public int peek() {
		  if (isEmpty()) {
		    System.out.println("The stack is empty!");
		    return -1;
		  } else {
		    return arr[topOfStack];
		  }
		}

		//  Delete method
		public void deleteStack() {
		  arr = null;
		  System.out.println("The Stack is successfully deleted");
		}


public static void main(String args[]) {
	Stack s=new Stack();
	s.push(1);
	s.push(3);
	s.push(7);
	s.push(6);
	System.out.println("the stack is");
	s.printStack();
	System.out.println("the peek function gives :"+s.peek());
	
	
}


		}