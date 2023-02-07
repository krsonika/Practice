package DemoTestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CompareList08 extends BaseTest{
	@Test
	public static void CompareList() throws InterruptedException {
		HomePage h1=new HomePage(driver);

		//to click on apparel_shoes 
		h1.getApparelShoesNavBar().click();
		//to click on product
		Apparel_Shoes a1=new Apparel_Shoes(driver);
		a1.getProduct().click();
		a1. getCompareList().click();
		String ActualUrlOfComparePage = driver.getCurrentUrl();
		Reporter.log(ActualUrlOfComparePage,true);
		Assert.assertEquals(ActualUrlOfComparePage,ReadData.PropertyFile("ComparePageurl"),"it is not navigating to Compare page" );
		Reporter.log("it is navigating to CompareList Page when we clicks on CompareList",true);
		}
		

}

