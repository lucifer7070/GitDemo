import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "W:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		System.out.println(driver.getTitle());
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@class='makeFlex googleLoginBtn flexOne']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(15000);
		System.out.println(driver.getTitle());			//driver.close();
	//	driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("dhamini1191@gmail.com");
	//	driver.findElement(By.partialLinkText("Forgot email")).click();
		driver.findElement(By.xpath("//*[text()='Forgot email?']")).click();
}
}