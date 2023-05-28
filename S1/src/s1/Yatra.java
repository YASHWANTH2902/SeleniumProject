package s1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Yatra {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	
	driver.navigate().to("http://www.amazon.in");
	
	String parent = driver.getWindowHandle();
	
	driver.manage().window().maximize();
	
	
	
	WebElement searchtf = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
    Actions act	= new Actions(driver);
    
    act.click(searchtf).sendKeys("whitetigerbook",Keys.ENTER).build().perform();
    
    driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
    
    Set<String> child = driver.getWindowHandles();
    
    for(String e:child) {
    if(!e.equalsIgnoreCase(parent))
    {
    	driver.switchTo().window(e);
    
    }
    }
    driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
    
 WebElement pn = driver.findElement(By.name("email"));
 
 pn.sendKeys("7019541043",Keys.ENTER);
 
 WebElement pw = driver.findElement(By.name("password"));
 
 pw.sendKeys("@Yashu2902",Keys.ENTER);
 
 driver.findElement(By.xpath("//*[@id=\"shipToThisAddressButton\"]/span/input")).click();
 
driver.findElement(By.name("ppw-claimCode")).sendKeys("1234");


}
}
