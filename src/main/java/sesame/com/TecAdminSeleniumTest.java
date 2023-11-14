package sesame.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
 
public class TecAdminSeleniumTest {
 
 public static void main(String[] args) throws IOException, InterruptedException {
 
 FirefoxBinary firefoxBinary = new FirefoxBinary();
 firefoxBinary.addCommandLineOptions("--headless");
 firefoxBinary.addCommandLineOptions("--no-sandbox");
 System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
 FirefoxOptions firefoxOptions = new FirefoxOptions();
 firefoxOptions.setBinary(firefoxBinary);
 FirefoxDriver driver = new FirefoxDriver(firefoxOptions);
 driver.get("https://google.com");
 
 Thread.sleep(1000);
 
 if (driver.getPageSource().contains("kkkI'm Feeling Lucky")) {
 System.out.println("Pass");
 } else {
 System.out.println("Fail");
 }
 driver.quit();
 }
}
