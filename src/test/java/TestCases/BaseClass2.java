package TestCases;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2 {

	WebDriver driver;
	
	@BeforeTest
	
	public void setUp() {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cm.analytics.mn/reports/analyse?modelId=2");
	
	}
	
	@BeforeTest
    public void setCookies(String name, String value) {
  	Cookie cookie = new Cookie(name, value);
  	driver.manage().addCookie(cookie);
}
}
