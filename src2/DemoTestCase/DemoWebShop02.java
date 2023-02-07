package DemoTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class DemoWebShop02 extends BaseTest {
	public static void sortBy() {
	Apparel_Shoes a1=new Apparel_Shoes(driver);
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
	Assert.assertNotEquals(TopLink, hatLink,"sorting is successful");
	multiSelect.selectByIndex(3);
	WebElement pant=driver.findElement(By.xpath("//a[text()='Blue Jeans']"));
	String pantLink = pant.getText();
	Assert.assertNotEquals(TopLink, pantLink,"sorting is successful");
	
	
	
	

	

}
}
