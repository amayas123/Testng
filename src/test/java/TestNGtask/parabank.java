package TestNGtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parabank {
	WebDriver driver;

	@Test(dataProvider="register")

	public void parabank1(String firstname,String lastname,String address,String city,String state,String zipcode,String phonenumber,String ssn,String username,String password,String repeatedpassword) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
	driver.findElement(By.id("customer.firstName")).sendKeys(firstname);
	driver.findElement(By.id("customer.lastName")).sendKeys(lastname);
	driver.findElement(By.id("customer.address.street")).sendKeys(address);
	driver.findElement(By.id("customer.address.city")).sendKeys(city);
	driver.findElement(By.id("customer.address.state")).sendKeys(state);
	driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipcode);
	driver.findElement(By.id("customer.phoneNumber")).sendKeys(phonenumber);
	driver.findElement(By.id("customer.ssn")).sendKeys(ssn);
	driver.findElement(By.id("customer.username")).sendKeys(username);
	driver.findElement(By.id("customer.password")).sendKeys(password);
	driver.findElement(By.id("repeatedPassword")).sendKeys(repeatedpassword);
	driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
}
	@AfterClass
	public void parabank2()
	{
	driver.close();
	}
	@DataProvider(name="register")
	public Object[][]parabank3() {
		return new Object[][] {
			{"njjn","kjhil","jhui","jjjj","jhik","jikl","fdyhgu","hfjh","dydtfg","ddfsr","cgs"},
			{"ddd","hh","dd","ee","ii","oo","pp","ll","ss","ww","yy"},
			{"amaya","s","seol","korea","kerala","56925","3596596325","123456789","lalisa","lili","lili"}
		};
			
		}
}