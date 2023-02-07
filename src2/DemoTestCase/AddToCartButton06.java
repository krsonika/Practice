package DemoTestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddToCartButton06 extends BaseTest{
	@Test
	public static void AddToCart() throws InterruptedException {
		HomePage h1=new HomePage(driver);

		//to click on apparel_shoes 
		h1.getApparelShoesNavBar().click();
		//to click on product
		Apparel_Shoes a1=new Apparel_Shoes(driver);
		a1.getProduct().click();
		//to click on add to cart button
		a1.getAddToCart().click();
		boolean check = a1.getNotification().isDisplayed();
		Assert.assertEquals(check, true,"notification is not displayed");
		Reporter.log("notification is displayed",true);
		

}
}
