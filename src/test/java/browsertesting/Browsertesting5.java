package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsertesting5 { 
		 public static void main(String[] args){
	     WebDriverManager.firefoxdriver().setup();
	     FirefoxOptions options=new FirefoxOptions();
	     
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://www.google.com");
		 WebElement searchBox = driver.findElement(By.name("q"));
		 searchBox.sendKeys("Packt Publishing");
		 searchBox.submit();
		 }
}
