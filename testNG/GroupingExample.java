package testNG;

import org.testng.annotations.Test;

public class GroupingExample {

	/*
	 Scenario: A big basket is having a different kind of mobiles.
	 Let us say there are Apple phones, Moto, Vivo and Lenovo.
	 I want to run tests only for Vivo and Moto phones. Write a
	 program for that.
	 */
	@Test(groups = {"apple"})
	public void apple1() {
		System.out.println("apple1 is testing");
	}
	@Test(groups = {"apple"})
	public void apple2() {
		System.out.println("apple2 is testing");
	}
	@Test(groups = {"moto"})
	public void moto1() {
		System.out.println("moto1 is testing");
	}
	@Test(groups = {"moto"})
	public void moto2() {
		System.out.println("moto2 is testing");
	}
	@Test(groups = {"vivo"})
	public void vivo1() {
		System.out.println("vivo1 is testing");
	}
	@Test(groups = {"vivo"})
	public void vivo2() {
		System.out.println("vivo2 is testing");
	}
	@Test(groups = {"lenovo"})
	public void lenovo1() {
		System.out.println("lenovo1 is testing");
	}
	@Test(groups = {"lenovo"})
	public void lenovo2() {
		System.out.println("lenovo2 is testing");
	}
}
