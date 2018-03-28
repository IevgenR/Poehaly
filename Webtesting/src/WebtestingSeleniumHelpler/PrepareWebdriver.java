package WebtestingSeleniumHelpler;
import org.eclipse.jetty.util.log.Log;
import  org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
public class PrepareWebdriver {

	public  WebDriver driver;
	protected String webdriverlocation;
	
	
	public WebDriver initwebdriver()
	{
		System.setProperty("webdriver.chrome.driver","D:\\temp\\workspace\\New folder\\chromedriver.exe");
		  //driver = new InternetExplorerDriver ();
		  WebDriver driver = new ChromeDriver();
		 
		  this.driver= driver;
		  return driver;

	}
	
	
	public Log initLogger()
	{
		
		return new Log();

	}
	
}
