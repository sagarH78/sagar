package resizebrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox {

	public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
  WebDriver driver=new FirefoxDriver();
  Thread.sleep(6000);
  driver.manage().window().maximize();
  Thread.sleep(6000);
  Dimension d=new Dimension(800, 200);
  driver.manage().window().setSize(d);
  Thread.sleep(6000);
  driver.close();
  
 

	}

}
