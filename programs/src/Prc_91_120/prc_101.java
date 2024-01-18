package Prc_91_120;

public class prc_101 {
	int a;

	private prc_101() {
		this.a = 10;
	}

	public void printValue() {
		System.out.println("the value of a is: " + a);
	}

	public static prc_101 createInstance() {
		return new prc_101();
	}

	public static void main(String[] args) {
		prc_101 p = prc_101.createInstance();
		p.printValue();
	}
}
