package Prc_121_150;

public class prc_137 {
	public static void main(String[] args) {

		Queue q = new Queue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);

		System.out.println("Queue size: " + q.size());
		System.out.println("Front " + q.front());

		int item = q.dequeue();
		System.out.println("Dequeued item: " + item);

		System.out.println("Queue size after dequeue: " + q.size());
	}
}

class Queue {
	private int size;
	private int front;
	private int rear;
	private int[] arr;

	public Queue(int size) {
		this.size = size;
		arr = new int[size];
		front = 0;
		rear = -1;
	}

	public boolean isEmpty() {
		return (rear < front);
	}

	public boolean isFull() {
		return (rear == size - 1);
	}

	public int size() {
		return rear - front + 1;
	}

	public void enqueue(int value) {
		if (!isFull()) {
			arr[++rear] = value;
		} else {
			System.out.println("Queue full");
		}
	}

	public int dequeue() {
		if (!isEmpty()) {
			return arr[front++];
		} else {
			System.out.println("Queue empty");
			return -1;
		}
	}

	public int front() {
		if (!isEmpty()) {
			return arr[front];
		} else {
			System.out.println("Queue is empty. Cannot get front element");
			return -1;
		}
	}
}
