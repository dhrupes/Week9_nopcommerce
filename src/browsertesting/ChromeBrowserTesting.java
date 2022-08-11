package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTesting {
    public static void main(String[] args) {
        ChromeBrowserTesting c = new ChromeBrowserTesting();
        c.chromeTest();
    }

    public  void chromeTest() {
        String baseUrl="https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");//setting wedriver
         WebDriver driver = new ChromeDriver();//creATING OBJECT OF chrome driver
         driver.get(baseUrl);
         driver.manage().window().maximize();
         String title=driver.getTitle();
        System.out.println(title);

         // driver.close();


    }



}
