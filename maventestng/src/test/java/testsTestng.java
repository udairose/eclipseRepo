import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testsTestng {

	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test(priority = 1)
	public void Seleniumtest1() {
		System.out.println("In test 1");
		driver.get("http://google.com");
		String expectedPageTitle = "Google";
		Assert.assertTrue(driver.getTitle().contains(expectedPageTitle), "Test Failed");
	}
	
	@Test(priority = 3)
	public void Seleniumtest2() {
		System.out.println("In test 2");
        WebElement gmailLink= driver.findElement(By.xpath("//a[text()='Gmail']"));
        gmailLink.click();
		//WebElement gmailNavigationTitle=driver.findElement(By.xpath(xpathExpression))
    }
    @Test(priority = 2)
	public void Seleniumtest3() {
		System.out.println("In test 3");
	}

	@AfterClass
	public void tearDown() {
		//if(driver!=null)
			//driver.quit();
	}
}