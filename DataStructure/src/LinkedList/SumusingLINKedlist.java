package LinkedList;
public class SumusingLINKedlist {
	Node head = null;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;

		}
		current.next = newNode;
	}

	public void printList() {
		if (head == null) {
			System.out.println("list is empty");
		}
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "-> ");
			current = current.next;

		}
		// System.out.print("null");

	}

	public void sum() {
		int sum=0;
		Node current=head;
		while(current!=null) {
			sum=sum+current.data;
			current=current.next;
		}
		System.out.println("the sume is "+ sum);
	
}
public static void main(String[] args) {
	SumusingLINKedlist s=new SumusingLINKedlist();
	s.addFirst(1);
	s.addFirst(3);
	s.addFirst(4);
	s.sum();
}
}
