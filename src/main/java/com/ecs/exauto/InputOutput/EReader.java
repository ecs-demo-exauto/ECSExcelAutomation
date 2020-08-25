package com.ecs.exauto.InputOutput;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.Iterator;

public class EReader {

    private static String filePath = System.getProperty("user.dir");
    private static String fileName = "/04-013-RMCR_Stage_Transformation_Formula.xlsx";


    public static void excelReader()
    {
        try {
            FileInputStream file1 = new FileInputStream(filePath+fileName);
//
            XSSFWorkbook workbook1 = new XSSFWorkbook(file1);
            Sheet datatypeSheet = workbook1.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();

        }
        catch (Exception e)
        {
            System.out.println("Exception in EReader class !!! and method is excel Reader");
            e.printStackTrace();
        }
    }

}
