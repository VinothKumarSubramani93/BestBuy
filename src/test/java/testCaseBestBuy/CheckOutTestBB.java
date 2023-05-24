package testCaseBestBuy;

import org.testng.annotations.Test;

import baseBestBuy.BaseClassBB;
import pagesBestBuy.CartPageBB;
import pagesBestBuy.CheckOutPageBB;
import pagesBestBuy.HomePageBB;
import pagesBestBuy.LocationPageBB;
import pagesBestBuy.ProductPageBB;

public class CheckOutTestBB extends BaseClassBB {
	//https://www.bestbuy.com/checkout/r/payment
	@Test
	public void tc_09_CheckOut() {
		LocationPageBB lp=new LocationPageBB();
		lp.deliveryAtUSA();
		HomePageBB hp=new HomePageBB();
		hp.searchProduct("Mouse");
		ProductPageBB pp=new ProductPageBB();
		String dummyReturn = pp.addLogitechMouse();
		CartPageBB cp=new CartPageBB();
		cp.goToCheckOutPage();
		CheckOutPageBB cop=new CheckOutPageBB();
		cop.contactInfoAtCheckOut("vino18493@gmail.com", "9876543210");
		cop.enterDetailsOnCheckOut("5432167890654321", "12", "2025", "321", "SonName", "FatherName", "123 Vvikanandhar Road", "Utto", "DC", "32145");
	}
}
