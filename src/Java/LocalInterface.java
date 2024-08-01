package Java;

import Interface.CentralInterface;

public class LocalInterface implements CentralInterface {

	public static void main(String[] args) {

//  Class can implement multiple Interfaces		
// All Methods should be compulsorily Implemented

		CentralInterface a = new LocalInterface();

		a.GreenGo();
		a.RedStop();
		a.YellowWait();

		LocalInterface b = new LocalInterface();
		b.Walking();

	}

	@Override
	public void GreenGo() {

		System.out.println("GreenGO");

	}

	@Override
	public void RedStop() {

		System.out.println("RedStop");

	}

	@Override
	public void YellowWait() {

		System.out.println("YellowWait");

	}

	// Methods present in local can only be called by creating new objects

	public void Walking() {

		System.out.println("JustWalk");

	}

}
