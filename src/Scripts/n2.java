package Scripts;

import org.testng.annotations.Test;

import Generic.basetest;
import Generic.data;
import POM.actitime_login1;
import POM.actitime_logout;

public class n2 extends basetest {
@Test 
public void logoutscript()
{
	actitime_login1 ob=new actitime_login1(driver);
	ob.setUsername(data.getdata(excelpath, "sheet1", 0, 0));
	ob.setpassword(data.getdata(excelpath, "sheet1", 1, 0));
	ob.clicklogin();
	
	actitime_logout ob1= new actitime_logout(driver);
	ob1.elementvisibility(ob1.getlogout());
	ob1.logoutscreen();
}

}
