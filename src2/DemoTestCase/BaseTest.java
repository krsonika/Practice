package DemoTestCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class BaseTest {
	public static WebDriver driver;
	public Actions action;
	public WebDriverWait expicit;

	@Parameters("browserName")
	@BeforeClass
	public void BrowserSetUp(@Optional("chrome") String bname) {
		// step1:Launching a browser
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			Reporter.log("Empty Chrome Browser is Launched Successfully", true);
		} else if (bname.equalsIgnoreCase("firefox")) {
			driver = new EdgeDriver();
			Reporter.log("Empty chrome browser is Launched successfully", true);
		} else {
			throw new InvalidBrowserValueException();

		}
		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// step2: Navigating to the url
		driver.get(ReadData.PropertyFile("url").toString());
		action = new Actions(driver);
		action.click().perform();
		// driver.findElement(By.xpath(bname))
		expicit=new WebDriverWait(driver,10);
		//expicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Tricentis Demo Web Shop']")));
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(ReadData.PropertyFile("actualTitle"), expectedTitle, "home page is displayed");
		
	}
		/*public void login() {
		String email = ReadData.PropertyFile("Email");
		String password = ReadData.PropertyFile("password");
		LoginPage login=new Loginpage(driver);
		login.login(email,password);
	}

	@AfterClass
	public void browserTermination() {
		driver.quit();*/
	//}*/

	@Test
	public void add() {
		Reporter.log("sonika", true);
	}

	class InvalidBrowserValueException extends RuntimeException {
		InvalidBrowserValueException() {
			super("Invalid Browser value is passed");
		}
	}
}
