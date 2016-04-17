package GrpSeleniumPro.ArtSeleniumPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FFTest {

@Test 
public static void test1()
{
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/");
	}

}
