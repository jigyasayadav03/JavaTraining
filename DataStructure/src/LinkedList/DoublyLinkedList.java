package LinkedList;

public class DoublyLinkedList {
	Node head = null;

	class Node {
		int data;
		Node next;
		Node previous;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.previous = null;
		}
	}

	// search for a element '
	public boolean searchValue(int value) {
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

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}
	}

	// insertiion at last
	public void insertatEnd(int data) {
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
		newNode.next = null;
		newNode.previous = current;
		current = newNode;

	}

	public void reverse() {

		if (head == null) {
			System.out.println("list empty");
			return;
		}
		if (head.next == null) {
			System.out.println(head.data);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		Node tempHead = current;
		do {
			System.out.print(tempHead.data + " <-> ");
			tempHead = tempHead.previous;
		} while (tempHead != null);

	}
//deleting the first element 
	
	public  void deletefromfirst() {
		if(head==null) {
			System.out.println("deleted successfully");
			return ;	
		}
		
		if(head.next==null) {
			System.out.println("deleted successfully");
			return;
		}
		head=head.next;
		head.previous=null;
	}
	
	//deleting from middle 
	
	public void deletenode(int place) {
		if(head==null) {
			System.out.println("deleted successfully");
			return ;	
		}
		
		if(head.next==null) {
			System.out.println("deleted successfully");
			return;
		}
		int count=0;
		Node current=head;
		while (count < place) {
	        if (current.next == null) {
	            System.out.println("Position " + place + " exceeds the list size. Node not found.");
	            return;
	        }
	        current = current.next;
	        count++;
	    }

	    // Adjust the pointers to delete the current node
	    current.previous.next = current.next;
	    if (current.next != null) {
	        current.next.previous = current.previous;
	    }

	    System.out.println("Node at position " + place + " deleted successfully.");
	}
	
	// printing the entire list
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " <-> ");
			current = current.next;
		}
		// System.out.println("null");
	}

	public static void main(String[] args) {
		DoublyLinkedList d = new DoublyLinkedList();
		// Insert some data
		d.insert(1);
		d.insert(2);
		d.insert(3);
		d.insert(5);
		d.insert(6);
		d.insert(8);
		// d.printList();
		System.out.println("the doubly linked list is :");
		d.insertatEnd(4);
		d.insert(0);
		d.printList();
		System.out.println("  ");
		System.out.println("the reverse list is :");
		d.reverse();
		System.out.println("  ");
		System.out.println("is the value 7 there ?? ");
		System.out.print(d.searchValue(7));
		System.out.println(" list after deletion of firest element  ");	
		d.deletefromfirst();
		d.printList();
		
	}

}
