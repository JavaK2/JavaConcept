package innerclass;

public class StaticInnerClassWithStaticMethod {

	static int count = 100;

	public static void main(String[] args) {
		StaticInnerI.increaseAndDisplay();
		StaticInnerI.increaseAndDisplay();
	}

	private static class StaticInnerI {
		public static void increaseAndDisplay() {
			System.out.println(++count);
		}
	}

}
