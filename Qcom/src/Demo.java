import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Penga");
		driver.findElement(By.id("pass")).sendKeys("Pengi");
		//driver.findElement(By.id("u_0_4_dv")).click();
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
