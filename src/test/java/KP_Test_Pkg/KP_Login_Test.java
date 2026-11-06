package KP_Test_Pkg;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import KP_Base_Pkg.KP_BaseClass;

public class KP_Login_Test extends KP_BaseClass {
	
	@Test
	public void title_verification()
	{
	 String actual_title=obj.title_verification();
	 Assert.assertEquals(actual_title, "Kerala Property");
	}
	
	@Test
	public void logintest_mthd()
	{
		obj.title_verification();
		obj.login_mthd("athulya@hotmail.com", "Test@12345");
	}

}
