package MavenSeleniumCrmFramework.MavenSeleniumCrmFramework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbcTest {
public static void main(String[] args)
{
	{
		WebDriver driver=new FirefoxDriver(); 
		driver.get("localhost:8888");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* scroll browser using javascript*/
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		System.out.println("scrolling : PASS");
		
		/*enter username*/
		js.executeScript("document.getElementById('user_name')");
		/*enter password*/
		js.executeScript("document.getElementById('user_password')");
		/*click on login*/
		js.executeScript("document.getElementById('submitButton').click()");	
		
	}
}}

