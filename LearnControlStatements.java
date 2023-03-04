package s;

public class LearnControlStatements {
	
	
	private static int multiply(int a, int b) {
		int result = a*b;
		return result;

	}

	public static void main(String[] args) {
		int Z = multiply(5, 7);
		System.out.println(Z);
		
		
		//		  int i = 1;
		//		  do {
		//			i++;
		//			System.out.println(i);
		//		} while (i<=10);

		byte i = 1;
		while (i<=10) {

			i++;
			if(i==3) {
				System.out.println(i);
				continue;
			}
			
		}
	}

}
