package Java;

public class FunctionOverriding extends ParentInheritence {

	// java does not allow multiple inheritance but in interface we can

	public void AudioSystem() {

		System.out.println("Child Audio System");
	}

	public void Engine() {

		System.out.println("Engine");
	}

	public void Color() {

		System.out.println(Color);
	}

	public static void main(String[] args) {

		FunctionOverriding c = new FunctionOverriding();
		c.Color();
		c.Brake();
		c.AudioSystem();

	}

}