package Prc_121_150;

public class prc_138 {
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

	public String findMiddle() {
		LL slow = head;
		LL fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		if (slow != null) {
			return slow.data;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		prc_138 p = new prc_138();
		p.addFirst("1");
		p.addFirst("2");
		p.addFirst("3");
		p.printList();

		String mid = p.findMiddle();
		System.out.println("Middle Element: " + mid);
	}
}
