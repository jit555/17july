package TestCases;

import java.sql.Date;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cookieAnalytics {
	
	WebDriver driver;

	/*
	@Test
	public void setup() {
		
	/*	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cm.analytics.mn/reports/analyse?modelId=27");
	
	
	Set <Cookie> cookies = driver.manage().getCookies();
	System.out.println("size of cookies  "+ cookies.size());
	
	for(Cookie cookie:cookies)
	{
		System.out.println(cookie.getName()+":"+cookie.getValue());
	}
	
	Cookie cobj = new Cookie("adminId","17000");
	driver.manage().addCookie(cobj);
	
	Cookie cobj2 = new Cookie("token","eyJhbGciOiAic2VjcmV0IiwidHlwIjogIkpXVCJ9.eyJhZG1pbklkIjoiMTcwMDAiLCJuYW1lIjoiaml0ZXNoLmdoIn0%3D.e1fa1c0c09140df28a3e3eaff74524dc");
	driver.manage().addCookie(cobj2);
	
	Cookie cobj3 = new Cookie("groups","\\\"[\\\\\\\"AUTOOPT-DBA\\\\\\\"]\\\"");
	driver.manage().addCookie(cobj3);
	
	Cookie cobj4 = new Cookie("sessionId","s292f7a3998d689f1796cecfa2a18b01a5e7cba401");
	driver.manage().addCookie(cobj4);
	
	Cookie cobj5 = new Cookie("nameId","\\\"jitesh.gh@media.net\\\"");
	driver.manage().addCookie(cobj5);
	
	Cookie cobj6 = new Cookie("name","jitesh.gh");
	driver.manage().addCookie(cobj6);
	
	cookies = driver.manage().getCookies();
	System.out.println("size of cookies  "+ cookies.size());
	
	for(Cookie cookie:cookies)
	{
		System.out.println(cookie.getName()+":"+cookie.getValue());
	}
	

	

	}	*/
	
	@BeforeSuite
	public void cookieBefore()
	{
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cm.analytics.mn/reports");
		
		setCookie("adminId","17000",".analytics.mn","/",null);
		//setCookie("","17000","","",null);
		
		driver.get("https://cm.analytics.mn/reports/analyse");
		
		//https://cm.analytics.mn/reports 
	}
	
	public void setCookie(String name, String value, String domain, String path, Date expiry) {
		Cookie ck = new Cookie(name, value, domain, path, expiry);
	    driver.manage().addCookie(ck);
	    driver.navigate().refresh();
	}
	 @Test
	 public void print()
	 {
		 System.out.println(" I am in test method");
	 }

    /*
	@AfterTest
	public void quit()
	{
	driver.quit();
	
	}*/

	}
