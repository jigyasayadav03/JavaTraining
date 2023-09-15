package LinkedList;

public class CircularLinkedList {
	Node head=null;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	
	public  void insertatFirst(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
			newNode.next=head;
			return ;
		}
		Node current =head;
		while(current.next!=head) {
			current= current.next;			
		}
		current.next=newNode;
		newNode.next=head;
		head=newNode;
	}
	
	public void delete(int place) {
	    if (head == null) {
	        System.out.println("The list is empty.");
	        return;
	    }

	    int count = 1;
	    Node current = head;
	    while (count < place - 1) {
	        current = current.next;
	        count++;
	    }
	    // Check if place is out of bounds
	    if (current == null || current.next == null) {
	        System.out.println("Invalid position to delete.");
	        return;
	    }

	    Node temp = current.next;
	    current.next = temp.next;
	}
	
	
	   //check for a specific  value 
    //search metoh 
public  boolean searchValue(int value) {
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


	//cheching if the list is circular or not 
	public void checkCircular() {
		Node current =head;
		for(int i=0;i<10;i++) {
			System.out.print(current.data+" ->");
			current=current.next;
			
		}
	}
	//deletinng entire list 
	public void deleteList() {
	    if (head == null) {
	        System.out.println("The list is already empty.");
	        return;
	    }

	    Node current = head;
	    while (current.next != head) {
	        Node temp = current.next;
	        current.next = temp.next;
	        temp = null; // Optional: To help with garbage collection
	    }

	    // Delete the last node and reset head
	    head = null;
	}

	
	public void printList() {
		if (head == null) {
			System.out.println("list is empty");
		}
		Node current = head;
		  do
	        {
	            System.out.print(current.data + "->");
	            current = current.next;
	        } while (current != head);
		}
public static void main(String args[]) {
	CircularLinkedList c=new CircularLinkedList();
	c.insertatFirst(1);
	c.insertatFirst(2);
	c.insertatFirst(3);
	c.insertatFirst(4);
	
	c.insertatFirst(5);
	c.printList();
	System.out.println("");
	System.out.println("check circular ");
	c.checkCircular();
	System.out.println("List after delte of 2 elemnt");
	c.delete(2);
	c.printList();
	System.out.println("searching for  a particular elemnt in the list ");
	System.out.println(c.searchValue(3));


}
}
