package LinkedList;

public class SinglyLinkedList {
	Node head = null;

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addINBettween(String data, int place) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		if (head.next == null) {
			System.out.print("list not that big");
			return;
		}

		int count = 1;
		Node NewNode = head;
		Node c = head.next;
		while (count < place) {
			c = c.next;
			NewNode = NewNode.next;
			count++;

		}
		NewNode.next = newNode;
		newNode.next = c;

	}

	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void addLast(String data) {
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

	// search for a element '
	public boolean searchValue(String value) {
		Node current = head;
		if (head == null) {
			System.out.print("the list is empty");
		}
		while (current.next != null) {
			if (current.data == value) {
				return true;
			}
			current = current.next;

		}
		return false;

	}

	public void deleteFirst() {
		if (head == null) {
			System.out.print("the list is empty");

		}
		head = head.next;
	}

	public void deleteLast() {
		if (head == null) {
			System.out.print("the list is empty");

		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node secondLast = head;
		Node LastNode = head.next;
		while (LastNode.next != null) {
			LastNode = LastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

	// reverse a list
		public static void main(String args[]) {
		SinglyLinkedList l = new SinglyLinkedList();
		l.addFirst("3");
		l.addFirst("2");
		l.addINBettween("7", 1);
		l.addFirst("1");
		l.addLast("4");
		// l.printList();
		l.deleteFirst();
		l.deleteLast();
		l.addFirst("6");
		l.printList();
		System.out.print(l.searchValue("7"));

		System.out.println(" ");


	}
}
