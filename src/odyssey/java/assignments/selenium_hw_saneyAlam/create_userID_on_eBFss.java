package src.odyssey.java.assignments.selenium_hw_saneyAlam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class create_userID_on_eBFss {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/mdjakirhossen/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php ");
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("komolkhanm4@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		Thread.sleep(5000);
		
		WebElement e = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]"));
		e.click();
		driver.findElement(By.id("customer_firstname")).sendKeys("komol");
		driver.findElement(By.id("customer_lastname")).sendKeys("khan");
		//driver.findElement(By.id("email")).sendKeys("komolkhanm4@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("28februarY");

		Thread.sleep(2000);
		
		Select days = new Select(driver.findElement(By.xpath("//select[@id='days']")));
	    days.selectByIndex(28);
	    Select months = new Select(driver.findElement(By.xpath("//select[@id='months']")));
	    months.selectByIndex(2);
	    Select years = new Select(driver.findElement(By.xpath("//select[@id='years']")));
	    years.selectByIndex(25);
	    
	    driver.findElement(By.id("submitAccount")).click();
	    
	   
	}

}
