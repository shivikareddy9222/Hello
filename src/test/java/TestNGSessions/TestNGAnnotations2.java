package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations2 {

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNNY\\Desktop\\shivika\\selenium topics\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home/");
	}
	@Test(priority = 4,groups = "shiv")
	public void verifyTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Demo Guru99 Page");
	}
	@Test(priority = 3,groups = "ash")
	public void verifyLogo()
	{
		Boolean b=driver.findElement(By.xpath("//img[@src=\"images/logo_funlearn.png\"]")).isDisplayed();
		System.out.println(b);
		Assert.assertTrue(b);
	}
	@Test(priority = 2,groups = "ash")
	public void test1()
	{
		System.out.println("hi");
	}
	@Test(priority = 1,groups = "shiv")
	public void test2()
	{
		System.out.println("hello");
	}
	@AfterMethod
	public void closeDriver()
	{
		driver.quit();
	}



}
