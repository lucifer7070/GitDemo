
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoolworthProject2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "W:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.woolworths.com.au/");
		System.out.println(driver.getTitle());

		Thread.sleep(10000);
		// driver.quit();
		// href="/shop/browse/fruit-veg/fruit"
		// href="/shop/browse/fruit-veg"

		driver.findElement(By.xpath("//*[@href='/shop/browse/fruit-veg']")).click();

		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(By.xpath("//*[@class='categoriesNavigation-link']"));

		System.out.println("forloopstarts");
		/*******************************************************************
		 * // W I T H U S I N G E N H A N C D F O R L O O P
		 ********************************************************************/

		for (WebElement option : options) {
			System.out.println(option.getText());
			Thread.sleep(1000);
			if (option.getText().contains("Orga")) {
				option.click();
				break;

			} else
				continue;
		}

		/*******************************************************************
		 * // W I T H O U T U S I N G E N H A N C D F O R L O O P
		 ********************************************************************/

		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
			Thread.sleep(3000);
			if (options.get(i).getText().contains("Salad")) {
				options.get(i).click();
				break;
			} else
				continue;
		}

		// *[contains(@href,'salad/')]

		List<WebElement> saladList = driver.findElements(By.xpath("//*[contains(@href,'salad/')]"));

		for (WebElement salad : saladList) {

			System.out.println(salad.getText());

			if (salad.getText().contains("Veg")) {
				salad.click();
				break;
			} else
				continue;
		}
		Thread.sleep(9000);

		
		List<WebElement> saladVegList = driver.findElements(By.xpath("//*[contains(@class,'descriptionLink')]"));

		for (WebElement saladVeg : saladVegList) {

			System.out.println(saladVeg.getText());

			if (saladVeg.getText().contains("Continental")) {
				saladVeg.click();
				break;
			} else
				continue;
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@class,'addCart')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@href,'checkout')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).sendKeys("nandhapratik@gmail.com");
		Thread.sleep(3000);
		
		/*
		 * driver.findElement(By.xpath("//*[text()=' Fruit & Veg ']")).click();
		 * Thread.sleep(5000); ///shop/browse/fruit-veg/salad
		 * driver.findElement(By.xpath("//*[@href='/shop/browse/fruit-veg/salad']")).
		 * click(); Thread.sleep(5000); //shop/browse/fruit-veg/organic"
		 * Thread.sleep(5000);
		 * driver.findElement(By.xpath("//*[@href='/shop/browse/fruit-veg/vegetables']")
		 * ).click(); Thread.sleep(5000);
		 * driver.findElement(By.xpath("//*[@href='/shop/browse/fruit-veg/organic']")).
		 * click(); Thread.sleep(10000);
		 * driver.findElement(By.xpath("//*[@href='/shop/browse/fruit-veg/fruit']")).
		 * click(); driver.findElement(By.xpath(
		 * "//*[@href='/shop/browse/fruit-veg/fruit/organic-fruit']")).click();
		 * Thread.sleep(5000); //href="/shop/browse/fruit-veg/vegetables"
		 * Thread.sleep(5000); driver.findElement(By.xpath(
		 * "//*[@href='/shop/browse/fruit-veg/fruit//apples-pears']")).click();
		 * //href="/shop/browse/fruit-veg/fruit"
		 * //href="/shop/browse/fruit-veg/fruit/organic-fruit"
		 * //href="/shop/browse/fruit-veg/fruit/apples-pears" Thread.sleep(10000); //
		 * Fruit & Veg // https://www.woolworths.com.au/
		 */

	}
}