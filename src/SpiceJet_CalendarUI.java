

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet_CalendarUI {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "W:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).click();
		Thread.sleep(5000);
		
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_Unmr']")).click();


		/**********************************************************************************************
				 				U S A G E  O F  D Y N A M I C  D R O P D O W N
									 				A N D
		U S A G E  O F  I N D E X  F O R  S E L E C T I N G   O T H E R  T H A N  F I R S T  M A T C H
		**********************************************************************************************/
		System.out.println("StartDyn");		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(4000);
	System.out.println("StartDyn2");		
		driver.findElement(By.xpath("//*[text()=' Ahmedabad (AMD)']")).click();
		System.out.println("StartDyn3");		
		driver.findElement(By.xpath("(//*[text()=' Gorakhpur (GOP)'])[2]")).click();
		System.out.println("EndDyn");		

		/**********************************************************************************************
	    			S E L E C T  C U R R E N T  D A T E  O N  C A L E N D A R
											A N D
									O T H E R  D A T E S
		 **********************************************************************************************/
		System.out.println("Date1");		

		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']")).click();
		System.out.println("Date11");
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
//		driver.findElement(By.className("ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println("Date2");		
		
	}


	
}
