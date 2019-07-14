package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Shaadicom {

	static String email = "tagorekrn@gmail.com";
	static String password = "etps2@jul";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "E:\\1Selenium\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.shaadi.com/registration/user");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class = 'reg_input_txt validate common_error']")).sendKeys(email);
		driver.findElement(By.id("password1")).sendKeys(password);
		WebElement dropdown =  driver.findElement(By.tagName("select"));
		Select slt = new Select(dropdown);
		List<WebElement> droplist = slt.getOptions();
		System.out.println("Name of dropdown:" +droplist);
		
	}

}
