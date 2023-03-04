package s;

import java.util.Arrays;

public class LearnProgram {

	public static void fibonacci() {
		//0 1 1 2 3 5 8 13
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 2; i < 8; i++) {
			num3 = num1 +num2;//0+1=1 1+1=2
			System.out.println(num3);//2
			num1=num2;//1
			num2=num3;//2
		}
	}

	public static void prime(int input) {
		//int input = 7;
		boolean bPrime = true;
		for (int i = 2; i < input-1; i++) {
			if (input%i==0) {
				bPrime=false;
				System.out.println("Non Prime");
				break;
			}

		}
		if (bPrime) {
			System.out.println("Prime");
		}

	}

	public static  void characterCount() {
		String name = "Testleaf";
		char expected = 'e';
		int count=0;
		char[] ch = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]==expected) {
				count++;
			}
		}
		if (count>1) {
			System.out.println("The letter " + expected + " occurs "+ count + " times ");
		}

	}


	public static void findDuplicates() {
		int[] nums = {2,3,4,2,5,6,5};
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]==nums[i+1]) {
				System.out.println(nums[i]);
			}
		}


	}


	public static void findNumbers() {
		String data = "Amazon laid off 12,000 employees globally";
		String replaceAll = data.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);

	}

	public static void findVowels() {
		String name = "GOOGLE";
		name=name.toLowerCase();
		char[] ch = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				System.out.println(ch[i]);
			}
		}

	}

	public static void findConsonants() {
		String name="Subraja";
		String replaceAll = name.replaceAll("[aeiouAEIOU]", "");
		System.out.println(replaceAll);
	}


	public static  void palindrome() {
		String name = "malayalam";
		char[] ch = name.toCharArray();
		String rev="";
		for (int i = ch.length-1; i >=0; i--) {
			rev=rev+ch[i];
		}
		if (rev.equals(name)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}


	}

	public static void wordCount() {
		String str = "Amazon Developement Centre , Chennai";
		String[] split = str.split(" ");


		for (int i = split.length-1; i >=0 ; i--) {
			System.out.print(split[i]+" ");

		}

	}


	public static void main(String[] args) {
		fibonacci();
		prime(6);
		prime(7);
		characterCount();
		findDuplicates();
		findNumbers();
		findVowels();
		findConsonants();
		palindrome();
		wordCount();
	}

}
