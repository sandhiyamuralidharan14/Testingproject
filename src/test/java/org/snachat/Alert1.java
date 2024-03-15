package org.snachat;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty ("webdriver.edge.driver","C:\\Users\\Gksan\\eclipse-workspace\\org.snachat\\target\\drive\\msedgedriver.exe");
	 WebDriver driver = new EdgeDriver();
	 String s = "https://demo.automationtesting.in/Alerts.html";
	 driver.navigate().to(s);
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("(//button[@class=\"btn btn-danger\"])")).click();
	 Alert a = driver.switchTo().alert();
	 a.accept();
	 driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[1]")).click();
	 driver.findElement(By.xpath("(//button[@class=\"btn btn-danger\"])")).click();
	 Thread.sleep(2000);
	 a.dismiss();
	 
	 driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();
	 driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])")).click();
	 Thread.sleep(2000);
	 a.dismiss();
	 
	 driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[3]")).click();
	 driver.findElement(By.xpath("(//button[@class=\"btn btn-info\"])")).click();
	 
String text = a.getText();
System.out.println(text);
Thread.sleep(2000);
a.sendKeys("sandhiya");
a.accept();

}
}
