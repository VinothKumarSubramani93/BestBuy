package testCaseBestBuy;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseBestBuy.BaseClassBB;
import pagesBestBuy.CartPageBB;
import pagesBestBuy.HomePageBB;
import pagesBestBuy.LocationPageBB;
import pagesBestBuy.ProductPageBB;

public class CartTestBB extends BaseClassBB {
	
	@Test
	public void tc_06_SearchAddItemInCart() throws Exception {
		LocationPageBB lp=new LocationPageBB();
		lp.deliveryAtUSA();
		HomePageBB hp=new HomePageBB();
		hp.searchProduct("Mouse");
		ProductPageBB pp=new ProductPageBB();
		String prodTitleAtProductPage = pp.addLogitechMouse();
		CartPageBB cp=new CartPageBB();
		String prodTitleAtCartPage = cp.validateLogitechMouseInCart();
		Assert.assertEquals(prodTitleAtProductPage,prodTitleAtCartPage );
	}
	
	@Test
	public void tc_07_selAddItemShopByDeptMenu() throws Exception {
		LocationPageBB lp=new LocationPageBB();
		lp.deliveryAtUSA();
		HomePageBB hp=new HomePageBB();
		hp.selectTvMenuInHomePage();
		ProductPageBB pp=new ProductPageBB();
		String sony75TitleAtProdPage = pp.addSony75InchTVInProdPageM2();//pp.addSony75InchTVInProdPage()
		hp.goToCartPage();
		CartPageBB cp=new CartPageBB();
		String sony75TitleAtCartPage = cp.validateSonyTvInCart();
		Assert.assertEquals(sony75TitleAtCartPage,sony75TitleAtProdPage );
	}
	
	@Test
	public void tc_08_selAddItemShopByBrandMenu() throws Exception {
		LocationPageBB lp=new LocationPageBB();
		lp.deliveryAtUSA();
		HomePageBB hp=new HomePageBB();
		hp.selectSamsungBrand();;
		ProductPageBB pp=new ProductPageBB();
		String lenovoThinkPadTitleAtProdPage = pp.addLenovoThinkPadInProdPage();
		hp.goToCartPage();
		CartPageBB cp=new CartPageBB();
		String lenovoThinkPadTitleAtCartPage = cp.validateLenovoThinkPadInCart();
		Assert.assertEquals(lenovoThinkPadTitleAtCartPage,lenovoThinkPadTitleAtProdPage );
	}
}
