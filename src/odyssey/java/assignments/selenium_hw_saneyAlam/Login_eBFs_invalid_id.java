package src.odyssey.java.assignments.selenium_hw_saneyAlam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_eBFs_invalid_id {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mdjakirhossen/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php ");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("Yousub12345@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("28februarY");
		driver.findElement(By.id("SubmitLogin")).click();
		

	}

}
