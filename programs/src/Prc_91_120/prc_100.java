package Prc_91_120;

public class prc_100 {
	int sum;

	prc_100() {

		this(5, 2);
	}

	prc_100(int n1, int n2) {
		this.sum = n1 + n2;
	}

	void display() {
		System.out.println("Sum is: " + sum);
	}

	public static void main(String[] args) {

		prc_100 p = new prc_100();

		p.display();
	}
}