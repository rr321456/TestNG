package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	
	String name = "agni";
	
	@Test
	public void checkequal() {
		Assert.assertEquals(name, "Agni");
		
	}

}
