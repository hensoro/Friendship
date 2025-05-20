package org.example;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.LinkedList;

import static org.example.FriendSim.List;

public class ExcelTest {

    public static void main(String[] args) throws IOException {
        String excelPath = "C:\\Users\\Hensoro\\IdeaProjects\\Friendship\\src\\main\\Book1.xlsx";// PathName for your excel
        String SheetName ="Sheet1";// Excel sheet name
        ExcelReader excel= new ExcelReader(excelPath, SheetName);

        System.out.println(excel.getRowCount());
        for (int i = 1; i <=excel.getRowCount()-1 ; i++) {//Adds each excel row into its own student class
            Student s= new Student(excel.getCellData(i,0),excel.getCellData(i,1),excel.getCellData(i,2),excel.getCellData(i,3),excel.getCellData(i,4));
            List.add(s);
        }
         System.out.println(FriendSim.FindSim());
       /* System.out.println(List.get(1).display());
        System.out.println(List.get(2).display()); */
    }
}
