package DemoTestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WishList07 extends BaseTest {
	@Test
	public static void Wishlist() throws InterruptedException {
		HomePage h1=new HomePage(driver);

		//to click on apparel_shoes 
		h1.getApparelShoesNavBar().click();
		//to click on product
		Apparel_Shoes a1=new Apparel_Shoes(driver);
		a1.getProduct().click();
		a1.getWishList().click();
		boolean check1 = a1.getWishListNotification().isDisplayed();
		Assert.assertEquals(check1, true,"wishlist notification is not displayed");
		Reporter.log("wishlist notification is displayed",true);
		


	

}
}
