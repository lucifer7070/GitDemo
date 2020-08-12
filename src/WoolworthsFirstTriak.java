import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoolworthsFirstTriak {

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
	driver.findElement(By.xpath("//*[@href='/shop/browse/fruit-veg/fruit/organic-fruit']")).click();
	Thread.sleep(5000);
	//href="/shop/browse/fruit-veg/vegetables"
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@href='/shop/browse/fruit-veg/fruit//apples-pears']")).click();
	//href="/shop/browse/fruit-veg/fruit"
	//href="/shop/browse/fruit-veg/fruit/organic-fruit"
	//href="/shop/browse/fruit-veg/fruit/apples-pears"
	Thread.sleep(10000);
	// Fruit & Veg 
//	https://www.woolworths.com.au/
}
}