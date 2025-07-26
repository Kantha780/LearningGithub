package Login_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Divyanshu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Penga");
		//Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Penga");
		//Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		//Thread.sleep(2000);
		driver.quit();
		
		
	}

}
