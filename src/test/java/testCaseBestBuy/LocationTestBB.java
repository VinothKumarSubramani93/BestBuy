package testCaseBestBuy;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseBestBuy.BaseClassBB;
import pagesBestBuy.LocationPageBB;

public class LocationTestBB extends BaseClassBB {
	
	@Test
	public void tc_01_validateBBUrlLaunched() throws Exception {
		LocationPageBB lp=new LocationPageBB();
		Assert.assertEquals(lp.bestBuyPageTitle(), "Best Buy International: Select your Country - Best Buy");
	}
	
	@Test
	public void tc_02_validateUrlIsNotBroken() throws Exception {
		LocationPageBB lp=new LocationPageBB();
		Assert.assertTrue(lp.urlResponseCode()==200);
	}
}
