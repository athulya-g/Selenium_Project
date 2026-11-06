package KP_Page_Pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KP_Login {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(xpath="//*[@id=\"upass\"]")WebElement password;
	@FindBy(xpath ="//*[@id=\"sub_logbtn\"]")WebElement login;
	
	public KP_Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String title_verification()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void login_mthd(String un,String pswd)
	{
		username.sendKeys(un);
		password.sendKeys(pswd);
		login.click();
	}
	

}
