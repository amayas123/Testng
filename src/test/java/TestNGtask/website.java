package TestNGtask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class website {
	@Test
public void maven()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement element=driver.findElement(By.id("APjFqb"));
	element.sendKeys("lalisa");
	element.sendKeys(Keys.ENTER);
	}
	@Test
	public void maven1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testmatick.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"post-23638\"]/div/div/div/div[14]/div[2]/div/div/div/div[2]/a")).click();
		WebElement hoverElement = driver.findElement(By.xpath("//*[@id=\"menu-item-26337\"]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();
        WebElement dropdownItem = driver.findElement(By.xpath("//*[@id=\"menu-item-26590\"]/a"));
        dropdownItem.click();
         driver.get("https://testmatick.com/");
         WebElement hoverElement1 = driver.findElement(By.xpath("//*[@id=\"menu-item-26337\"]/a/span"));
         actions = new Actions(driver);
         actions.moveToElement(hoverElement1).perform();
         WebElement dropdownItem1 = driver.findElement(By.xpath("//*[@id=\"menu-item-26483\"]/a/span"));
         actions.moveToElement(dropdownItem1).perform();
         WebElement dropdownItemmenu1 = driver.findElement(By.xpath("//*[@id=\"menu-item-26663\"]/a/span"));
         dropdownItemmenu1.click();
         driver.get("https://testmatick.com/");
         WebElement hoverElement2 = driver.findElement(By.xpath("//*[@id=\"menu-item-26346\"]/a/span"));
         actions = new Actions(driver);
         actions.moveToElement(hoverElement2).perform();
         WebElement dropdownItem2 = driver.findElement(By.xpath("//*[@id=\"menu-item-26359\"]/a/span"));
         dropdownItem2.click();
         WebElement hoverElement3 = driver.findElement(By.xpath("//*[@id=\"menu-item-26347\"]/a/span"));
         actions = new Actions(driver);
         actions.moveToElement(hoverElement3).perform();
         WebElement dropdownItem3 = driver.findElement(By.xpath("//*[@id=\"menu-item-26349\"]/a"));
         dropdownItem3.click();
         driver.findElement(By.linkText("CASE STUDIES")).click();
         WebElement hoverElement4 = driver.findElement(By.xpath("//*[@id=\"menu-item-26351\"]/a/span"));
         actions = new Actions(driver);
         actions.moveToElement(hoverElement4).perform();
         WebElement dropdownItem4 = driver.findElement(By.xpath("//*[@id=\"menu-item-26358\"]/a"));
         dropdownItem4.click();
	}
}