package atgspela;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
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
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[3]/div/div/div/div/div/div[1]/a/header/div/div")).click();
		
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
	    
	    //Select the horses from coupon and place betting (Spela)
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div/div/div/div/div[4]/div/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/span[1]/button\r\n"
	    		+ "")).click();
	    driver.findElement(By.cssSelector(".horse-1b18iui-CouponRace-styles--root:nth-child(1) span:nth-child(2) > .horse-1ee37nm-StartButtonWithTooltip-styles--button-StartButtonWithTooltip-styles--button")).click();
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div/div/div/div/div[4]/div/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/span[3]/button")).click();
	    driver.findElement(By.cssSelector(".horse-1b18iui-CouponRace-styles--root:nth-child(1) span:nth-child(4) > .horse-1ee37nm-StartButtonWithTooltip-styles--button-StartButtonWithTooltip-styles--button")).click();
	    driver.findElement(By.cssSelector(".horse-1b18iui-CouponRace-styles--root:nth-child(2) span:nth-child(1) > .horse-1ee37nm-StartButtonWithTooltip-styles--button-StartButtonWithTooltip-styles--button")).click();
	    driver.findElement(By.cssSelector(".horse-1b18iui-CouponRace-styles--root:nth-child(3) span:nth-child(1) > .horse-1ee37nm-StartButtonWithTooltip-styles--button-StartButtonWithTooltip-styles--button")).click();
	    driver.findElement(By.cssSelector(".horse-1b18iui-CouponRace-styles--root:nth-child(3) span:nth-child(2) > .horse-1ee37nm-StartButtonWithTooltip-styles--button-StartButtonWithTooltip-styles--button")).click();
	    driver.findElement(By.cssSelector(".horse-1b18iui-CouponRace-styles--root:nth-child(4) .MuiButtonBase-root")).click();
	    driver.findElement(By.cssSelector(".horse-5nvxvy-BetArea-styles--betButton")).click();
		
		//Delay execution for 10 sec & close the browser
	    Thread.sleep(10000);
		driver.quit();
	}
		
}
