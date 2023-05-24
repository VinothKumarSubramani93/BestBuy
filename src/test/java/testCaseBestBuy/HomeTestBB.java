package testCaseBestBuy;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseBestBuy.BaseClassBB;
import pagesBestBuy.HomePageBB;
import pagesBestBuy.LocationPageBB;

public class HomeTestBB extends BaseClassBB {
	
	@BeforeTest
	public void excelSheet() {
		sheetName="menuGenricTestData";
	}
	
	@Test(dataProvider="getFromExcel")
	public void tc_04_CheckTitleOfAllMenu(String menuName,String expTitle) {
		LocationPageBB lp=new LocationPageBB();
		lp.deliveryAtUSA();
		HomePageBB hp=new HomePageBB();
		hp.menuValidation(menuName, expTitle);
	}
	
	@Test
	public void tc_05_validateLinkInBottomOfHomePage() throws Exception {
		LocationPageBB lp=new LocationPageBB();
		lp.deliveryAtUSA();
		HomePageBB hp=new HomePageBB();
		hp.validateTermsAndCondtionLink();
		titleAssertion("BestBuy.com Terms and Conditions");
	}
	
}
