package package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class day1
{
	@Test
	public void login() throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\Karthi Test\\eclipse-workspace-james\\james\\src\\package1\\datadriven.properties");

				prop.load(fis);
	
				System.out.println(prop.getProperty("username"));
				if (prop.getProperty("broswer").contains("chrome"))
				{
					System.setProperty(arg0, arg1)
					WebDriver driver = new ChromeDriver();
				}
				else if (prop.getProperty("broswer").contains("firefox"))
				Webdriver driver = new Chromedriver();
				

}
}