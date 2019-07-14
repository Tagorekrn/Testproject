package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DropDownTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\1Selenium\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		for(int i=0; i<frames.size(); i++) {
			driver.switchTo().frame(i);	
		}
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions mouse = new Actions(driver);
		mouse.clickAndHold(drag).dragAndDrop(drag, drop).build().perform();
	}

}
