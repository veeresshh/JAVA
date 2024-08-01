package Java;

public class ChildAircraft extends ParentAircraft {

	public static void main(String[] args) {
		
		ChildAircraft e = new ChildAircraft();
		e.Engine();
		e.SafetyGuidelines();
		e.BodyColor();

	}

	@Override
	public void BodyColor() {
		
		System.out.println("Body Color");
	}

}
