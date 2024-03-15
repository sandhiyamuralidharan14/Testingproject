package org.snachat;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenShot {
public static void main(String[] args) throws IOException {
	System.setProperty ("webdriver.edge.driver","C:\\Users\\Gksan\\eclipse-workspace\\org.snachat\\target\\drive\\msedgedriver.exe");
	 WebDriver driver = new EdgeDriver();
	 driver.navigate().to("https://www.amazon.in/");
	 TakesScreenshot a = (TakesScreenshot)driver;
	 File src = a.getScreenshotAs(OutputType.FILE);
	 File des = new File("C:\\Users\\Gksan\\eclipse-workspace\\org.snachat\\target\\sandhiya.jpg");
	 FileUtils.copyFile(src, des);
	 }
}
