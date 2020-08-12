import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "W:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		System.out.println("Launch");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(5000);
		
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_Unmr']")).click();

		/*******************************************************************
		//U S A G E  O F  A U T O  S U G G E S T I V E  D R O P D O W N
		********************************************************************/

		
		driver.findElement(By.id("autosuggest")).sendKeys("in");
		

		List<WebElement> options=driver.findElements(By.xpath("//*[@class='ui-menu-item']//a[@class='ui-corner-all']"));

		for(WebElement option:options)
		{
			System.out.println(option.getText());

		}

		/**********************************************************************************************
				 				U S A G E  O F  D Y N A M I C  D R O P D O W N
									 				A N D
		U S A G E  O F  I N D E X  F O R  S E L E C T I N G   O T H E R  T H A N  F I R S T  M A T C H
		**********************************************************************************************/

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//*[value='AMD']")).click();
		driver.findElement(By.xpath("(//a[@value='ATQ'])[2]")).click();
			
		
	}

}
