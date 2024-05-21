package TestNGtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class registrationform {
	WebDriver driver;
	@Test(dataProvider="registrationform")
	public void datadriven(String firstname,String lastname,String useremail,String userurl,String userpass,String password) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.wpeverest.com/user-registration/form-3/");
	driver.manage().window().maximize();
	driver.findElement(By.id("first_name")).sendKeys(firstname);
	driver.findElement(By.id("last_name")).sendKeys(lastname);
	driver.findElement(By.id("user_email")).sendKeys(useremail);
	driver.findElement(By.id("user_url")).sendKeys(userurl);
	driver.findElement(By.id("user_pass")).sendKeys(userpass);
	driver.findElement(By.id("user_confirm_password")).sendKeys(password);
	driver.findElement(By.id("radio_1530100861")).click();
	driver.findElement(By.id("check_box_1530100860_Choice1")).click();
	driver.findElement(By.id("check_box_1530100860_Choice2")).click();
	driver.findElement(By.id("check_box_1530100860_Choice3")).click();
    WebElement radioButton = driver.findElement(By.id("radioButtonId"));
    if (!radioButton.isSelected()) {
        radioButton.click();
    }
    WebElement dropdownElement = driver.findElement(By.id("country_1507714747"));

    // Create a Select object
    Select select = new Select(dropdownElement);

    // Select by visible text
    select.selectByVisibleText("Austria");
    driver.findElement(By.id("textarea_1507714757")).click();
    driver.findElement(By.id("number_box_1507716030")).click();
    WebElement dropdownElement1 = driver.findElement(By.id("select_1507714760"));

    // Create a Select object
    Select select = new Select(dropdownElement);

    // Select by visible text
    select.selectByVisibleText("Option3");
    driver.findElement(By.id("input_box_1507714764")).click();
    driver.findElement(By.xpath("//*[@id=\"user-registration-form-20\"]/form/div[6]/button")).click();
    }
    
    @AfterClass
    public void registrationform2()
	{
	driver.close();
	}
    @DataProvider(name="registationform3")
	public Object[][]parabank3() {
		return new Object[][] {
			{
		}
		}
    }
}