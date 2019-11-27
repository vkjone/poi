package cn.lmf;

import cn.lmf.entity.ErrorCodeMetadata;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class ExcelErrorCodeHandler extends ErrorCodeHandler {

    private static List<ErrorCodeMetadata> get() {
        try {
            FileInputStream in = new FileInputStream(new File("resources/errorCodes.xlsx"));
            Workbook workbook = new XSSFWorkbook(in);
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                System.out.println(row.getRowNum());
                System.out.println(row.getRowStyle());
            }
        } catch (IOException e) {

        } finally {

        }
        return null;
    }

    public static void add() {
        List<ErrorCodeMetadata> list = get();
    }
}
