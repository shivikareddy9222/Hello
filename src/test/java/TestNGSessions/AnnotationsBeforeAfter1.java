package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsBeforeAfter1 {
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
	System.out.println("1");
}
@Test
public void verifyTitle()
{
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Demo Guru99 Page");
	System.out.println("2");

}
@Test
public void verifyLogo()
{
	Boolean b=driver.findElement(By.xpath("//img[@src=\"images/logo_funlearn.png\"]")).isDisplayed();
	System.out.println(b);
	Assert.assertTrue(b);
	System.out.println("3");
}
@AfterMethod
public void closeDriver()
{
	driver.quit();
	System.out.println("4");
}

}
