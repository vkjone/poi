package cn.lmf;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WordMain {
    public static void main(String[] args) throws IOException {
        XWPFDocument document = new XWPFDocument();
        FileOutputStream out = new FileOutputStream(new File("demoDocument.docx"));
        document.write(out);
        out.close();
        System.out.println("success");
    }

}
