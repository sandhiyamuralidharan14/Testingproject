package org.snachat;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsHandling {
public static void main (String[]args) {
	System.setProperty ("webdriver.edge.driver","C:\\Users\\Gksan\\eclipse-workspace\\org.snachat\\target\\drive\\msedgedriver.exe");
	 WebDriver driver = new EdgeDriver();
	 driver.navigate().to("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("dog",Keys.ENTER);
     driver.findElement(By .xpath("//img[@loading=\"eager\"]")).click();
     String parent = driver.getWindowHandle();
     Set <String> child = driver.getWindowHandles();
     for (String x:child) {
    	 if(!parent.equals(x)) {
    		 driver.switchTo().window(x);
    		 String text = driver.findElement(By.xpath("(//span[text()=\"SENAPATI Combo Dog Harness Belts Neck and Rope Set (Waterproof, Medium, Leash Dog Collar & Leash\"])")).getText();
    		 System.out.println(text);
    	 }
     }
     Set<String> child1=driver.getWindowHandles();
     List<String>child11=new ArrayList<String>(child1);
     driver.switchTo().window(child11.get(2));
     driver.switchTo().window(parent);
}
}
