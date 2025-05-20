package org.example;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelReader { //This API will read excel inputs
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    public ExcelReader(String excelPath,String SheetName ){
        try{ workbook= new XSSFWorkbook(excelPath);
         sheet = workbook.getSheet(SheetName);
        }
        catch (Exception e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static String getCellData(int rowNum, int ColNum) throws IOException {// Returns the value of the specified cell cordinate
        DataFormatter formatter= new DataFormatter();
        String value = sheet.getRow(rowNum).getCell(ColNum).getStringCellValue();
        return value;
    }

    static int getRowCount() { //Counts the row size
        int RowCount = sheet.getPhysicalNumberOfRows();
        return RowCount;
    }
    static int getCol(int rowNum){// counts the col size of specified row
        int ColCount = sheet.getRow(rowNum).getPhysicalNumberOfCells();
        return ColCount;
    }


}