package DemoTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class viewAsDropDown03 extends BaseTest{
	@Test
	public static void viewAs() throws InterruptedException {
		HomePage h1=new HomePage(driver);
		Thread.sleep(3000);
		h1.getApparelShoesNavBar().click();
		Thread.sleep(2000);
		Apparel_Shoes a1=new Apparel_Shoes(driver);	
		a1.getviewAs().click();
		
		WebElement viewAs = a1.getviewAs();
		Select multiSelect=new Select(viewAs);
		Reporter.log("is Multi select dropdown is:"+multiSelect.isMultiple());
		
		List<WebElement> multiSelectOption = multiSelect.getOptions();
		multiSelect.selectByIndex(1);
		String List = driver.getCurrentUrl();
		Assert.assertEquals(ReadData.PropertyFile("List"), List,"viewAsDropdown not working properly");
		Reporter.log("viewAs Dropdown works properly when we selects List",true);
		Select multiSelect1=new Select(viewAs);
		multiSelect1.selectByIndex(0);
		String Grid = driver.getCurrentUrl();
		Assert.assertEquals(ReadData.PropertyFile("Grid"),Grid,"viewAsDropdown not working properly");
		Reporter.log("viewAs Dropdown works properly when we selects Grid",true);
		
	}

}
