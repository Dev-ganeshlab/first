package practice1testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Pracice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().browserVersion("110.0.5481.77").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//input[@type='text'][@maxlength=61]")).sendKeys("Ganesh Ghadge");
		driver.findElement(By.cssSelector("input[name^='log']")).sendKeys("ganesh.ghadge911");
		driver.findElement(By.className("btn_checkavail")).click();
		driver.findElement(By.cssSelector("input#newpasswd")).sendKeys("ghty67.GHT");
		driver.findElement(By.cssSelector("input#newpasswd1")).sendKeys("ghty67.GHT");
		driver.findElement(By.className("nomargin")).click();
		
		//driver.findElement(By.cssSelector("option[label*='food']")).click();
		WebElement secQ = driver.findElement(By.cssSelector("select[name*='hint']"));
		Select c= new Select(secQ);
		c.selectByIndex(3);
		//WebElement dropdown = driver.findElement(By.cssSelector("select[name*='hint']"));
		 List<WebElement> options = secQ.findElements(By.tagName("option"));

		    // Iterate through options and print the text
		    for (WebElement option : options) {               
		      System.out.println(option.getText());
		    }
		
		driver.findElement(By.cssSelector("input[name*='hin']")).sendKeys("Pani Puri");
		driver.findElement(By.cssSelector("input[name*='ern']")).sendKeys("Priya");
		driver.findElement(By.id("mobno")).sendKeys("7967378896");
//		driver.findElement(By.xpath("//option[@value=23][text()=23]")).click();
//		driver.findElement(By.xpath("//option[text()='FEB']")).click();
//		driver.findElement(By.xpath("//option[text()=2005]")).click();
//		driver.findElement(By.cssSelector("option[label='Pune']")).click();
		WebElement day = driver.findElement(By.cssSelector("select[name*='Day']"));
		Select s= new Select(day);
		s.selectByValue("23");
		
		WebElement month = driver.findElement(By.cssSelector("select[name*='Month']"));
		Select s1= new Select(month);
		s1.selectByVisibleText("FEB");
		
		WebElement year = driver.findElement(By.cssSelector("select[name*='Year']"));
		Select s2= new Select(year);
		s2.selectByIndex(10);
		 
		WebElement city = driver.findElement(By.cssSelector("select[name*='city']"));
		Select s3= new Select(city);
		s3.selectByValue("Pune");
	}


	}


