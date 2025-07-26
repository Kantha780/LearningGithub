package MakeMyTrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	    Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//input[@placeholder='From']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//label[@for='toCity']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
	    driver.quit();
	
	
	}

}
