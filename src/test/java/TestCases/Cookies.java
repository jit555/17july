package TestCases;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies {
	
	//WebDriverManager.chromedriver().setup();
	
   public static void main(String[] args) {
	

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	Cookie cobj2 = new Cookie("Mycookie02","1234");
	driver.manage().addCookie(cobj2);
	driver.get("https://www.amazon.in/");
	
	Set <Cookie> cookies = driver.manage().getCookies();
	System.out.println("size of cookies  "+ cookies.size());
	
	for(Cookie cookie:cookies)
	{
		System.out.println(cookie.getName()+":"+cookie.getValue());
	}
	
	Cookie cobj = new Cookie("Mycookie","123");
	driver.manage().addCookie(cobj);
	
	cookies = driver.manage().getCookies();
	System.out.println("size of cookies  "+ cookies.size());
	
	for(Cookie cookie:cookies)
	{
		System.out.println(cookie.getName()+":"+cookie.getValue());
	}
	
	
	
	driver.quit();

}
}   
