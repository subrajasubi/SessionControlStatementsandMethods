package s;

public class Lear {

	private int getCycleCount() {
		return 4;
	}
	
	private String getCycleColor(String color,String brand) {
	return color+" "+brand;

	}
	
	public static void main(String[] args) {
		Lear l = new Lear();
		String cycleColor = l.getCycleColor("Blue", "CityRider");
		System.out.println(cycleColor);

	}

}
