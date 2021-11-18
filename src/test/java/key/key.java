package key;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import constant.constant;
public class key {

public static void openBrowers(String browersName  ) {
		switch (browersName) {	
            case"Chrome":
			WebDriverManager.chromedriver().setup();
			constant.driver = new ChromeDriver();
			break;
 }}
public static void openUrl(String  url ) {
			constant.driver.get(url);
 }
public static WebElement  getWebelement(String  locaterType,String locaterValue ) {
			WebElement element=null;
			switch(locaterType) {
			case"Xpath":
			     element =	constant.driver.findElement(By.xpath(locaterValue));
				break;
			case"CSS":
				element =	constant.driver.findElement(By.cssSelector(locaterValue));
				break;
			case"Class":
				element =	constant.driver.findElement(By.className(locaterValue));
				break;
			case"ID":
				element =	constant.driver.findElement(By.id(locaterValue));
				break;
				default:
					System.err.println("invalid locater");
			}
			return element;
		}
public static void entertext(String  locaterType,String locaterValue,String totext) {
	getWebelement(locaterType,locaterValue).sendKeys(totext);
}
public static void clickOn(String  locaterType, String locaterValue)  {
	getWebelement(locaterType,locaterValue).click();
}
    
public static void DropDown(String  locaterType, String locaterValue,String totext)  {	 
	WebElement ele= getWebelement(locaterType,locaterValue);
        Select select = new Select(ele);
        select.selectByVisibleText(totext);
}
}