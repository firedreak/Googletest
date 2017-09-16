package googletest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest 
{
	@Test
	public static void googletest() throws IOException, InterruptedException
	{
		WebDriver wb = new FirefoxDriver();
		wb.manage().window().maximize();
		wb.get("https://www.google.com");
		WebElement e = wb.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div[2]"));
		e.sendKeys("abc");
		e.submit();
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot) wb).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\Java workspace\\Googletest\\Screenshots\\Google.jpeg"));

	}
	
	
}
