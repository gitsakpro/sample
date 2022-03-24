package tests;

import org.testng.annotations.Test;

import ExcelUtil.Xls_Reader;

public class ExcelRead {
	

	@Test
	public void testExcelReading() {

		Xls_Reader reader=new Xls_Reader("src/test/resources/testdata/NewExcel.xlsx");
		String sheetName="Sheet1";

		String data=reader.getCellData(sheetName, 0, 2);
		System.out.println(data);

        int rowCount=reader.getRowCount(sheetName);
        System.out.println("total rows: "+rowCount);
	
        
       if(!reader.isSheetExist("registation"));
       {
    	   reader.addSheet("registration");
       }


	}

}
