package TestNGtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven {
	WebDriver driver;
	@Test(dataProvider="login data")
	public void datadriven(String username,String password) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	driver.findElement(By.id("user-name")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("login-button")).click();
	}
	@AfterClass
	public void datadriven1()
	{
	driver.close();
	}
		@DataProvider(name="login data")
		public Object[][] datadriven2() {
			return new Object[][] {
				{"lalisa","lili"},
				{"jungkook","jeonjk"},
				{"rosesarerosie","rosie"},
				{"jennie","nini"},
				{"standard_user","secret_sauce"}
					};

	}
}