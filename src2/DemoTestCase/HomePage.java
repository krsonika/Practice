package DemoTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparelShoesNavBar;

	public WebElement getApparelShoesNavBar() {
		return apparelShoesNavBar;
	}

}
