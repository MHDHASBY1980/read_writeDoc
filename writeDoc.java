/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package read_writeDoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author hasby
 */
public class writeDoc {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Properties proper = new Properties();
        proper.setProperty("log4j.rootLogger", "WARN");

        String teks = "Aku siapa ?? Aku dimana ??"
                + "Mereka Kemana ?? dan Mau apa ??";
        String outDoc = "D://dimana.doc";

        XWPFDocument document = new XWPFDocument();
        try ( FileOutputStream out = new FileOutputStream(new File(outDoc))) {
            XWPFParagraph paragraf = document.createParagraph();
            XWPFRun run = paragraf.createRun();
            run.setText(teks);
            document.write(out);
        }
        System.out.println("Membuat Sukses !");

    }
}