package baseBestBuy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utilsBestBuy.UtilsBB;

public class BaseClassBB extends UtilsBB {
	
	@BeforeMethod
	public void start() throws Exception {
		launchBrowser(readProperty("browser"));
		getApplication(readProperty("url"));
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getFromExcel() throws Exception{
		Object[][] data = dataReader(sheetName);
		return data;
	}
}
