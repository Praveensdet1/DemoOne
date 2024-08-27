package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JotForm {
	@Test
	public void testJotFormApp() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();//initialize chrome driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.jotform.com/");
		driver.findElement(By.xpath("//*[.='Login']")).click();
		driver.findElement(By.id("username")).sendKeys("praveenreddy2531@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Praveen7013@");
		driver.findElement(By.id("signinButton")).click();
	
		
		driver.findElement(By.xpath("//span[.='Create Form']")).click();
		
		driver.findElement(By.xpath("//span[.='Start From Scratch']")).click(); //click on start from scratch
		driver.findElement(By.xpath("//*[.='Classic Form']")).click();//select form layout, click on classic form
		
	
		driver.findElement(By.xpath("//div[@class='jfModal-close']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"toogleLeftPanel\"]")).click();//click on add form element
		
		driver.findElement(By.xpath("//*[.='Full Name']")).click();
		driver.findElement(By.xpath("//li[@id='field_item_control_email']")).click();
		driver.findElement(By.xpath("//*[.='Phone']")).click();
		
		/*
		WebElement dropEle=driver.findElement(By.xpath("//h1"));
		Actions act=new Actions(driver);
		act.dragAndDrop(fullname,dropEle).perform();
		Thread.sleep(3000);
        act.dragAndDrop(driver.findElement(By.xpath("//li[@id='field_item_control_email']")),driver.findElement(By.xpath("//h1[@id='header_1']"))).perform();
		Thread.sleep(3000);
		//WebElement dropEle3=driver.findElement(By.xpath("//*[@id='id_4']"));
		act.dragAndDrop(driver.findElement(By.xpath("//*[.='Phone']")),driver.findElement(By.xpath("//h1[@id='header_1']"))).perform();
		Thread.sleep(3000);
		/*
		driver.findElement(By.xpath("(//*[@type=\"button\"])[19]")).click();//click on settings icon
		driver.findElement(By.xpath("//*[@id=\"text\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("FullName");
		driver.findElement(By.xpath("//*[@class=\"flipSwitch-slider\"]")).click();//setting mandatory field
		driver.findElement(By.id("question-settings-close-btn")).click();//closing settings icon
		
		driver.findElement(By.id("header_1")).click();//click on header
		driver.findElement(By.xpath("(//*[@type=\"button\"])[18]")).click();//click on settings icon
		driver.findElement(By.xpath("//*[@id=\"text\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("EmployeeDetails");
		driver.findElement(By.id("question-settings-close-btn")).click();//closing settings icon
		
		driver.findElement(By.xpath("//a[.='Settings']")).click();//navigate to settings
		driver.findElement(By.xpath("//input[@id=\"title\" and @class= \"inpt injectCSSPrevention \"]")).sendKeys("EmployeeRegistrationForm");//enter title of form
		driver.findElement(By.xpath("//*[.='Publish']")).click();//navigate to publish
		driver.findElement(By.xpath("//*[.='Open in new tab']")).click();//open in new tab
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		
		

		
		
		
	
		*/
		driver.quit();
		
		
		
		
		
		
		
	}

}
