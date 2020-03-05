package Testing;

import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LinksBing<WebElements> {
	public static WebDriver driver;
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumworkspace\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@DataProvider
	public Object[][] testdata()
	{
		return new Object[][] 
		    	{
		            { "Guru99", "India" },
		            { "Krishna", "UK" },
		            { "Bhupesh", "USA" }
		        };

	}
	@Test(alwaysRun = true)
	public void Bing() {
		
		
		driver.get("https://www.bing.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("no of links" +links.size());
		
		for(int i = 0;i<links.size();i++) {
			
		String	Name = links.get(i).getText(); 
		System.out.println("Name of the link =" +Name);
		//Reporter.log( System.out.println(\"Name of the link =\" +Name), true ));
			
		}
		
		}
	
}
