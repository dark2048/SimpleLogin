package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	static WebDriver driver;
	

@Given("^User is on home page$")
public void user_is_on_home_page() throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Antonio\\workspace\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://outlook.live.com/owa/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//action = new Actions(driver);
	driver.manage().window().maximize();
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//div/div[2][@class='buttonLargeBlue']")).click();
    
}

@When("^User enters username and password$")
public void user_enters_username_and_password() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='i0116']")).sendKeys("antonio.olvera@outlook.com");
	driver.findElement(By.xpath(".//*[@id='idSIButton9']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(".//*[@id='i0118']")).sendKeys("asddffgghhjkl");

}

@And("^clicks login button$")
public void clicks_login_button() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='idSIButton9']")).click();;
}

@Then("^loggon unsuccesful$")
public void loggon_unsuccesful() throws Throwable {
	
	WebElement elemento = driver.findElement(By.xpath(".//*[@id='passwordError']"));
	assertEquals(true, elemento.isDisplayed());
	driver.quit();
}


}
