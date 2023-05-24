package ConventionTest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseBestBuy.BaseClassBB;

public class TestCasesBB extends BaseClassBB{
	

	@Test
	public void tc_05_brokenLinkOnBottom() {
		clickOn(driver.findElement(By.className("us-link")));
		List<WebElement> links = driver.findElements(By.xpath("//footer//a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			if (url != null && !url.isEmpty()) {
				try {
					HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
					connection.setRequestMethod("HEAD");
					connection.connect();
					int responseCode = connection.getResponseCode();
					connection.disconnect();
					if (responseCode >= 400) {
						System.out.println("Broken Link Found: " + url + " - Response Code: " + responseCode);
					} else {
						System.out.println("Valid Link: " + url);
					}
				} catch (Exception e) {
					System.out.println("Exception occurred while checking the link: " + url);
					e.printStackTrace();
				}
			}
		}
	}
}
