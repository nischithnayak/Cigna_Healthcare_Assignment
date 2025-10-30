

import java.io.*;
import org.apache.poi.xssf.usermodel.*;

public class FileExcelDemo {
    public static void main(String[] args) {
        String inputPath = "input.txt";
        String outputPath = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("TextData");
            int rowNum = 0;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();

                XSSFRow row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(line);
            }

            try (FileOutputStream fos = new FileOutputStream("output.xlsx")) {
                workbook.write(fos);
                workbook.close();
            }

            System.out.println("Text and Excel files created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
