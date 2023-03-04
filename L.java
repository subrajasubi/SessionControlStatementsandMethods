package s;

public class L {
	int result = 0;
	int c = 0;
	int y = 0;

	public int addNumbers(int a, int b) {
		return c = a + b;
	}

	public void addThreeNumbers(int d) {
		c = addNumbers(35, 67);
		System.out.println(c + d);
	}

	public void addFourNumbers(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);

	}

	public int sub(int a, int b) {
		System.out.println("Subtraction");
		return a - b;
	}

	public static void main(String[] args) {

		L cal = new L();
		cal.addThreeNumbers(90);
		System.out.println(cal.sub(98, 998));

	}

}
