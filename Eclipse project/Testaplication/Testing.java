package Bk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.gecko.driver","C:\\Program Files\\selenium-server-standalone\\geckodriver-v0.23.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.bk.rw");
        WebElement link1, link2, link3, link4;
        //link =driver.findElement(By.linkText("personal"));
        link1 =driver.findElement(By.xpath("//a[@href='https://www.bk.rw/personal']"));
        link1.click();
                link2 =driver.findElement(By.xpath("//a[@href='https://www.bk.rw/personal/checking-saving/personal-current']"));
         link2.click();

         link3 =driver.findElement(By.xpath("//a[@href='https://www.bk.rw/ways-of-banking/online-banking']"));
         link3.click();
         link4=driver.findElement(By.xpath("//a[@href='https://www.bk.rw/online-services/apply-for-online-banking']"));
         link4.click();
       /* try{
            Thread.sleep(5000);
            
        }catch(InterruptedException ex){               
     
 
            Logger.getLogger(BankOfKigali.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        driver.quit();
	   
	    }
	}


