package DemoTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Product05 extends BaseTest{
	@Test
		public static void Product() throws InterruptedException {
		HomePage h1=new HomePage(driver);
		Thread.sleep(3000);
		h1.getApparelShoesNavBar().click();
		Thread.sleep(2000);
		Apparel_Shoes a1=new Apparel_Shoes(driver);
		a1.getProduct().click();
		String ActualUrlOfPage = driver.getCurrentUrl();
		Reporter.log(ActualUrlOfPage,true);
		Assert.assertEquals(ActualUrlOfPage,ReadData.PropertyFile("Pageurl"),"it is not navigating to next page" );
		Reporter.log("it is navigating to next when we clicks on product",true);
		}
	}


