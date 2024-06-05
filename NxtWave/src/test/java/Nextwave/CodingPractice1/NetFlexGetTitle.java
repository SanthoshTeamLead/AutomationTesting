package Nextwave.CodingPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlexGetTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}
}
