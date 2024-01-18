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
			System.out.println(currentNode.data);
			currentNode = currentNode.next;

		}
	}

	public void delete(String data) {
		Node currentNode = head;
		while (currentNode.data != data) {
			currentNode = currentNode.next;
		}
		currentNode = currentNode.next.next;
	}

	public static void main(String[] args) {
		prc_135 p = new prc_135();
		p.addFirst("1");
		p.addFirst("2");
		p.addFirst("3");
		p.printList();
		p.delete("2");
		p.printList();
	}
}
