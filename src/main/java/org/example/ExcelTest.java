package org.example;

import java.io.IOException;
import java.util.ArrayList;

import static org.example.FriendSim.List;

public class ExcelTest {

    public static void main(String[] args) throws IOException {
        String excelPath = "C:\\Users\\Hensoro\\Documents\\Collab-Projects\\Friendship\\src\\main\\Book1.xlsx";// PathName for your excel
        String SheetName ="Sheet1";// Excel sheet name
        ExcelReader excel= new ExcelReader(excelPath, SheetName);



        for (int i = 1; i <=excel.getRowCount()-1 ; i++) {//Adds each excel row into its own student class
            Student s= new Student(excel.getCellData(i,0),excel.getCellData(i,1),excel.getCellData(i,2),excel.getCellData(i,3),excel.getCellData(i,4));
            //feel free to add or remove the amount of movies or change the name of the items
            List.add(s);
        }
         System.out.println(List.get(2).FriendAnnounce());

    }
}
