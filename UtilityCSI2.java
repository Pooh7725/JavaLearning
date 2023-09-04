package CSI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class UtilityCSI2 {
    public static ArrayList<Integer> LoadData(String excelPath) throws IOException, InterruptedException {
//        String ExcelData = "C:\\Users\\pooja.saini\\IdeaProjects\\TestNG_CSI2\\src\\ExcelSheet\\TradeData.xlsx";
        FileInputStream Input = new FileInputStream(excelPath);
        XSSFWorkbook wb = new XSSFWorkbook(Input);
//        System.out.println(wb.getActiveSheetIndex());
        XSSFSheet sheet = wb.getSheetAt(0);
        //for loop to read rows and cell data
//        System.out.println("no. of rows = " + sheet.getLastRowNum());
        int rows = sheet.getLastRowNum();
        ArrayList<Integer> results = new ArrayList<>();
        System.out.println("no. of rows = " + rows);
        for (int r = 1; r < rows; r++) {
            XSSFRow Row = sheet.getRow(r);
            XSSFCell Cell = Row.getCell(0);
            Integer tradeNumber = (int) Cell.getNumericCellValue();
            System.out.println(tradeNumber);
            results.add(tradeNumber);
            System.out.println(results);
        }
        return results;
    }
}
