package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.basepage;


public class actitime_logout extends basepage {
	WebDriver dummy;
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public actitime_logout(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void logoutscreen() {
		this.logout.click();
	}
	public WebElement getlogout() {
		return logout;
	}
	}