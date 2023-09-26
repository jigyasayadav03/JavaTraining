package LinkedList;

public class LinkedListReverse {
	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	
	public void swap() {
		 Node temp = head;
		 
	            while (temp != null && temp.next != null) {
	            int k = temp.data;
	            temp.data = temp.next.data;
	            temp.next.data = k;
	            temp = temp.next.next;
	            }
	            printList(head);
	        
	}

	// prints content of double linked list
	public static void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver Code
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		LinkedListReverse list = new LinkedListReverse();
		LinkedListReverse.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
		System.out.println();
		list.swap();
	}
}
