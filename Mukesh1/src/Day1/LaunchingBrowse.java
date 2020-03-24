package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Mukesh1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				

		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
		driver.quit();
	   
			

	}

}
