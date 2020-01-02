package cn.lmf;

import cn.lmf.entity.ErrorCodeMetadata;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelErrorCodeHandler extends ErrorCodeHandler {

    private static List<ErrorCodeMetadata> get() {
        try {
            FileInputStream in = new FileInputStream(new File("src/main/resources/errorCodes.xlsx"));
            Workbook workbook = new XSSFWorkbook(in);
            List<ErrorCodeMetadata> metadataList = new ArrayList<>();
            Sheet sheet = workbook.getSheetAt(0);
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                ErrorCodeMetadata metadata = new ErrorCodeMetadata();
                metadata.setErrorCode(row.getCell(0).getStringCellValue());
                metadata.setMsg(row.getCell(1).getStringCellValue());
                metadata.setDesc(row.getCell(2).getStringCellValue());
                metadata.setCcmpErrorCode(row.getCell(3).getStringCellValue());
                metadata.setErrorCodeType(row.getCell(4).getStringCellValue());
                metadataList.add(metadata);

            }
            addCode(metadataList);

        } catch (IOException e) {

        } finally {

        }
        return null;
    }

    public static void add() {
        List<ErrorCodeMetadata> list = get();
    }

    public static void addCode(List<ErrorCodeMetadata> metadataList) throws IOException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("D:\\IotProjects\\poi\\src\\main\\resources\\CCErrorCode.java");
            fileWriter.write("public enum CCErrorCode { " + "\n");
            fileWriter.write("\t" + "SUCCESS(\"0\", \"正确\", \"正确\")," + "\n");
            for (ErrorCodeMetadata metadata : metadataList) {
                fileWriter.write("\t" + "ERR" + metadata.getErrorCode() + "(\"" + metadata.getErrorCode() + "\", \"" + metadata.getMsg() + "\", \"" + metadata.getDesc() + "\")," + "\n");
            }
            fileWriter.write("\n" +
                    "    /**\n" +
                    "     * 错误码\n" +
                    "     */\n" +
                    "    private String code;\n" +
                    "    /**\n" +
                    "     * 错误描述\n" +
                    "     */\n" +
                    "    private String msg;\n" +
                    "\n" +
                    "    /**\n" +
                    "     * 描述\n" +
                    "     * V5详细解释\n" +
                    "     * 主要用于内部错误信息描述\n" +
                    "     */\n" +
                    "    private String description;\n" +
                    "\n" +
                    "    CCErrorCode(String code, String msg, String description) {\n" +
                    "        this.code = code;\n" +
                    "        this.msg = msg;\n" +
                    "        this.description = description;\n" +
                    "    }\n" +
                    "\n" +
                    "    public String getCode() {\n" +
                    "        return code;\n" +
                    "    }\n" +
                    "\n" +
                    "    public String getMsg() {\n" +
                    "        return msg;\n" +
                    "    }\n" +
                    "\n" +
                    "    public String getDescription() {\n" +
                    "        return description;\n" +
                    "    }\n" +
                    "\n" +
                    "    public void setCode(String code) { this.code = code; }\n" +
                    "\n" +
                    "    public void setMsg(String msg) { this.msg = msg; }\n" +
                    "\n" +
                    "    public void setDescription(String description) { this.description = description; }\n" +
                    "}\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileWriter.close();
        }
    }
}
