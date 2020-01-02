package cn.lmf;

import org.apache.poi.xwpf.usermodel.*;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles;

import java.io.*;

public class WordMain {
    /**
     * word整体样式
     */
    private static CTStyles wordStyles = null;

    /**
     * Word整体样式
     */
    static {
        XWPFDocument template;
        try {
            // 读取模板文档
            template = new XWPFDocument(new FileInputStream("D:/template.docx"));
            // 获得模板文档的整体样式
            wordStyles = template.getStyle();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        XWPFDocument document = new XWPFDocument();
        XWPFStyles styles = document.createStyles();
        styles.setStyles(wordStyles);
        FileOutputStream out = new FileOutputStream(new File("demoDocument.docx"));
        createMainPage(document);

        XWPFParagraph paragraph = document.createParagraph();
        paragraph.setStyle("3");
        XWPFRun run = paragraph.createRun();
        run.setText("hello!");
        document.write(out);
        out.close();
        System.out.println("success");
    }

    public static void createMainPage(XWPFDocument document){
        XWPFParagraph paragraph = document.createParagraph();
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun run = paragraph.createRun();
        run.setFontSize(30);
        run.setText("中移物联网智能连接部\r\n");
        run.setText("API服务平台V5.2.1\r\n");
        run.setText("全国在网用户数查询\r\n");
    }

}
