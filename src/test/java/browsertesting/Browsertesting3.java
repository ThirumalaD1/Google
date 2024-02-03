package browsertesting;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsertesting3 {
	@Test
public void browser() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/webhp");
}
}
