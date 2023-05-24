package testCaseBestBuy;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseBestBuy.BaseClassBB;
import pagesBestBuy.CreatAccountPageBB;
import pagesBestBuy.HomePageBB;
import pagesBestBuy.LocationPageBB;

public class CreatAccountTestBB extends BaseClassBB {
	
	@BeforeTest
	public void excelSheet() {
		sheetName="loginTestData";
	}
	
	@Test(dataProvider="getFromExcel")
	public void tc_03_validateCreatAccountFunctionality(String fname, String lname, String emailId,
			String pass, String repass, String mob, String xpathText, String expMsg) {
		LocationPageBB lp=new LocationPageBB();
		lp.deliveryAtUSA();
		HomePageBB hp=new HomePageBB();
		hp.goToCreatAccount();
		CreatAccountPageBB ca=new CreatAccountPageBB();
		String actMsg = ca.creatAccountFunctionality(fname, lname, emailId, pass, repass, mob, xpathText);
		Assert.assertEquals(actMsg, expMsg);
	}
}
