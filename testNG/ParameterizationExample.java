package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

	@Test
	@Parameters("Name")//from testng annotation library
	public void printname(String xyz) {
		System.out.println("name is" +xyz);
	}
}
