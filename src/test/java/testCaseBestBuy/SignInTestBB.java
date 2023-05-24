package testCaseBestBuy;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseBestBuy.BaseClassBB;
import pagesBestBuy.HomePageBB;
import pagesBestBuy.LocationPageBB;
import pagesBestBuy.SignInPageBB;

public class SignInTestBB extends BaseClassBB {
	
	@BeforeTest
	public void excelSheet() {
		sheetName="signInTestData";
	}
	
	@Test(dataProvider="getFromExcel")
	public void tc_03_SignInFunctionality(String email,String password, String xpath,String expMsg) throws Exception {
		LocationPageBB lp=new LocationPageBB();
		lp.deliveryAtUSA();
		HomePageBB hp=new HomePageBB();
		hp.goToSignIn();
		SignInPageBB sp=new SignInPageBB();
		String actMsg = sp.signInFunctionality(email,password,xpath);
		Assert.assertEquals(actMsg, expMsg);
	}
}
