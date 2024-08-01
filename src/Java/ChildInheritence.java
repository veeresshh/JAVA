package Java;

public class ChildInheritence extends ParentInheritence {

	// java does not allow multiple inheritance but in interface we can

	public void Engine() {

		System.out.println("Engine");
	}

	public void Color() {

		System.out.println(Color);
	}

	public static void main(String[] args) {

		ChildInheritence c = new ChildInheritence();
		c.Color();
		c.Brake();

	}

}
