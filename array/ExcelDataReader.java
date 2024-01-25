/* package array;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	public static void main(String[] args) {
		
		  public void readData() throws IOException {
			  File excelFile = new File("./src/test/resources/LoginTestData.xlsx");
			  FileInputStream fis = new FileInputStream(excelFile);
			  XSSFWorkbook workbook = new XSSFWorkbook(fis);
			  XSSFSheet sheet = workbook.getSheet("Sheet1");
			  int noOfRows = sheet.getPhysicalNumberOfRows();
			  int noOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
			  
			  Object data[][] = new Object[noOfRows-1][noOfColumns];
			  
			  for(int i=0; i<noOfRows-1; i++) {
				  for(int j=0; j<noOfColumns; j++) {
					  DataFormatter df = new DataFormatter();
					  data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
				  }
			  }
			  workbook.close();
			  
			  for(Object[] dataArr : data) {
				  System.out.println(Arrays.toString(dataArr));
			  }
		  }
		  

	} */


