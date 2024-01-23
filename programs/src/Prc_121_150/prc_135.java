package Prc_121_150;

class Node {
	String data;
	Node head;
	Node next;

	Node(String data) {
		this.data = data;
		this.next = null;
	}
}

public class prc_135 {
	Node head = null;

	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {

			newNode.next = head;
			head = newNode;
		}
	}

	public void printList() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	public void addInBetween(String data, int pos) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		if (head.next == null) {
			System.out.print("no position found");
			return;
		}

		int count = 1;
		Node NewNode = head;
		Node c = head.next;
		while (count < pos) {
			c = c.next;
			NewNode = NewNode.next;
			count++;

		}
		NewNode.next = newNode;
		newNode.next = c;

	}

	public void delete(String data) {
		Node currentNode = head;
		Node pre = null;
		if (head.data == data) {
			head = head.next;
		}
		while (currentNode.data != data) {
			pre = currentNode;
			currentNode = currentNode.next;

		}

		pre.next = currentNode.next;
	}

	public static void main(String[] args) {
		prc_135 p = new prc_135();
		p.addFirst("1");
		p.addFirst("2");
		p.addFirst("3");
		p.printList();
		//p.delete("2");
		p.printList();

		p.addInBetween("4", 1);
		p.addInBetween("5", 3);
		p.printList();
		
	}
}
