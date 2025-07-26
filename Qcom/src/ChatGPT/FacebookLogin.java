package ChatGPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement unTf = driver.findElement(By.name("email"));
		unTf.sendKeys("Penga");
		
		WebElement passTF = driver.findElement(By.name("pass"));
        passTF.sendKeys("Pengi");
        
        WebElement login = driver.findElement(By.name("login"));
        login.click();
        
        
        //driver.quit();
        
	}

}
