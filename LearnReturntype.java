package s;

public class LearnReturntype {

	public int getCycleCount() {
		return 4;

	}

	public String getCycleColor(String brand,String color) {
		return color +" : "+ brand;

	}

	public static void vipCustomer(String customer) {
		String winner = "Owner of "+customer + " Won 10 thousand Cashback";
		System.out.println(winner);

	}

	private String winner() {
		String name = "saheel";
		System.out.println(name);
		return name;
	}

	public static void main(String[] args) {
		String winner="";
		LearnReturntype obj = new LearnReturntype();
		winner = obj.winner();

		String winnerName = "Mr"+winner;
		System.out.println(winnerName);



		/*
		 * LearnDatatype customer1 = new LearnDatatype();
		 * //System.out.println(customer1.getCycleCount()); String customer1Details =
		 * customer1.getCycleColor("CityRider","Red");
		 * System.out.println("Customre1 details : "+customer1Details);
		 * 
		 * LearnDatatype customer2 = new LearnDatatype();
		 * //System.out.println(customer1.getCycleCount()); String customer2Details =
		 * customer2.getCycleColor("Hercules","Black");
		 * System.out.println("Customre1 details : "+customer2Details);
		 * 
		 * vipCustomer(customer1Details);
		 */






	}

}
