package amazontestage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestCase {
    final static String AmazonUrl = "https://www.amazon.com";
    static WebDriver driver;

    static  String Reward = "#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(5) > div";
    static  String StoreCard = "//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[2]/a";
    static String email = "#ap_email";
    static String password = "//*[@id=\"ap_password\"]";
    static String signin = "#signInSubmit";
    static String keep = "//*[@id=\"authportal-main-section\"]/div[2]/div/div/form/div/div/div/div[3]/div[2]/div/label/div/label/span";
    static String business = "//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[3]/a";
    static String corporate = "#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(5) > ul > li:nth-child(4) > a";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";
//    static String signin = "#signInSubmit";


    public static void main(String[] args) throws InterruptedException {
        OpenBrowser(AmazonUrl);
        Thread.sleep(800);
        JavascriptExecutor Scroll =  (JavascriptExecutor) driver;
        Scroll.executeScript("window.scrollBy(0,4800)");
        driver.findElement(By.cssSelector(Reward));
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(5) > ul > li.nav_first > a")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        Scroll.executeScript("window.scrollBy(0,4800)");
        driver.findElement(By.xpath(StoreCard)).click();
        Thread.sleep(1000);
        emailBox();
        Thread.sleep(1000);
        keepLogged();
        Thread.sleep(1000);
        Password();
        Thread.sleep(800);
        SignIn();
        Business();
        Apply();
        Corporate();
        Point();
        SearchBox();
        driver.close();
    }
    public static void OpenBrowser (String url) {
        System.setProperty("webdriver.chrome.driver" , "BrowserDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }
    public static void Back () throws InterruptedException {
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
    }
    public static void emailBox ()  {
        driver.findElement(By.cssSelector(email)).sendKeys("shamseelmail1@ygmail.com");
    }
    public static void Password ()  {
        driver.findElement(By.xpath(password)).sendKeys("Au,200611446");
    }
    public static void SignIn () throws InterruptedException {
        driver.findElement(By.cssSelector(signin)).click();
       Back();
    }
    public static void keepLogged() {
        driver.findElement(By.xpath(keep)).click();
    }
    public static void Business() throws InterruptedException {
        driver.findElement(By.xpath(business)).click();
        Thread.sleep(1000);
    }
    public static void Apply() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"applyBoxLink-announce\"]")).click();
        Thread.sleep(1000);
        emailBox();
        Password();
        SignIn();
        driver.navigate().back();

    }
    public static void Corporate() throws InterruptedException {
        driver.findElement(By.cssSelector(corporate)).click();
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        Thread.sleep(1000);
        driver.navigate().back();


    }
    public static void Point ()  {
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[5]/a")).click();
    }
    public static void SearchBox () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Amazon Credit Card");
        Thread.sleep(1000);
        driver.navigate().back();
    }
}
