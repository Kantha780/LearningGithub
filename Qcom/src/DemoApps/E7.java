package DemoApps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E7 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("Penga");
	   // Thread.sleep(2000);
		
	    driver.findElement(By.name("pass")).sendKeys("Pengi");
	   // Thread.sleep(2000);
	    driver.findElement(By.name("login")).click();
	    //Thread.sleep(2000);
	    driver.quit();
	}

}
