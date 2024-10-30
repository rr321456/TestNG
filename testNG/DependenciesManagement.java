package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {
	
//problem1:you have to admit a student to engineering
//problem2:you have to admit a student to high school

	@Test(enabled = true)
	public void highschool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods = "highschool" )
	public void highersecondary() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods = "highersecondary")
	public void engineering() {
		System.out.println("High School");
	}
	
}
