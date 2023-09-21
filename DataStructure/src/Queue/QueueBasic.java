package Queue;

public class QueueBasic {
	
	static class Queue{
	static int arr[];
	static int size;
	static int rear=-1;
	@SuppressWarnings("static-access")
	Queue(int size){
		this.size=size;
		arr=new int[size];
		
	}
	static boolean isEmpty() {
		return rear==-1;
	}
	public static void add(int data) {
		if(rear==size-1) {
			System.out.println("the queue is full");
		}
		else {
			rear++;
			arr[rear]=data;
		}
		
	}
	public static int remove() {
		if(isEmpty()) {
			return -1;
		}
		else {
			int front=arr[0];
			for(int i=0;i<rear;i++) {
				arr[i]=arr[i+1];
				
			}
			rear--;
			return front;
		
	}}
	public static int peek() {
		if(isEmpty()) {
			return -1;
		}
		else {
		return arr[0];
			}
		
	}
	public void deleteQueue() {
		arr=null;
		System.out.println("the queue is successfully deleted");
	}
	
	
	}
@SuppressWarnings("static-access")
public static void main(String[] args) {
	Queue q=new Queue(10);
	q.add(10);
	q.add(9);
	q.add(8);
	q.add(7);
	q.add(6);
	q.add(5);
	q.add(4);
	q.add(3);
	q.add(2);
	System.out.println(q.peek());
	
	System.out.println(q.remove());
	System.out.println(q.peek());
q.deleteQueue();
System.out.println(q.peek());

	}
}
