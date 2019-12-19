package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class data {
public static String getdata(String path,String sheet,int row,int coloumn)
{ String data=null;
	try {
		FileInputStream f= new FileInputStream(path);
		Workbook book= WorkbookFactory.create(f);
	 data = book.getSheet(sheet).getRow(row).getCell(coloumn).getStringCellValue();
	} 
	catch (Throwable e) {
	}
	return data;
}
}
