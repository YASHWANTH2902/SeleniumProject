package s1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class naukriproject {
	
	public static void main(String[] args) throws AWTException {
		
	 
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
         driver.navigate().to("https://www.naukri.com/");
         
         WebElement Find = driver.findElement(By.cssSelector("input[placeholder='Enter skills / designations / companies']"));
         
         Find.sendKeys("Automation testing");
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
       // WebElement exp = driver.findElement(By.className("dropArrowDD"));
         
        // Select sel = new Select(exp) ;
         
       //  sel.selectByIndex(1);
         
         driver.findElement(By.cssSelector("input[placeholder='Enter location']")).sendKeys("Bengaluru");
         
         driver.findElement(By.className("qsbSubmit")).click();
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
         String parent = driver.getWindowHandle();
         
         driver.findElement(By.cssSelector("a[title='Quality Assurance and Test Automation Engineer']")).click();
         
         Set<String> child = driver.getWindowHandles();
         
         for (String e : child) {
        	 
        	 if(!e.equalsIgnoreCase(parent)) {
        		 
        		 driver.switchTo().window(e);
        	 }
         }
        		 
        		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
        		 
        		 driver.findElement(By.className("reg-apply-button")).click();
        		 
        		 driver.findElement(By.id("name")).sendKeys("Yashwanth N");
        		 
        		 driver.findElement(By.id("email")).sendKeys("yashwanth2902@gmail.com");
        		 
        		 driver.findElement(By.id("password")).sendKeys("@Yashu2902");   
        		 
        		 driver.findElement(By.id("mobile")).sendKeys("7019541043");
        		 
        		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[4]/div[2]/div[2]/div[2]/h2")).click();
        		 
        		JavascriptExecutor js =(JavascriptExecutor)driver;
        		
        		js.executeScript("window.scroll(0,1000)");
        		
        		WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button"));
        	 
         js.executeScript("arguments[0].click();",button);
         
    Robot rb= new Robot();
         
    StringSelection ss=   new  StringSelection("Downloads\\YASHWANTH_N_Resume(QA)");
	
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    
    rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    rb.delay(2000);
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
    rb.delay(2000);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    
	}

}


