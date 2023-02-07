package DemoTestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Email09 extends BaseTest {
	@Test
	public static void Email() throws InterruptedException {
		HomePage h1=new HomePage(driver);

		//to click on apparel_shoes 
		h1.getApparelShoesNavBar().click();
		//to click on product
		Apparel_Shoes a1=new Apparel_Shoes(driver);
		a1.getProduct().click();
		//to click on email a friend button
		a1.getEmail().click();
		//compare the url
		String ActualUrlOfEmailPage = driver.getCurrentUrl();
		Reporter.log(ActualUrlOfEmailPage,true);
		Assert.assertEquals(ActualUrlOfEmailPage,ReadData.PropertyFile("EmailPageurl"),"it is not navigating to Email page" );
		Reporter.log("it is navigating to CompareList Page when we clicks on Email a Friend button",true);
		}

}

