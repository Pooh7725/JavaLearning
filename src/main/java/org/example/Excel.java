package org.example;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Excel {
    //    public static void main(String[] args) throws IOException {
//        ReadSheetData excel = new ReadSheetData();
//        excel.getData("Excel", "TradeData");
//    }
    public static void main(String[] args) throws IOException {
        ReadSheetData excel = new ReadSheetData();
        excel.getData("Excel", "TradeData");
    }

    public static class ReadSheetData {

        /**
         * @MethodName - getData()
         * @Param-Accepts accepts TestcaseName refeering to excel file
         * @Description - Method to get the data based on coloumn name from excel file and store in map
         * @author - Ruchira Deshpande
         */

        public Map<String, String> getData(String testcaseName, String SheetName) throws IOException {
            String path = "C:\\Users\\pooja.saini\\IdeaProjects\\TestNG_CSI2\\src\\ExcelSheet\\TradeData.xlsx";
            FileInputStream fis = new FileInputStream(path);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(SheetName);
            Map<String, String> objMap = new HashMap<String, String>();
            int lastRow = sheet.getLastRowNum();
            System.out.println("the last row = " + lastRow);
            for (int i = 0; i <= lastRow; i++) {
                Row row = sheet.getRow(i);
                Row keyrow = sheet.getRow(0);
                if (row.getCell(0).getStringCellValue().equalsIgnoreCase(testcaseName)) {
                    System.out.println("in if");
                    System.out.println("Last cell no = " + row.getLastCellNum());
                    try {
                        for (int j = 1; j < row.getLastCellNum(); j++) {
                            if (row.getCell(j).getCellType() != CellType.BLANK && row.getCell(j).getCellType() == CellType.STRING) {
                                String value = row.getCell(j).getStringCellValue();
                                System.out.println("value = " + value);
                                String key = keyrow.getCell(j).getStringCellValue();
                                System.out.println("Key = " + key);
                                objMap.put(key, value);

                            } else if (row.getCell(j).getCellType() != CellType.BLANK && row.getCell(j).getCellType() == CellType.NUMERIC) {
                                String value = NumberToTextConverter.toText(row.getCell(j).getNumericCellValue());
                                System.out.println("value = " + value);
                                String key = NumberToTextConverter.toText(keyrow.getCell(j).getNumericCellValue());
                                System.out.println("Key = " + key);
                                objMap.put(key, value);
                            } else if (row.getCell(j).getCellType() == null) {
                                System.out.println("Null Value present");
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            return objMap;
        }
    }
}
