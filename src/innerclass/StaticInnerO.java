package innerclass;

public class StaticInnerO {
	private static int count = 100;

	public static void main(String[] args) {
		StaticInnerI inn = new StaticInnerI();
		inn.increaseAndDisplay();
		inn.increaseAndDisplay();
	}

	public static class StaticInnerI {
		public void increaseAndDisplay() {
			System.out.println(++count);
		}
	}
}
