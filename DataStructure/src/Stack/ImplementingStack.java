package Stack;

public class ImplementingStack {
static class Node{
	int data;
Node next;

	Node(int n){
		this.data=n;
		this.next=null;
	}

}
static class Stack{
	static Node head;
	public static boolean isEmpty() {
		return head==null;
	}
	public void push(int data) {
		Node newNode =new Node(data);
		if(isEmpty()) {
			head=newNode;
		} else {
		newNode.next=head;
	head=newNode;}
}
	public static int pop() {
		if(isEmpty()) {
			return -1;
		}
		int top=head.data;
		head=head.next;
		return top;
		
	}

	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		int top=head.data;
		return top;
		
	}
	public void printStack() {
		Node current=head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
			}
	}
public static void main(String args[]) {
	Stack s=new Stack();
	s.push(1);
	s.push(3);
	s.push(2);
	s.push(6);
	System.out.println("the stack is");
	s.printStack();
	System.out.println("the peek function gives"+s.peek());
	
	
}

}
}