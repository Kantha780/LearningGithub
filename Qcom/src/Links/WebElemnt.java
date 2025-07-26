package Links;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebElemnt {
	
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/");
		 WebElement reg = driver.findElement(By.xpath("//a[text()='Register']"));
		 File src = reg.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Sreenshot/register.png");
		
		Files.copy(src, dest);
		driver.quit();
	}

}
