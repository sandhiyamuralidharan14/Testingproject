package org.snachat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class criptExecutor  {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Gksan\\eclipse-workspace\\org.snachat\\target\\drive\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://www.facebook.com/");
		 WebElement user = driver.findElement(By .id("email"));
		 WebElement user1 = driver.findElement(By .id("pass"));
		 WebElement log= driver.findElement(By.xpath("(//button[@value=\"1\"]) "));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		 js.executeScript ("arguments[0].setAttribute('value','selenium')",user,user1);
		 js.executeScript  ("arguments[1].setAttribute('value','12345')",user,user1);
		 js.executeScript ("arguments[2].('value').click()",log);
		 
		 Object execteScript = js .executeScript("return argument[0].getAttribute('value')", user);
		 System.out.println(execteScript);	  
	} 
}
