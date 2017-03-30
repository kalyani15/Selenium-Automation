package org.DDT;


import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelLib {

	Workbook wrkbook = null;
	Sheet sheet = null;
	
	public ExcelLib(String path){
	try{
		wrkbook = Workbook.getWorkbook(new File(path));
	}
	catch (IOException e){
		e.printStackTrace();
	}
	catch (BiffException e){
		e.printStackTrace();
	}
	
	}
	
	public String GetCellValue(int colValue, int rowValue){
		
		wrkbook.getSheet(0).getCell(colValue, rowValue).getContents();
		return null;
		
	}
}
