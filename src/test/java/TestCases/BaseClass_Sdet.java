package TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Utilities.ReadConfig;


public class BaseClass_Sdet {
	
	ReadConfig readconfig=new ReadConfig();

	
	public String baseURL=readconfig.getApplicationURL();
    public String username=readconfig.getUsername();
    public String password=readconfig.getPassword();
    public static WebDriver driver;
    public static Logger logger;
    
    //@Parameters("browser")
    @BeforeClass
    public void setup()
    {

    	logger=Logger.getLogger("ebanking");
    	PropertyConfigurator.configure("Log4j.properties");
    	
    	System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
    	driver=new ChromeDriver();
    	
    }
    
    @AfterClass
    public void tearDown()
    {
    	driver.quit();
    }

}
