package DemoApps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String colour = driver.findElement(By.xpath("//a[text()='Register']")).getCssValue("color");
        System.out.println(colour);	
        
	}
	

}
