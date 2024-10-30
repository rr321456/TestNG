package testNG;

import org.testng.annotations.Test;

public class SkipATestCase {

	@Test(priority=0)
	public void startTheCar() {
		System.out.println("Start the Car");
	}
	@Test(priority=4,enabled = false)
	public void turTheMusicOn() {
		System.out.println("Music Turn On");
	}
	@Test(priority=1)
	public void putFirstGear() {
		System.out.println("put the First Gear");
	}
	@Test(priority=2)
	public void putSecondGear() {
		System.out.println("put the Second Gear");
	}
	@Test(priority=3)
	public void putThirdGear() {
		System.out.println("put the Third Gear");
	}
}
