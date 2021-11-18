package Regression;
import org.testng.annotations.Test;

import FileUtility.PropertiesFile;
import constant.constant;
import key.key;
public class Regression {
	@Test
public void tc_01() throws Exception {
		key.openBrowers("Chrome");
		
		key.openUrl("https://www.facebook.com/");
		
		key.entertext(PropertiesFile.getlocater("Email")[0],PropertiesFile.getlocater("Email")[1], "omkarvhanamani");
	  
		key.entertext(PropertiesFile.getlocater("password")[0],PropertiesFile.getlocater("password")[1],"123456789");
		       Thread.sleep(5000);
		key.clickOn(PropertiesFile.getlocater("CreateAccount")[0],PropertiesFile.getlocater("CreateAccount")[1]);
			   Thread.sleep(20000);
        key.DropDown(PropertiesFile.getlocater("Day")[0],PropertiesFile.getlocater("Day")[1], "4");
        Thread.sleep(2000);
        key.DropDown(PropertiesFile.getlocater("Month")[0],PropertiesFile.getlocater("Month")[1], "Mar");
        Thread.sleep(2000);
        key.DropDown(PropertiesFile.getlocater("Year")[0],PropertiesFile.getlocater("Year")[1], "1993");
      }
}

