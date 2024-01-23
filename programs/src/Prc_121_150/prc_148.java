package Prc_121_150;

public class prc_148 {

	class LL {
		String data;
		LL next;

		LL(String data) {
			this.data = data;
			this.next = null;
		}
	}

	LL head = null;

	public void addFirst(String data) {
		LL newNode = new LL(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void printList() {
		LL currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	public void loop(prc_148 p) {
		LL slow = head;
		LL fast = head;
		int count = 0;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				count = 1;
				System.out.println("loop in the  linked list ");
				break;
			}
		}
		if (count == 0) {
			System.out.println("no loop");
		}

	}

	public static void main(String[] args) {
		prc_148 p = new prc_148();
		p.addFirst("1");
		p.addFirst("2");
		p.addFirst("3");
		p.printList();
		p.loop(p);
	}
}
