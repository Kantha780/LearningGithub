package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com");
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		Actions ac=new Actions(driver);
		//moveToElement()
		//ac.moveToElement(register).perform();
		
		
		//contextClick()--It is used to right click on web element
		//ac.contextClick(register).perform();
	}
	
	
	
	

}
