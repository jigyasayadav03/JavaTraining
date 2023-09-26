package Queue;

public class LinkedListQueue {
    Node front = null;
    Node rear = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enque(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void print() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void delete() {
    	if(front==null) {
    		System.out.println("nothing can be deleted");
    	}
    	else {
    		front=front.next;
    	}
    }

    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();
        System.out.println("queue at insertion");
        q.enque(3);
        q.enque(1);
        q.enque(2);
        q.print(); // Print the elements in the queue
        q.delete();
        System.out.println("queue after deletion");
        q.print();
    }
}
