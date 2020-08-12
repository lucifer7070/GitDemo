import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","W:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		/**********************************************************************************************
						R A D I O  B U T T O N S  A N D  A S S E R T I O N
		**********************************************************************************************/
		
		driver.findElement(By.xpath("//input[@value='radio1']")).click();

		System.out.println(driver.findElement(By.xpath("//input[@value='radio2']")).isSelected());

		System.out.println(driver.findElement(By.xpath("//input[@value='radio1']")).isSelected());

		/**********************************************************************************************
						S U G G E S T I V E  C L A S S  A N D  A S S E R T I O N
		 **********************************************************************************************/
		//class="inputs ui-autocomplete-input"
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("in");
		//ui-menu-item
		//id=ui-id-110
		/**********************************************************************************************
										S E L E C T  C L A S S
		 **********************************************************************************************/
			Select s= new Select(driver.findElement(By.name("dropdown-class-example")));
			Thread.sleep(6900);
			s.selectByIndex(1);
			Thread.sleep(6900);
			s.selectByValue("option3");
			Thread.sleep(6900);
			s.selectByVisibleText("Option2");
			Thread.sleep(6900);
			/**********************************************************************************************
									   C H E C K B O X  O P T I O N
			 **********************************************************************************************/

			//checkBoxOption1	
			driver.findElement(By.name("checkBoxOption1")).click();
			driver.findElement(By.name("checkBoxOption2")).click();
			Thread.sleep(2900);
				
			//cssSelector(".inputs.ui-autocomplete-input")).sendKeys("in");
			//placeholder="Enter Your Name"
			driver.findElement(By.xpath("//*[@placeholder='Enter Your Name']")).sendKeys("Error");
			Thread.sleep(2900);
			
			driver.findElement(By.xpath("//*[@value='Alert']")).click();
			Thread.sleep(2900);
			driver.switchTo().alert().accept();
			Thread.sleep(2900);
			driver.findElement(By.xpath("//*[@placeholder='Enter Your Name']")).sendKeys("Error");
			Thread.sleep(2900);
			
			driver.findElement(By.xpath("//*[@value='Confirm']")).click();
			Thread.sleep(2900);
			driver.switchTo().alert().dismiss();
	}

}
