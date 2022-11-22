 package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddstring {

	@Test
	public void test() {
		jUnitFunctions Junitstring=new jUnitFunctions();
		String result= Junitstring.addString("capstone","project");
	    assertEquals("capstoneproject",result);
	}

}
