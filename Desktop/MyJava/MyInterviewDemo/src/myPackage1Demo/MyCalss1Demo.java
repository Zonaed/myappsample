package myPackage1Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MyCalss1Demo {

	 //static By tenthList=By.xpath("//ul/li/ul/li/a/span[contains(text(),'10')]/../span[2]");
	 //static By tenthList=By.xpath("//ul/li/ul/li/a/span[2]");
       static By tenthList=By.xpath("//ul/li/ul/li/a/span[contains(text(), '6')]/../span[2]");
	//static by fthList=By.xpath("//ul/li/ul/li/a/span[2]");

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello Java Selenium Project");
		
		//System.setProperty("webDriver.chrome.driver","C:\\Users\\MD ZONAED BHUIYAN\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		//driver.get("https://wordpress.com/log-in");
		//driver.get("https://en.wikipedia.org/wiki/Salman_Khan");
		driver.get("https://en.wikipedia.org/wiki/Aamir_Khan");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		List<WebElement> list=driver.findElements(tenthList);
		for(WebElement element: list) {
			System.out.println(element.getText().trim());
		}

//		driver.get("https://en.wikipedia.org/wiki/Wikipedia:File_Upload_Wizard");
//		   (//*[@id="See_also"]//following::ul)[3]/li/a
		
		

	}

}
