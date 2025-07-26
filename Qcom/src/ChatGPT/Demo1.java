package ChatGPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Penga");
		driver.findElement(By.name("pass")).sendKeys("Pengi");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}
