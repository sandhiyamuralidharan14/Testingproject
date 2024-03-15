package org.snachat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframe {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Gksan\\eclipse-workspace\\org.snachat\\target\\drive\\msedgedriver.exe");
	 WebDriver driver = new EdgeDriver();
	 driver.get("https://demo.guru99.com/test/guru99home/");
	 driver.findElement(By.xpath("(//input[@type=\"text\"])")).sendKeys("sandhiya2GMAIL.COM");
	 Thread.sleep(2000);
	
	 WebElement frame = driver.findElement(By.xpath("(//iframe[@id=\"a077aa5e\"])"));
	 frame.click();
	 driver.switchTo().frame(frame);
			 driver.findElement(By.xpath("(//src[@src=\"Jmeter720.png\"\"])")).click();
//	 driver.switchTo().frame("a077aa5e");
	
			 
List < WebElement > frames = driver.findElements(By.tagName("iframe"));
  System.out.println(frames.size());
  for (int a=0;a<frames.size();a++) {
  try {
	  driver.switchTo().frame(a);
	  driver.findElement(By.xpath("(\"(//src[@src=\\\"Jmeter720.png\\\"\\\"])"));
  }catch(Exception c) {
	  System.out.println("Image is not match");
	  driver.switchTo().parentFrame();
  }
	
}
}
}