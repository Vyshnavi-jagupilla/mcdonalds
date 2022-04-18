package Browser;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;



public class Url {
public static WebDriver driver;

public static void setDriver()
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
}
public static void getUrl(String string)
{
driver.get(string);
}
public static void closeBrowser() {
try {
driver.quit();
}
catch(Exception e) {
System.out.println("Browser not closing");
}
}
}

