package s1;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {
@Test
	public void reg() {
		ChromeDriver driver =new ChromeDriver();
		driver.navigate().to("http://www.naukri.com");
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div[7]/div/div/div[3]/div/span")).click();
		Object dropdown;
		Select s=new Select(dropdown);
		//Thread.sleep(2000);
s.selectByIndex(0);
		//driver.findElement(By.xpath("//*[@id=\"sa-dd-scrollexpereinceDD\"]/div[1]/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[7]/div/div/div[1]/div/div/div/div[1]/div/input")).sendKeys("Automation testing");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[7]/div/div/div[5]/div/div/div/div[1]/div/input")).sendKeys("Bengaluru");
	
		driver.findElement(By.className("qsbSubmit")).click();*/
		
		//String parent = driver.getWindowHandle();
		
		//.findElement(By.cssSelector("a[title='Quality Assurance and Test Automation Engineer']")).click();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		for(String w:windows) {
		String parent;
		if(w!=parent)
		{
		//	driver.switchTo().window(w);
			
		}
	}

}
}
