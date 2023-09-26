package LinkedList;

public class NthNodeFromENd {
	Node head=null;
	class Node{
		int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
	}
	public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
	public void printList() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+" -> ");
			current=current.next;
			
		}
	}
	public void find(int n) {
        if (head == null || n <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        Node mainPtr = head;
        Node tempPtr = head;
        for (int i = 0; i < n; i++) {
            if (tempPtr == null) {
                System.out.println("The list has fewer than " + n + " nodes.");
                return;
            }
            tempPtr = tempPtr.next;
           
        }

        while (tempPtr != null) {
            mainPtr = mainPtr.next;
            tempPtr = tempPtr.next;
            
        }

        System.out.println("The " + n + "th node from the end is: " + mainPtr.data);
    
	}
public static void main(String[] args) {
	NthNodeFromENd l=new NthNodeFromENd();
	l.push(1);
	l.push(2);
	l.push(3);
	l.push(4);
	l.push(5);
	l.printList();
	int n=2;//node to find from last 
	l.find(n);
	
	
	
	
}
}
