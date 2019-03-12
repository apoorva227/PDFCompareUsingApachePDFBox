import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Test;

public class PDFCompareTest {
	@Test
	public  void CompareTest() throws IOException {
		// TODO Auto-generated method stub
		
		URL url = new URL("http://www.africau.edu/images/default/sample.pdf");
		InputStream is = url.openStream();
		BufferedInputStream fileparse = new BufferedInputStream(is);
		PDDocument doc = null;
		
		doc = PDDocument.load(fileparse);
		
		String s =new PDFTextStripper().getText(doc);
		
		URL url2 = new URL("http://www.africau.edu/images/default/sample.pdf");
		InputStream is2 = url.openStream();
		BufferedInputStream fileparse2 = new BufferedInputStream(is2);
		PDDocument doc2 = null;
		
		doc2 = PDDocument.load(fileparse2);
		
		String s2 =new PDFTextStripper().getText(doc2);
		
		System.out.println(s.equals(s2));
		
	}

}
