package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsertesting {
public static void main(String[] args) {
	//WebDriverManager.chromedriver().setup();
	//ChromeOptions options = new ChromeOptions();
	
	EdgeDriver ed = new EdgeDriver();
	ed.get("https://www.mycontactform.com");
}
}
