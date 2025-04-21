public class Test {
	static int a = 10;
	static int b = 20;
	static int c;

	public static int add() {
		return c = a + b;
	}

	public static void main(String[] args) {

		System.out.println(add());
	}

}