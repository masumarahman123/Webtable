package com.Webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableTwo {
@Test
	public static void tableTwo() throws InterruptedException {
		

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();		
	driver.get("https://qavbox.github.io/demo/webtable/");	
	driver.manage().timeouts().pageLoadTimeout(4l, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(4l, TimeUnit.SECONDS);
	
	/*List<WebElement> allcolumn=driver.findElements(By.xpath("//table[contains(@id,'table02')]//th"));
	System.out.println(allcolumn.size());
	Assert.assertEquals(allcolumn.size(), 6,"column not match");
	
	boolean status=false;
	for(WebElement e : allcolumn) {
		String value=e.getText();
		System.out.println(e.getText());
		if(value.contains("Position")) {
			status=true;
			System.out.println(value);
		}
		
	}*/
	List<WebElement> allcolumn=driver.findElements(By.xpath("//table[contains(@id,'table02')]//tr//td[2]"));
	System.out.println(allcolumn.size());
	Assert.assertEquals(allcolumn.size(), 55,"column not match");
	
	boolean status=false;
	for(WebElement e : allcolumn) {
		String value=e.getText();
		System.out.println(e.getText());
		if(value.contains("Position")) {
			status=true;
			System.out.println(value);
		}
		
	}
	
	
	
	Thread.sleep(3000);
	driver.close();

	
	
	
	
	}

}
