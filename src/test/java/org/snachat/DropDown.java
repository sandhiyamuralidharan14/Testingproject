package org.snachat;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.edge.driver","C:\\Users\\Gksan\\eclipse-workspace\\org.snachat\\target\\drive\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 String s = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		 driver.navigate().to(s);
		 WebElement drop = driver.findElement(By.xpath("(//select[@id=\"first\"])"));
		 Select a = new Select(drop);
		 a.selectByIndex(2);
		 Thread.sleep(2000);
		 a.selectByValue("Apple");
		 a.selectByVisibleText("Iphone");
		 boolean multiple = a.isMultiple();
		 System.out.println(multiple);
		 
//		 List <WebElement> options = a.getOptions();
//		 for (int i=0;i<options.size();i++);
//		WebElement ref = options.get(i);
//		String text = ref.getText();
//		System.out.println(text);
		 
		WebElement down = driver.findElement(By.xpath("(//select[@id=\"second\"])"));
		Select a1 = new Select (down);
		a1.selectByIndex(0);
		a1.selectByIndex(1);
		a1.selectByIndex(3);
		a1.deselectByIndex(1);
		a1.deselectByIndex(2);
		List<WebElement> a2 = a1.getAllSelectedOptions();
		
		for (int i = 0; i < a2.size(); i++) {
			WebElement webElement = a2.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		
		
		for (WebElement webElement : a2) {
			String text = webElement.getText();
			System.out.println(text);
		}
//		List<WebElement> option = a1.getAllSelectedOptions();
//	for (int i=0;i<option.size();i++);
//	WebElement m =option.get(i); 
//	String text = m.getText();
//	System.out.println(text);
//	WebElement f = a.getFirstSelectedOption();
//	System.out.println(f.getText());
	}
}
