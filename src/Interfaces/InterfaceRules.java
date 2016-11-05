package Interfaces;

interface A1 {
	void disp();
}

interface A2 {
	void show();
}

interface A3 extends A1, A2 {
	void output();
}

class A4 implements A3 {

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}

}

public class InterfaceRules {

	public static void main(String[] args) {

	}

}
