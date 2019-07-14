package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void TestCase()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\1Selenium\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.bing.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("no of links" +links.size());
		
		for(int i = 0;i<links.size();i++) {
			
		String	Name = links.get(i).getText(); 
		System.out.println("Name of the link =" +Name);
		Reporter.log( "Message", true );
		}
		
		}
	
}
