package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Generic.basepage;

public class actitime_login1 extends basepage {
	public actitime_login1(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(id="loginButton")
	private WebElement login;
	

public void setUsername(String un)
{
this.username.sendKeys(un);
}
public void setpassword(String ps)
{
this.password.sendKeys(ps);
}
public void clicklogin() {
this.login.click();
}

}

