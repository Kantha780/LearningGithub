package ChatGPT;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String expectedTitle = driver.getTitle();
		System.out.println(expectedTitle);
		
		
		String actualTitle="Facebook – log in or sign up";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("FAcebook login page is diplayed");
		}
		
		else
		{
			System.out.println("Facebook laogin page is not displayed");
		}
	}

}
