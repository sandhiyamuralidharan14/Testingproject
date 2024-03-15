package org.snachat;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class cls {
public static void main(String[] args) throws Exception {
System.setProperty ("webdriver.edge.driver","C:\\Users\\Gksan\\eclipse-workspace\\org.snachat\\target\\drive\\msedgedriver.exe");
 WebDriver driver = new EdgeDriver();
 driver.get("https://www.facebook.com/");
 driver.navigate().to("https://www.facebook.com/");
 driver.manage().window().maximize();
 driver.navigate().back();
 Thread.sleep(3000);
 driver.navigate().forward();
 driver.navigate().refresh();

 String s = "https://www.facebook.com/";
 driver.navigate().to(s);
		 
// WebElement ref = driver.findElement (By.id("email"));
// Actions a = new Actions(driver);
// a.sendKeys(ref,"sandhiya@gmail.com").build().perform();++*
//// a.doubleClick(ref).build().perform();
//// a.contextClick(ref).build().perform();
   
WebElement user =driver.findElement(By.id("email"));
user.sendKeys("selenium");
Thread.sleep(2000);
user.clear();
Thread.sleep(2000);
user.sendKeys("sandhiya@gmail.com");	

WebElement pass = driver.findElement(By.name("pass"));
pass.sendKeys("");

driver.findElement(By.xpath("//input[contains(@placeholder,\"email add\")]")).sendKeys("sandhiya@gmail.com");
driver.findElement(By.xpath("//a[contains(text(),\"F\")]")).click();


String attribute = user.getAttribute("name");
System.out.println(attribute);

String a = pass.getAttribute("value");//
System.out.println(a);

WebElement ref = driver.findElement(By.linkText("Forgotten password?"));
ref.click();
 WebElement ref1 =driver.findElement(By.partialLinkText("Forgotten password?"));
 ref1.click();

// List<WebElement> log = driver.findElement(By.tagName("a"));
// for(int i =0;i<log.size();i++);
// WebElement text = log.get(i);
// String text2 = text.getText();
// System.out.println(text2);
 
driver.switchTo().newWindow(WindowType.TAB);

String a1=driver.getCurrentUrl();
System.out.println(a1);
if(s.equals(a1)) {
System.out.println("correct");
}
else
{
System.out.println("wrong");
}
String b = driver.getTitle();
System.out.println(b);

driver.close();
driver.quit();	
}
}