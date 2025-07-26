package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class TagNameIdName {

	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://106.51.36.97:9002/");
		driver.findElement(By.className("default_t_color")).click();
		driver.findElement(By.id("edit-name--2")).sendKeys("Kantha");
		driver.findElement(By.id("edit-pass--2")).sendKeys("Kantha");
		driver.findElement(By.id("edit-submit--18")).click();
		driver.quit();
		
	}
}
