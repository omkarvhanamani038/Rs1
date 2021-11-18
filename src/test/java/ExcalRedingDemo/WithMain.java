package ExcalRedingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WithMain {

	public static void main(String[] args) throws Exception {
	File file1 = new File("C:\\Users\\Administrator\\Desktop\\test1.xlsx");
	FileInputStream fis=new FileInputStream(file1);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	Sheet sheet1=wb.getSheetAt(0);
for(int i=0;i<4;i++) {
	String data1= sheet1.getRow(i).getCell(0).getStringCellValue();
	String data= sheet1.getRow(i).getCell(1).getStringCellValue();
	System.out.println(data1 +"  " + data);	
}	
	}}

