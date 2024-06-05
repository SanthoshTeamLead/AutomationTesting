package TitleTest.CodingPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapChatTitleAndUrl {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapchat.com");
		
		String title = driver.getTitle();
		System.out.println("Title Of WebPage:- "+title);
		
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("Current Url :- " + CurrentUrl);
	    driver.close();
		
	}
}
