package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {

	static String project_Path;
	static XSSFWorkbook workBook;
	static XSSFSheet sheet;


	public ExcelUtils(String excelPath, String SheetName)
	{
		try
		{
			workBook = new XSSFWorkbook(excelPath);			
			sheet = workBook.getSheet(SheetName);	
		} 
		catch (Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

	public static int getRowCount()
	{
		int rowCount=0;
		try
		{
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Total number of rows :" +rowCount);
		} 
		catch (Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;

	}
	public static int getColCount()
	{
		int colCount=0;
		try
		{
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Total number of rows :" +colCount);
		} 
		catch (Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCount;

	}
	public static String getCellData(int rowNum , int colNum)
	{
		String cellData= null;

		try {
			cellData= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println( "Cell data is :"+ cellData);
		} 
		catch (Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}		

		return cellData;
	}

}
