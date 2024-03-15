package org.snachat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
 public static void main(String[] args) throws Exception {
	 System.setProperty("webdriver.edge.driver", "C:\\Users\\Gksan\\eclipse-workspace\\org.snachat\\target\\drive\\msedgedriver.exe");
	WebDriver ref = new EdgeDriver();
	 ref.navigate().to("https://www.flipkart.com/");
	 WebElement mobile = ref.findElement(By.xpath("//span[text()=\"Grocery\"]"));	
	 Actions  a = new Actions(ref);
	 a.moveToElement(mobile).click().perform();
	 
	// String s = "https://www.facebook.com/";
	 //driver.navigate().to(s);	 
//WebElement ref = driver.findElement (By.id("email"));
//Actions a = new Actions(driver);
//a.sendKeys(ref,"sandhiya@gmail.com").build().perform();
////a.doubleClick(ref).build().perform();
////a.contextClick(ref).build().perform();
}
}
