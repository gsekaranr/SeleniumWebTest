package atgspela;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ATGSpela {
	@Test
	public void Homepage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch ATG Homepage & maximize the window
		driver.get("https://www.atg.se/");
		driver.manage().window().maximize();
		
		//Accept Cookies
		driver.findElement(By.xpath("//button[contains(text(),'Godkänn alla cookies')]")).click();
		
		//Navigate to V4
		
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div/div[1]/nav/div[2]/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"all-games-toggle\"]/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'V4')]")).click();
		Thread.sleep(3000);
		//Navigate to toggle menu, Select New Coupon and Confirm, Expand the coupon
		{
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		}
		driver.findElement(By.cssSelector(".horse-1ieyr5o-BettableContent-styles--toggleActionMenu > .MuiSvgIcon-root")).click();
	    driver.findElement(By.xpath("//li[@value=\'new-coupon\']")).click();
	    driver.findElement(By.xpath("//button[contains(.,\'Bekräfta\')]")).click();
	    driver.findElement(By.cssSelector(".horse-rbmufg-BettableContent-styles--expandCouponButton > span:nth-child(1)")).click();
	    
	    Thread.sleep(5000);
	    //Scroll down
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	    
	    //Select the horses from coupon and place betting (Spela)
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div/div/div/div/div[4]/div/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/span[1]/button\r\n"
	    		+ "")).click();
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div/div/div/div/div[4]/div/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/span[2]/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div/div/div/div/div[4]/div/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/span[3]/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div/div/div/div/div[4]/div/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/span[4]/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div/div/div/div/div[4]/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div[1]/span[1]/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div/div/div/div/div[4]/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/div[2]/div[1]/span[1]/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div/div/div/div/div[4]/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/div[2]/div[1]/span[2]/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div/div/div/div/div[4]/div/div/div/div[2]/div/div/div/div[2]/div/div[4]/div[2]/div[2]/button")).click();
	    driver.findElement(By.cssSelector(".horse-5nvxvy-BetArea-styles--betButton")).click();
		
		//Delay execution for 5 sec & close the browser
	    Thread.sleep(5000);
		driver.quit();
	}
		
}
