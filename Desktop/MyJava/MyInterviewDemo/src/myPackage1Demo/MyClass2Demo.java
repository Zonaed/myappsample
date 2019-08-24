package myPackage1Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass2Demo {
	
	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Aamir_Khan");
		
		List <WebElement> list = driver.findElements(By.xpath("//ul/li/ul/li/a/span[contains(text(),'2.')]/../span[2]"));
		for(WebElement element : list) {
			
			System.out.println(element.getText().trim());
		}
		
		
		
		

	}

}
