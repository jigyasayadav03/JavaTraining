package Prc_151_170;

class A {
	private int a;

	public A(int a) {
		super();
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void show() {
		System.out.println("the value of a is " + a);
	}

}

public class prc_162 {
	public static void main(String[] args) {
		A a = new A(10);
		a.show();
	}
}
