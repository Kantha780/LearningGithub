package ChatGPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Kantha");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kanthi");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

}
