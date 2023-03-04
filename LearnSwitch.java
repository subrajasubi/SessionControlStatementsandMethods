package s;

public class LearnSwitch implements Learning{

	@Override
	public void browserType(Browsers browser) {
		switch (browser) {
		case Chrome:
			System.out.println("Chrome");
			break;
		case Edge:
			System.out.println("Edge");
			break;
		case Safari:
			System.out.println("Chrome");
			break;
		case Firefox:
			System.out.println("Chrome");
			break;

		default:
			break;
		}
		
	}
	public static void main(String[] args) {
		LearnSwitch s = new LearnSwitch();
	   s.browserType(Browsers.Edge);
	}

	
	}


