package s;

public class Mc {
public static void main(String[] args) {
	Calculator c = new Calculator();
	int add = c.add(34, 546, 565);
	System.out.println(add);
	int mul = c.mul(0, 0);
	System.out.println(mul);
	c.sub();
}
}
