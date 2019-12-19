package Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic.basetest;
import Generic.basetest1;
import Generic.data;
import POM.actitime_login1;

public class n1 extends basetest1 {
@Test
public void loginscript()
{
	//driver.findElement(By.id("username")).sendKeys("admin");
    //driver.findElement(By.name("pwd")).sendKeys("manager");
    //driver.findElement(By.id("loginButton")).click();	
	actitime_login1 ob= new actitime_login1(driver);
	ob.setUsername(data.getdata(excelpath, "sheet1", 0, 0));
	ob.setpassword(data.getdata(excelpath, "sheet1", 1, 0));
	ob.clicklogin();
	ob.titlewait("");
	
}
}
