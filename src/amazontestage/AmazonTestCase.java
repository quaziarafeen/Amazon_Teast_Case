package amazontestage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestCase {
    final static String AmazonUrl = "https://www.amazon.com";
    static WebDriver driver;

    static String Reward = "#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(5) > div";
    static String StoreCard = "//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[2]/a";
    static String email = "#ap_email";
    static String password = "//*[@id=\"ap_password\"]";
    static String signin = "#signInSubmit";
    static String keep = "//*[@id=\"authportal-main-section\"]/div[2]/div/div/form/div/div/div/div[3]/div[2]/div/label/div/label/span";
    static String business = "//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[3]/a";
    static String corporate = "#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(5) > ul > li:nth-child(4) > a";

    public static void main(String[] args) throws InterruptedException {
        OpenBrowser(AmazonUrl);
        Time();
        JavascriptExecutor Scroll =  (JavascriptExecutor) driver;
        Scroll.executeScript("window.scrollBy(0,4800)");
        driver.findElement(By.cssSelector(Reward));
        Time();
        driver.findElement(By.cssSelector("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(5) > ul > li.nav_first > a")).click();
        Time();
        BackOne();
        Scroll.executeScript("window.scrollBy(0,4800)");
        Time();
        driver.findElement(By.xpath(StoreCard)).click();
        Time();
        emailBox();
        Time();
        keepLogged();
        Time();
        Password();
        Time();
        SignIn();
        Business();
        Apply();
        Corporate();
        Point();
        SearchBox();
        Reload();
        Currency();
        Image();
        Book();
         Movie();
        Music();
        Electronics();
        Kindle();
        Toys();
        Appearel();
        Kitchen();
        Shoes();
        Sports();
        Video();
        Watches();
        Beauty();
        Tools();
        Computer();
        Baby();
        Instrument();
        Cell();
        Gift();
        SearchBar();
        Search();
        BackTop();
        Time();
        driver.close();
        System.out.println("Test Pass");
    }
        public static void OpenBrowser (String url) { System.setProperty("webdriver.chrome.driver" , "BrowserDriver/chromedriver.exe");
        driver = new ChromeDriver();driver.get(url);driver.manage().window().maximize(); }
        public static void Back () throws InterruptedException { Time();BackOne();Time();BackOne(); }
        public static void BackOne () {driver.navigate().back();}
        public static void BackTop () throws InterruptedException {Time();driver.findElement(By.xpath("//*[@id=\"navBackToTop\"]/div/span")).click();}
        public static void Time () throws InterruptedException { Thread.sleep(1000);}
        public static void emailBox ()  { driver.findElement(By.cssSelector(email)).sendKeys("shamseelmail1@ygmail.com"); }
        public static void Password ()  { driver.findElement(By.xpath(password)).sendKeys("Abcd1234"); }
        public static void SignIn () throws InterruptedException { driver.findElement(By.cssSelector(signin)).click();Back(); }
        public static void keepLogged() { driver.findElement(By.xpath(keep)).click(); }
        public static void Business() throws InterruptedException { driver.findElement(By.xpath(business)).click();Time(); }
        public static void Apply() throws InterruptedException { driver.findElement(By.xpath("//*[@id=\"applyBoxLink-announce\"]")).click();Time();emailBox();Password();SignIn();
        BackOne(); }
        public static void Corporate() throws InterruptedException { driver.findElement(By.cssSelector(corporate)).click();Time();BackOne(); }
        public static void Point ()  { driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[5]/a")).click(); }
        public static void SearchBox () throws InterruptedException { driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Amazon Credit Card");
        Time();BackOne(); }
        public static void Reload () throws InterruptedException {
        driver.findElement(By.cssSelector("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(5) > ul > li:nth-child(7) > a")).click();
        Time();BackOne(); }
        public static void Currency () throws InterruptedException {Time();driver.findElement(By.cssSelector("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(5) > ul > li.nav_last > a")).click();
        Time(); }
        public static void Image () {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/h3"));}
        public static void Book () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[1]/a")).click();
        Time();BackOne(); }
        public static void Movie () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[2]/a")).click();
        Time();BackOne(); }
        public static void Music () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[3]/a")).click();
        Time();BackOne(); }
        public static void Electronics () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[4]/a")).click();
        Time();BackOne(); }
        public static void Kindle () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[5]/a")).click();
        Time();BackOne(); }
        public static void Toys () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[6]/a")).click();
        Time();BackOne(); }
        public static void Appearel () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[7]/a")).click();
        Time();BackOne(); }
        public static void Kitchen () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[8]/a")).click();
        Time();BackOne(); }
        public static void Shoes () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[9]/a")).click();
        Time();BackOne(); }
        public static void Sports () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[10]/a")).click();
        Time();BackOne(); }
        public static void Video () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[11]/a")).click();
        Time();BackOne(); }
        public static void Watches () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[12]/a")).click();
        Time();BackOne(); }
        public static void Beauty () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[13]/a")).click();
        Time();BackOne(); }
        public static void Tools () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[14]/a")).click();
        Time();BackOne(); }
        public static void Computer () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[15]/a")).click();
        Time();BackOne(); }
        public static void Baby () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[16]/a")).click();
        Time();BackOne(); }
        public static void Instrument () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[17]/a")).click();
        Time();BackOne(); }
        public static void Cell () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[18]/a")).click();
        Time();BackOne(); }
        public static void Gift () throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[19]/a")).click();
        Time();BackOne();}
        public static void SearchBar() throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Selinium First Test Case Done");
        Time(); }
        public static void Search() throws InterruptedException {driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        Time();Back(); }

}
