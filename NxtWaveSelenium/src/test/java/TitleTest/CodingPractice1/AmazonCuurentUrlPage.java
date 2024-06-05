package TitleTest.CodingPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCuurentUrlPage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    String CurrentUrl = driver.getCurrentUrl();
	    System.out.println(CurrentUrl);
	    driver.close();
	    
	}
		
	
}
