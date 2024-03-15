package org.snachat;


import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {
public static void main(String[] args) {
	 WebDriver driver = new EdgeDriver();
	driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
List < WebElement > table = driver.findElement(By.tagName("table"));
   
    for(int i=0;i<table.size();i++) {
    	WebElement ttable = table.get(i);
    	WebElement tbody =ttable.findElement(By.tagName("tbody"));
    }
    }
}
