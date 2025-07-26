package WebDriversMwthods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		String expectedTitle="Facebook – log in or sign up";

	    @Nullable
		String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	    if(actualTitle.equals(expectedTitle))
	    {
	    	System.out.println("Faceboook launched asuccessfully");
	    }
	    else
	    {
	    	System.out.println("There is a defect in title name");
	    }
	}

}
