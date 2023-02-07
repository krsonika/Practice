package DemoTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class DemoWebShop01 extends BaseTest{
	@Test
	public void apperal_Shoes() throws InterruptedException {
		HomePage h1=new HomePage(driver);
		Thread.sleep(3000);
		h1.getApparelShoesNavBar().click();
		String actualurlOfApparelpage = driver.getCurrentUrl();
		Assert.assertEquals(ReadData.PropertyFile("urlOfapparelPage"),actualurlOfApparelpage,"it is not navigating apparel and Shoes page");
		Reporter.log("navigating to apparel and shoes page",true);
		
		
		/*Apparel
		 * _Shoes a1=new Apparel_Shoes(driver);
		a1.getsortBy().click();
		WebElement sortBy = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		
		Select multiSelect=new Select(sortBy);
		System.out.println("is Multi select dropdown is:"+multiSelect.isMultiple());
		
		List<WebElement> multiSelectOption = multiSelect.getOptions();
		WebElement top = driver.findElement(By.xpath("(//div[@class='details'])[1]/h2"));
	    String TopLink = top.getText();
	    System.out.println(TopLink);
		multiSelect.selectByIndex(2);
		WebElement hat = driver.findElement(By.xpath("//a[text()='Wool Hat']"));
		String hatLink = hat.getText();
		System.out.println(hatLink);
		Assert.assertNotEquals(TopLink, hatLink,"sorting is successful");*/
		

		
		
	
	}


}
