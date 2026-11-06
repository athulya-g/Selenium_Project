package KP_Test_Pkg;

import org.testng.annotations.Test;

import KP_Base_Pkg.KP_BaseClass;

public class KP_Home_Test extends KP_BaseClass {
	
	@Test
	public void click_addpropery()
	{
		hp.addproperty_mthd();
	}
	
	@Test
	public void form_details()
	{
		hp.details_mthd();
	}
	
	@Test
	public void iframe_details()
	{
		hp.iframe_mthd();
	}
	
	

}
