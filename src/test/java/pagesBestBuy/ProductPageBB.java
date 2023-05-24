package pagesBestBuy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseBestBuy.BaseClassBB;

public class ProductPageBB extends BaseClassBB {
	
	@FindBy(xpath="//button[@data-sku-id='6360418' and @data-button-state='ADD_TO_CART']")
	WebElement addToCartLogitechMouse;
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	WebElement goToCartButton;
	
	@FindBy(xpath="//button[text()='Continue shopping']")
	WebElement continueShoping;
	
	@FindBy(xpath="//div[@data-sku-id='6360418']//h4//a")
	WebElement logitechMouseAtProductPage;
	
	@FindBy(xpath="//button[@data-sku-id='6499752' and @data-button-state='ADD_TO_CART']")
	WebElement addToCartTv;
	
	@FindBy(xpath="//h1[contains(text(),'Sony - 75')]")
	WebElement sony75InchTvHeading;
	
	@FindBy(xpath="//a[contains(text(),'Sony - 75')]")
	WebElement sony75InchTvHeadingM2;
	
	
	@FindBy(xpath="//a[contains(text(),'Sony - 75')]")
	WebElement sony75InchTv;
	
	@FindBy(xpath="//p[text()='ThinkPad laptops']")
	WebElement thinkPadLaptopsAtLenovoProdPage;
	
	@FindBy(xpath="//a[contains(text(),'Lenovo - ThinkPad E15 Gen 4')]")
	WebElement lenovoThinkPad4TitleAtProdPage;
	
	@FindBy(xpath="//button[@data-sku-id='6518017' and @data-button-state='ADD_TO_CART']")
	WebElement addToCartLenovoThinkPad;
	
	public ProductPageBB() {
		PageFactory.initElements(driver, this);
	}
	
	public String addLogitechMouse(String imgName) throws Exception {
		String logiTechTitleAtProdPage = extractText(logitechMouseAtProductPage);
		clickOn(addToCartLogitechMouse);
		clickOn(goToCartButton);
		return logiTechTitleAtProdPage;
	}
	
	public String addSony75InchTVInProdPage() {
		clickOn(sony75InchTv);
		String sony75TitleAtProdPage = extractText(sony75InchTvHeading);
		clickOn(addToCartTv);
		return sony75TitleAtProdPage;
	}
	
	public String addSony75InchTVInProdPageM2() {
		String sony75TitleAtProdPage = extractText(sony75InchTvHeadingM2);
		clickOn(addToCartTv);
		//clickOn(goToCartButton);
		return sony75TitleAtProdPage;
	}
	
	public String addLenovoThinkPadInProdPage() {
		clickOn(thinkPadLaptopsAtLenovoProdPage);
		String lenovoThinkPadTitleAtProdPage = extractText(lenovoThinkPad4TitleAtProdPage);
		clickOn(addToCartLenovoThinkPad);
		return lenovoThinkPadTitleAtProdPage;
	}
}
