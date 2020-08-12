import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GreenKartApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "W:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/	");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("carrot");
	System.out.println("For loop Started");
		for(int i=0;i<5;i++)
		{
		driver.findElement(By.className("increment")).click();		
		}
		System.out.println("For loop ended");
		driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();
	
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
	
		driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
	Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@class='promoCode']")).sendKeys("ABC");
//		driver.findElement(By.xpath("//*[@class='promoBtn']")).click();
		driver.findElement(By.className("promoCode")).sendKeys("ABC");
		driver.findElement(By.className("promoBtn")).click();
//		System.out.println(	driver.findElement(By.className("promoInfo")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Place Order']")).click();
		
		/*******************************************************************
		//U S A G E  O F  S E L E C T  C L A S S
		********************************************************************/
		
		Select selectObj= new Select(driver.findElement(By.tagName("select")));
		
		Thread.sleep(2000);
		selectObj.selectByValue("India");
		Thread.sleep(2000);
		selectObj.selectByValue("Australia");
		Thread.sleep(2000);
		selectObj.selectByIndex(50);
		Thread.sleep(2000);
		selectObj.selectByIndex(27);
		Thread.sleep(2000);
		selectObj.selectByVisibleText("Albania");
		Thread.sleep(2000);
		selectObj.selectByVisibleText("Australia");
	
		/*******************************************************************
		********************************************************************/
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Proceed']")).click();
		Thread.sleep(5000);
		
		/***********************************************************************
		//U S A G E  O F  L I N K  T E X T  F O R  F I N D I N G  E L E M E N T
		************************************************************************/
		//<a class="cart-header-navlink" href="#/offers" target="_blank">Top Deals</a>
		Thread.sleep(5000);
	
		driver.findElement(By.linkText("Top Deals")).click();
		
		//#root > div > header > div > div.search > form > button
	}

}
