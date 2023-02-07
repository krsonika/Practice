package DemoTestCase;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

	public class Display04 extends BaseTest{
		@Test
		public static void Display() throws InterruptedException {
		HomePage h1=new HomePage(driver);
		Thread.sleep(3000);
		h1.getApparelShoesNavBar().click();
		Thread.sleep(2000);
		Apparel_Shoes a1=new Apparel_Shoes(driver);	
		a1.getDisplay().click();
		WebElement Display = a1.getDisplay();
		Select multiSelect=new Select(Display);
		Reporter.log("is Multi select dropdown is:"+multiSelect.isMultiple());
		List<WebElement> multiSelectOption = multiSelect.getOptions();
		multiSelect.selectByIndex(0);
		String four = driver.getCurrentUrl();
		//System.out.println(four);
		Assert.assertEquals(ReadData.PropertyFile("Display4"),four,"disply dropdown not work properly");
		Reporter.log("dropdown working properly",true);
		multiSelect.selectByIndex(1);
		String eight = driver.getCurrentUrl();
		Assert.assertEquals(ReadData.PropertyFile("Display8"),eight,"disply dropdown not work properly");
		Reporter.log("dropdown working properly when selects 8",true);
		multiSelect.selectByIndex(2);
		String Twelve = driver.getCurrentUrl();
		Assert.assertEquals(ReadData.PropertyFile("Display12"),Twelve,"disply dropdown not work properly");
		Reporter.log("dropdown working properly when selects 12",true);

		
	
			

}
	}
