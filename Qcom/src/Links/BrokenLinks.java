package Links;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	
public static void main(String[] args) {
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total broken links :"+ links.size());
	
	
	Set<String> checkedlinks=new HashSet<>();
	
	for(WebElement l:links)
	{
		System.out.println(l.getAttribute("href"));
	}
}
	
	

}
