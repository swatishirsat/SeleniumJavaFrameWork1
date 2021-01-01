package utils;

public class ExcelUtilsDemo {
	public static void main(String[] args) {
		String project_Path = System.getProperty("user.dir");
		
		ExcelUtils excel= new ExcelUtils(project_Path+"//Excel//data1.xlsx", "Sheet1");
		excel.getCellData(0, 1);
		excel.getRowCount();
		excel.getColCount();
	}

}
