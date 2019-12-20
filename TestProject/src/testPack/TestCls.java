package testPack;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.*;

public class TestCls {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selen\\Jars\\geckodriver0.26.0.exe");
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("rajeshkrishnan.m@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//driver.findElement(By.id("yDmH0d")).sendKeys("rajragram8");
		//driver.findElement(By.className("CwaK9")).click();		

	}

}
