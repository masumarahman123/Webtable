package com.Webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {
@Test
	public static void verifyTable() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();		
		driver.get("https://qavbox.github.io/demo/webtable/");	
		driver.manage().timeouts().pageLoadTimeout(4l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4l, TimeUnit.SECONDS);
		
		List<WebElement> allHeaders=driver.findElements(By.xpath("//table[contains(@id,'table01')]//th"));
		System.out.println(allHeaders.size());
		Assert.assertEquals(allHeaders.size(), 4,"column not match");
		
		boolean status=false;
		for(WebElement e : allHeaders) {
			String value=e.getText();
			System.out.println(e.getText());
			if(value.contains("IssueTracker")) {
				status=true;
				break;
			}
			//table[contains(@id,'table01')]//tr
		}
		
		
		
		
		/*List<WebElement> allrows=driver.findElements(By.xpath("//table[contains(@id,'table01')]//tr"));
		System.out.println(allrows.size());
		Assert.assertEquals(allrows.size(), 3,"row not match");
		
		boolean statusOfrow=false;
		for(WebElement r : allrows) {
			String valueOfrows=r.getText();
			System.out.println(r.getText());
			if(valueOfrows.contains("Performance")) {
				statusOfrow=true;
				break;
			}
			
		}
		*/
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
