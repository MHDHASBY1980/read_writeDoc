/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package read_writeDoc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

/**
 *
 * @author USER
 */
public class readDoc {
    public static void main(String[] args) throws FileNotFoundException {
        File filenya = new File ("D://readDoc.doc");
        WordExtractor extractor = null;
        try{
            FileInputStream fis = new FileInputStream(filenya.getAbsoluteFile());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String fileText = extractor.getText();
            System.out.println(fileText);
        } catch (Exception exep){
            exep.printStackTrace();
        }   
    }
}
