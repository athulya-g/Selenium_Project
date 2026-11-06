package KP_Base_Pkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import KP_Page_Pkg.KP_Home_Page;
import KP_Page_Pkg.KP_Login;

public class KP_BaseClass {

	public static WebDriver driver;
	public KP_Login obj;
	public KP_Home_Page hp;

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://keralaproperty.in/member/login/");
	driver.manage().window().maximize();
}

@BeforeMethod
public void object_mthd()
{
	obj=new KP_Login(driver);	
	hp=new KP_Home_Page(driver);
}
}