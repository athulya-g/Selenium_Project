package KP_Page_Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class KP_Home_Page {

	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a")WebElement addprop;
	@FindBy(xpath="//*[@id=\"proptype\"]")WebElement propfor;
	@FindBy(xpath="//*[@id=\"listtype\"]")WebElement listplan;
	@FindBy(xpath="//*[@id=\"proplabel\"]")WebElement proplabel;
	@FindBy(xpath="//*[@id=\"propcategory\"]")WebElement category;
	@FindBy(xpath="//*[@id=\"propcost\"]")WebElement expcost;
	@FindBy(xpath="//*[@id=\"propbeds\"]")WebElement bed;
	@FindBy(xpath="//*[@id=\"propbaths\"]")WebElement bath;
	@FindBy(xpath="//*[@id=\"district\"]")WebElement district;
	@FindBy(xpath="//*[@id=\"proplocation\"]")WebElement loctn;
	@FindBy(xpath="//*[@id=\"propaddress\"]")WebElement address;
	@FindBy(xpath="//*[@id=\"introlabel\"]")WebElement addtitle;
	@FindBy(xpath="//*[@id=\"frm_property\"]/div[9]/div/div/iframe")WebElement frametag;
	@FindBy(xpath = "/html/body")WebElement summarybox;
	
	
	public KP_Home_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addproperty_mthd()
	{
		addprop.click();
	}
	
	public void details_mthd()
	{
		Select prop=new Select(propfor);
		prop.selectByVisibleText("Rental");
		
		Select list=new Select(listplan);
		list.selectByVisibleText("Featured Listing");
		
		proplabel.sendKeys("abcd");
		
		Select ctgry=new Select(category);
		ctgry.selectByVisibleText("Residential Land");
		
		expcost.sendKeys("20000");
		bed.sendKeys("15");
		bath.sendKeys("10");
		
		Select dis=new Select(district);
		dis.selectByVisibleText("Ernakulam");
		
		Select loc=new Select(loctn);
		loc.selectByVisibleText("Aalangad");
		
		address.sendKeys("aaaaa");
		addtitle.sendKeys("Home");	
	}
	
	public void iframe_mthd()
	{
		driver.switchTo().frame(frametag);
		summarybox.click();
		summarybox.sendKeys("Property Description");	
		
		driver.switchTo().defaultContent();
	}
	
}
