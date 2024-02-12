package dropdown.com;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Select {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select myfruits = new Select(fruits);
		System.out.println(myfruits.isMultiple());
		myfruits.selectByIndex(3);
		
		WebElement heros = driver.findElement(By.id("superheros"));
		Select myheros = new Select(heros);
		System.out.println(myheros.isMultiple());
		myheros.selectByIndex(0);
		myheros.selectByValue("ta");
		myheros.selectByVisibleText("Batwoman");
		myheros.deselectByIndex(0);
		myheros.deselectByValue("ta");
		myheros.deselectByVisibleText("Batwoman");
		myheros.selectByIndex(2);
		myheros.selectByIndex(4);
		myheros.deselectAll();
		myheros.selectByVisibleText("Black Panther");	
		myheros.selectByIndex(0);
		WebElement firstSelectedOption = myheros.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\inbaraj\\eclipse-workspace\\Selenium_Demo\\src\\dropdown\\com\\Capture.png");
		FileUtils.copyFile(Source, Dest);
		
		System.out.println("Successfully Completed");
		
		
		
		
		
		
//		List<WebElement> alloptions = myfruits.getOptions();
//		System.out.println(alloptions);
		
		
	}
}
		
		
