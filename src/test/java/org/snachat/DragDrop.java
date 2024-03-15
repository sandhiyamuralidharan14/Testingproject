package org.snachat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
public static void main(String[] args) {
	System.setProperty ("webdriver.edge.driver","C:\\Users\\Gksan\\eclipse-workspace\\org.snachat\\target\\drive\\msedgedriver.exe");
	 WebDriver driver = new EdgeDriver();
	 String s = "https://demo.guru99.com/test/drag_drop.html";
	 driver.navigate().to(s);
	 WebElement drag1 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]"));
	 WebElement drop1 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
	 
	 WebElement drag2 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[6]"));
	 WebElement drop2 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[3]"));
	 
	 WebElement drag3 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
	 WebElement drop3 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
	 
	 WebElement drag4 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[8]"));
	 WebElement drop4 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[4]"));
	 
	 Actions a = new Actions(driver);
	 a.dragAndDrop(drag1, drop1).build().perform();		 
	 a.dragAndDrop(drag2, drop2).build().perform();	
	 a.dragAndDrop(drag3, drop3).build().perform();	
	 a.dragAndDrop(drag4, drop4).build().perform();	
}
}
