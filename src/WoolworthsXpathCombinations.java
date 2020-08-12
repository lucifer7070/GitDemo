
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoolworthsXpathCombinations  {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "W:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.woolworths.com.au/");
		System.out.println(driver.getTitle());
		
		Thread.sleep(10000);
	//	driver.quit();
		//href="/shop/browse/fruit-veg/fruit"
		
	driver.findElement(By.xpath("//*[text()=' Fruit & Veg ']")).click();
	Thread.sleep(5000);


	///shop/browse/fruit-veg/salad
	driver.findElement(By.xpath("//*[@href='/shop/browse/fruit-veg/salad']")).click();
	Thread.sleep(5000);
	//shop/browse/fruit-veg/organic"
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@href='/shop/browse/fruit-veg/vegetables']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@href='/shop/browse/fruit-veg/organic']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@href='/shop/browse/fruit-veg/fruit']")).click();


 	//<a class=categoriesNavigation-link
 
	Thread.sleep(10000);
	List<WebElement> options= driver.findElements(By.xpath("//a[@class='categoriesNavigation-link']"));
	
int i=0;
	for(WebElement option : options)
	{
		if(i<3)
		{option.click();
		Thread.sleep(10000);
		System.out.println(option.getText());
		}
		else
			break;
		
		i++;
	}
	System.out.println("For Loop Ended");
	

//class="categoriesNavigation-linkText"
/*
 	driver.findElement(By.xpath("//*[@class='categoriesNavigation-linkText']")).click();
 
	System.out.println("Check1");
	

	driver.findElement(By.xpath("//*[contains(@href,'/shop/browse/fruit-veg/fruit/')]")).click();
	System.out.println(driver.findElement(By.xpath("//*[contains(@href,'/shop/browse/fruit-veg/fruit/')]")).getText());
	
	//href="/shop/browse/fruit-veg/fruit/apples-pears"
	//href="/shop/browse/fruit-veg/fruit/apples
	List<WebElement> optionsFruits =driver.findElements(By.xpath("//*[contains(@href,'/shop/browse/fruit-veg/fruit/')]"));
	System.out.println("For Loop started");
	int i=0;
	for(WebElement optionA : optionsFruits)
	{
	
		optionA.click();
		System.out.println("Before Text"+i);
		i++;
		Thread.sleep(10000);
	//	System.out.println(optionA.getText());
		System.out.println("After Text"+i);
		Thread.sleep(4000);
		
	}
	System.out.println("For Loop Ended Again");
	
	//href="/shop/browse/fruit-veg/fruit/organic-fruit"

	

*/
	
	
	
	// Fruit & Veg 
//	https://www.woolworths.com.au/
}
}