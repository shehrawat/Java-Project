package QRCodeGenerator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGenerator 
{

	public static void main(String[] args) throws Exception 
	{
		String details = "Ajay Singh - QA Engineer : Hestabit Technolgies";
		
		ByteArrayOutputStream out  = QRCode.from(details).to(ImageType.JPG).stream();
		
		File f = new File("D:\\All Jar Files\\QRGenerator jar\\QR code\\MyCompany.jpg");
		FileOutputStream fos = new FileOutputStream(f);
		
		fos.write(out.toByteArray());
		fos.flush();
	}

}
