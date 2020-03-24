package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Mukesh2\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		@test
		public void test1();
		System.out.println(driver.getTitle());
		System.out.println(driver.navigate());
		driver.quit();

	}

}
