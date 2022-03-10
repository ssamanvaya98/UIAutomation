import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromExcel {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/soumyasamanvaya/Documents/Book1.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheetAt(0);
//        String cellValue = sheet.getRow(0).getCell(0).getStringCellValue();
//        String cellValue2 = sheet.getRow(0).getCell(1).getStringCellValue();
//
//        System.out.println(cellValue+" "+cellValue2);
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();


        for(int i=0;i<=rowCount;i++){

            //get cell count in a row
            int cellcount=sheet.getRow(i).getLastCellNum();

            //iterate over each cell to print its value
            System.out.println("Row"+ i+" data is :");

            for(int j=0;j<cellcount;j++){
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
            }
            System.out.println();
        }

    }
}
