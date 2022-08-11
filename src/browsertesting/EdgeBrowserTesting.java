package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTesting {
    public static void main(String[] args) {
        EdgeBrowserTesting t = new EdgeBrowserTesting();
        t.edgeTest();
    }

    public void edgeTest(){

       String baseUrl = "https://demo.nopcommerce.com/";

       System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");//Setting WEbDrive
        WebDriver driver = new EdgeDriver(); //Ceating object of driver
        driver.get(baseUrl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        //driver.close();
    }


}
