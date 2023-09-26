package LinkedList;

public class LoopInList {
	static class Node {
		int key;
		Node next;
	};

	static Node newNode(int key)
	{
		Node temp = new Node();
		temp.key = key;
		temp.next = null;
		return temp;
	}

	static void printList(Node head)
	{
		while (head != null) {
			System.out.print(head.key + " ");
			head = head.next;
		}
		System.out.println();
	}

	static boolean detectLoop(Node head)
	{

		Node temp = new Node();
		while (head != null) {
			if (head.next == null) {
				return false;
			}
			if (head.next == temp) {
				return true;
			}
			Node next = head.next;
			head.next = temp;
			head = next;
		}

		return false;
	}
	public static void main(String args[])
	{
		Node head = newNode(1);
		head.next = newNode(2);
		head.next.next = newNode(3);
		head.next.next.next = newNode(4);
		head.next.next.next.next = newNode(5);
		head.next.next.next.next.next = head.next.next;

		boolean found = detectLoop(head);
		if (found)
			System.out.println("Loop Found");
		else
			System.out.println("No Loop");
	}
}