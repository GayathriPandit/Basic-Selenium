package FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx
{

	@Test
	public void m1()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(true,false);
		System.out.println("Step3");
		System.out.println("Step4");
		soft.assertAll();
	}

	@Test
	public void m2()
	{
		String exp = "Gayathri";
		String act = "Gayathri";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(act,exp);
		soft.assertAll();
	}

}
