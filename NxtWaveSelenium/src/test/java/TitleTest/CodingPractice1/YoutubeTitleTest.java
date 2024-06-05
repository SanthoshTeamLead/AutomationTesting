package TitleTest.CodingPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTitleTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String TitleTest = driver.getTitle();
		System.out.println(TitleTest);
		driver.close();
	}
}
