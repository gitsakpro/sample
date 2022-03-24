package tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class CreateExcel {
  @Test
  public void workBookCreation() {
	  XSSFWorkbook workbook= new XSSFWorkbook();
	  XSSFSheet sheet1=workbook.createSheet("Sheet1");
	  try {
	  FileOutputStream out= new FileOutputStream(new File("src/test/resources/testdata/NewExcel.xlsx"));
	  
		workbook.write(out);
		out.close();
	  } catch (FileNotFoundException e) {
		  e.printStackTrace();
	  
	 } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	  
  }

}
