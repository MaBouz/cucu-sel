package sesame.com;


import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
    public WebDriver driver;

	@Given("^I open google search page$")
	public void i_open_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		 firefoxBinary.addCommandLineOptions("--headless");
		 firefoxBinary.addCommandLineOptions("--no-sandbox");
		 System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
		 FirefoxOptions firefoxOptions = new FirefoxOptions();
		 firefoxOptions.setBinary(firefoxBinary);
		 FirefoxDriver driver = new FirefoxDriver(firefoxOptions);
		driver.get("https://google.com");
	}

	@When("^I lookup the word {string}")
	public void i_lookup_the_word(String string) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.className("q")).clear();
		//driver.findElement(By.className("q")).sendKeys(string);
		//driver.findElement(By.className("btnK")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 driver.findElement(By.name("q")).clear();
		    driver.findElement(By.name("q")).sendKeys(string);
		    driver.findElement(By.name("btnK")).click();
		    
		    

	}

	@Then("Search results display the word {string}")
	public void search_results_display_the_word(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle().contains(string));
	}



}
