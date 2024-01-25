package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
	}
	
	public static void readPropertiesFile(){
		
		try {
			
			InputStream input = new FileInputStream("C:\\Users\\DeLL\\SeleniumMavenPractiveTest\\src\\main\\java\\Config\\Config.properties");
		    prop.load(input);
		    System.out.println(prop.getProperty("browser"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void writePropertiesFile() {
	
		try {
			
			OutputStream output = new FileOutputStream("C:\\Users\\DeLL\\SeleniumMavenPractiveTest\\src\\main\\java\\Config\\Config.properties");
		    prop.setProperty("browser", "Chrome");
		    prop.store(output,null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
