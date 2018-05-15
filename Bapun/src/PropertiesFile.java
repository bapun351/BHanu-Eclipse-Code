import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PropertiesFile {
	Properties prop;

	@BeforeMethod
	public void loadData() throws IOException {
		prop = new Properties();
		File f = new File(System.getProperty("user.dir") + "\\src\\Bapun.properties");
		FileReader fr = new FileReader(f);
		prop.load(fr);
	}

	public String getData(String data) throws IOException {
		String output = prop.getProperty(data);
		return output;
	}

	@Test
	public void testProperties() throws IOException {
		String name = getData("Name");
		System.out.println(name);
	}
}
