package Prc_121_150;

interface A {
	public void show();
}

interface B {
	public void add(int a, int b);
}

public class prc_130 implements A, B {

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("the addition fucntion :" + a + b);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("program for multiple inheritance");
	}

	public static void main(String[] args) {
		prc_130 p = new prc_130();
		p.show();
		p.add(2, 5);
	}

}
