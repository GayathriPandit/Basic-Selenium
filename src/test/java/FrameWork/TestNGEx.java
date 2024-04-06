package FrameWork;

import org.testng.annotations.Test;
//@Test use annotation here for all methods at once 

public class TestNGEx 
{
	@Test
	public void createContact()
	{
		System.out.println("Contact Created");
	}
	
	@Test(dependsOnMethods = "createContact")
		public void editContact()
	{
		System.out.println("Contact Edited");
	}
	//if we don't give priority testng will execute in alphabetical order
	
	@Test(enabled = false)//for not executing
	public void deleteContact()
	{
		System.out.println("Contact Deleted");
	}

}
