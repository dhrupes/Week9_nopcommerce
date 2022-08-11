package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FireFoxTesting {
    public static void main(String[] args) {
        FireFoxTesting d = new FireFoxTesting();
        d.firefoxtest();
    }

    public void firefoxtest(){
        String baseurl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");//Setting web browser
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
       // driver.close();


    }

}
