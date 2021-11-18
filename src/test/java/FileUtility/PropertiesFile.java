package FileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.collections4.Get;

import constant.constant;

public class PropertiesFile {
	/**
	 * This method will open Properties file and vale associatede with key 
	 * @param key
	 * @return value in form String
	 * @throws FileNotFoundException
	 */
	public static String getProperties(String key)  {
	String value =null;
	try {
		constant.file  =new FileInputStream("F:/me/HelloWorld1/src/Rs1/Input/ObjectRepository.properties");
	     constant.properti1 =new Properties ();
			constant.properti1.load(constant.file);
			value=constant.properti1.getProperty(key);
		} catch (IOException e) {
			System.out.println("unabal find propertice file ");
			e.printStackTrace();		
	}
     return value;		
	}
	public static String getProperties(String key ,String filePath) throws FileNotFoundException {
		            String value =null;
		try {
			constant.file  =new FileInputStream(filePath);
			constant.properti1=new Properties ();
			constant.properti1.load(constant.file );
				value=constant.properti1.getProperty(key);
			} catch (IOException e) {
				System.out.println(" file "+filePath+"not found");
				e.printStackTrace();		
		}
	     return value;		
		}
	public static String[] getlocater(String key) {
		String[] value=null;
		try {
			constant.file  =new FileInputStream("F:/me/HelloWorld1/src/Rs1/Input/ObjectRepository.properties");
			constant.properti1=new Properties ();
			constant.properti1.load(constant.file );
			String part=constant.properti1.getProperty(key);
			value =part.split("##");
		} catch (FileNotFoundException e) {
			System.out.println("");
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		  return value;	
	}
	public static void main(String[] args) {
		System.out.println(getlocater("Email")[0]);
		System.out.println(getlocater("Email")[1]);
		System.out.println("****************************************************************");
		System.out.println(getlocater("password")[0]);
		System.out.println(getlocater("password")[1]);
		System.out.println("****************************************************************");
		System.out.println(getlocater("CreateAccount")[0]);
		System.out.println(getlocater("CreateAccount")[1]);
		System.out.println("****************************************************************");
	}
		{
	}
	}

