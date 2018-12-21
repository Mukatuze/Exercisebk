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
        Actions action=new Actions(driver);
        driver.get("https://www.bk.rw");
        WebElement currentSaving,link,link1, link2, link3, link4;
        //link =driver.findElement(By.linkText("personal"));
        link1 =driver.findElement(By.xpath("//a[@href='https://www.bk.rw/personal']"));
        link1.click();
		//View on USD foreign exchange rate        
        Float buyingPrice=Float.parseFloat(driver.findElement(By.xpath("/html/body/footer/div[1]/div[4]/div/table/tbody/tr[2]/td[2]")).getText());
        Float sellingPrice=Float.parseFloat(driver.findElement(By.xpath("/html/body/footer/div[1]/div[4]/div/table/tbody/tr[2]/td[3]")).getText());
       
        if((sellingPrice>=800) && (sellingPrice>buyingPrice)){
            System.out.println("It is ok");
            System.out.println("Buying price is:" +buyingPrice);
            System.out.println("Selling price is :" +sellingPrice);
            
        }else{
                        System.out.println("It's not ok");

        }
		//First click"Current & Saving"
        currentSaving=driver.findElement(By.linkText("CURRENT & SAVINGS"));
        action.moveToElement(currentSaving).perform();
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div/div/div[2]/ul[1]/li[2]/a")).click();
		
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


