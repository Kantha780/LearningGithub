package WebDriversMwthods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {
	 public static void main(String[] args) {
		
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://omayo.blogspot.com/");
		 driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		// driver.close(); It will not close child window
	    driver.quit();
	 }

}
