package cn.lmf.creator;

import cn.lmf.ResolveJson;
import cn.lmf.entity.DocEntity;
import cn.lmf.util.DateUtil;
import org.apache.poi.wp.usermodel.HeaderFooterType;
import org.apache.poi.xwpf.usermodel.*;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;

import java.io.*;
import java.math.BigInteger;

public class WordCreator {
    private static CTStyles wordStyles = null;
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
    private static final String HEADING1 = "Heading1";
    private static final String HEADING2 = "Heading2";
    private static final String HEADING3 = "Heading3";
    private static final String HEADING4 = "Heading4";

    private DocEntity docEntity;
    private XWPFDocument document;

    public WordCreator(DocEntity docEntity) {
        this.docEntity = docEntity;
        this.document = new XWPFDocument();
    }

    public void create() throws IOException {
        XWPFStyles styles = document.createStyles();
        styles.setStyles(wordStyles);

        //定义页眉页脚
        createHeaderFooter();
        //首页
        createMainPage();
        //修改历史表
        createChangeHistoryTable();
        //前言
        createForeword();
        //概述
        createOverview();
        //API信息，实现方案
        createApiInfos();

        FileOutputStream out = new FileOutputStream(new File("demoDocument.docx"));
        document.write(out);
        out.close();
    }

    private void createHeaderFooter() {
        XWPFHeader header = document.createHeader(HeaderFooterType.DEFAULT);
        header.createParagraph().insertNewRun(0).setText("中国移动物联网API服务平台需求规格说明书");
        XWPFFooter footer = document.createFooter(HeaderFooterType.DEFAULT);
        //TODO 日期，页码
        XWPFRun footerRun = footer.createParagraph().insertNewRun(0);
        footerRun.setText(DateUtil.getCurrentDate("yyyy-MM-dd") + "         第");
        footerRun.getCTR().addNewPgNum();
        footerRun.setText("页");
    }

    private void createMainPage() {
        XWPFParagraph paragraph = document.createParagraph();
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        paragraph.setSpacingAfterLines(3000);
        XWPFRun run = paragraph.createRun();
        run.setFontFamily("SimSun");
        run.setFontSize(26);
        run.setBold(true);
        run.setText("中移物联网智能连接部");
        run.addBreak();
        run.setText("API服务平台V" + docEntity.getVersion());
        run.addBreak();
        run.setText("全国在网用户数查询");
        run.addBreak();
        run.setText("需求规格说明书");
        run.addCarriageReturn();

        XWPFParagraph tail = document.createParagraph();
        tail.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun tailRun = tail.createRun();
        tailRun.setFontSize(20);
        tailRun.setText("中移物联网有限公司");
        tailRun.addBreak();
        tailRun.setText(DateUtil.getCurrentDate("yyyy-MM"));
        tailRun.addBreak(BreakType.PAGE);
    }

    private void createChangeHistoryTable() {
        XWPFTable tab = document.createTable(5, 4);
        setTableAlign(tab, ParagraphAlignment.CENTER);
//        XWPFNumbering numbering = document.getNumbering();
        tab.setCellMargins(200, 200, 200, 200);
        XWPFTableRow row = tab.getRow(0); // First row
        // Columns
        row.getCell(0).setText("版本号");
        row.getCell(1).setText("修订日期");
        row.getCell(2).setText("修订人");
        row.getCell(3).setText("修订描述");
        for (int i = 0; i < 4; i++) {
            row.getCell(i).setColor("0088FF");
        }

        row = tab.getRow(1); // Second Row
        row.getCell(0).setText(docEntity.getVersion());
        row.getCell(1).setText(DateUtil.getCurrentDate("yyyy/MM/dd"));
        row.getCell(2).setText(docEntity.getAuthor());
//        row = tab.getRow(2); // Third Row
//        row.getCell(0).setText("2.");
//        row.getCell(1).setText("Mohan");
//        row.getCell(2).setText("mohan@gmail.com");
    }

    private void createForeword() {
        //2代表一级标题heading1，以此类推
        createHeading(HEADING1, "前言", 0);
        createHeading(HEADING2, "编写目的", 1);
        createHeading(HEADING2, "名词解释", 1);

    }

    private void createOverview() {
        createHeading(HEADING1, "概述", 0);
    }

    private void createApiInfos() {
        createHeading(HEADING1, "实现方案", 0);
        createHeading(HEADING2, "CMIOT_API35T00-全国在网用户数查询", 1);
        createHeading(HEADING3, "需求来源", 2);
        createText();
        createHeading(HEADING3, "业务说明", 2);
        createText();
    }

    private void createText() {
        XWPFParagraph paragraph = document.createParagraph();
        paragraph.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun run = paragraph.createRun();
        run.setText("北京省公司");
    }

    private void setTableAlign(XWPFTable table, ParagraphAlignment align) {
        CTTblPr tblPr = table.getCTTbl().getTblPr();
        CTJc jc = (tblPr.isSetJc() ? tblPr.getJc() : tblPr.addNewJc());
        STJc.Enum en = STJc.Enum.forInt(align.getValue());
        jc.setVal(en);
    }

    private void createHeading(String style, String content, int level) {
        XWPFParagraph paragraph = document.createParagraph();
        BigInteger numId = getNumId(document);
        paragraph.setNumID(numId);
        CTDecimalNumber ctDecimalNumber = paragraph.getCTP().getPPr().getNumPr().addNewIlvl();
        ctDecimalNumber.setVal(BigInteger.valueOf(level));
        paragraph.setStyle(style);
        paragraph.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun run = paragraph.createRun();
        run.setText(content);
    }

    private BigInteger getNumId(XWPFDocument document) {
        CTAbstractNum cTAbstractNum = CTAbstractNum.Factory.newInstance();
        cTAbstractNum.setAbstractNumId(BigInteger.valueOf(0));

        /*first level*/
        CTLvl cTLvl0 = cTAbstractNum.addNewLvl();               //create the first numbering level
        cTLvl0.setIlvl(BigInteger.ZERO);                        //mark it as the top outline level
        cTLvl0.addNewNumFmt().setVal(STNumberFormat.DECIMAL);   //set the number format
        cTLvl0.addNewLvlText().setVal("%1.");                   //set the adornment; %1 is the first-level number or letter as set by number format
        cTLvl0.addNewStart().setVal(BigInteger.ONE);            //set the starting number (here, index from 1)
//        cTLvl0.addNewSuff().setVal(STLevelSuffix.SPACE);        //set space between number and text

        /*second level*/
        CTLvl cTLvl1 = cTAbstractNum.addNewLvl();               //create another numbering level
        cTLvl1.setIlvl(BigInteger.ONE);                         //specify that it's the first indent
//        CTInd ctInd = cTLvl1.addNewPPr().addNewInd();           //add an indent
//        ctInd.setLeft(inchesToTwips(.5));                       //set a half-inch indent
        cTLvl1.addNewNumFmt().setVal(STNumberFormat.DECIMAL);   //the rest is fairly similar
        cTLvl1.addNewLvlText().setVal("%1.%2.");                //setup to get 1.1, 1.2, ect.
        cTLvl1.addNewStart().setVal(BigInteger.ONE);
//        cTLvl1.addNewSuff().setVal(STLevelSuffix.SPACE);

        /*thrid level*/
        CTLvl cTLvl2 = cTAbstractNum.addNewLvl();               //create another numbering level
        cTLvl2.setIlvl(BigInteger.valueOf(2));                         //specify that it's the first indent
//        CTInd ctInd2 = cTLvl2.addNewPPr().addNewInd();           //add an indent
//        ctInd.setLeft(inchesToTwips(.5));                       //set a half-inch indent
        cTLvl2.addNewNumFmt().setVal(STNumberFormat.DECIMAL);   //the rest is fairly similar
        cTLvl2.addNewLvlText().setVal("%1.%2.%3.");                //setup to get 1.1.1, 1.2.1, ect.
        cTLvl2.addNewStart().setVal(BigInteger.valueOf(2));

        /*associate the numbering scheme with the document's numbering*/
        XWPFAbstractNum abstractNum = new XWPFAbstractNum(cTAbstractNum);
        XWPFNumbering numbering = document.createNumbering();
        BigInteger abstractNumID = numbering.addAbstractNum(abstractNum);
        return numbering.addNum(abstractNumID);
    }

}
