package launchBrowser;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();

		// maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// get web site
		driver.get("https://www.google.com/");
		//// identify web element and perform action
		Thread.sleep(3000);
		
		loginTest();
		tearDown();

	}

	public static void loginTest() throws InterruptedException {

		driver.findElement(By.name("q")).sendKeys("selenium");

		driver.findElement(By.name("btnK")).click();

		// wait
		Thread.sleep(3000);

	}

	public static void tearDown() {
		driver.close();
		driver.quit();

	}

}
