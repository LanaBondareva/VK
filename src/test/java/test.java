
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

class SeleniumTest {
    @Test
    public void firstTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver2.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vk.com");

        driver.findElement(By.id("index_email")).sendKeys("логин_от_вконтакте");
        driver.findElement(By.id("index_pass")).sendKeys("пароль_от_вконтакте ");
        driver.findElement(By.id("index_login_button")).click();

        Thread.sleep(5000);

        this.takeSnapShot(driver, "D://test.png");
       ///////////// driver.quit();
    }

    private void takeSnapShot(WebDriver driver, String s) {
    }

    @Test
    public void SecondTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver2.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://vk.com/bondarevasvetlana");

        Thread.sleep(5000);

        this.takeSnapShot(driver, "D://test.png");
        driver.quit();
    }
    @Test
    public void ThirdTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver2.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://vk.com/feed");

        Thread.sleep(5000);

        this.takeSnapShot(driver, "D://test.png");
        driver.quit();
    }
    @Test
    public void FourthTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver2.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://vk.com/im");

        Thread.sleep(5000);

        this.takeSnapShot(driver, "D://test.png");
        driver.quit();
    }
    @Test
    public void FifthTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver2.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://vk.com/friends");

        Thread.sleep(5000);

        this.takeSnapShot(driver, "D://test.png");
        driver.quit();
    }
    @Test
    public void SixthTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver2.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://vk.com/bondarevasvetlana");

        Thread.sleep(5000);

        this.takeSnapShot(driver, "D://test.png");
        driver.quit();
    }

    @Test
    public void SeventhTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver2.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vk.com");

        driver.findElement(By.id("post_field")).click();
        System.out.println("Я учусь в Учебном центре Netcracker Тольятти https://vk.com/infocom_tlt");
        driver.findElement(By.id("send_post")).click();



        Thread.sleep(5000);

        this.takeSnapShot(driver, "D://test.png");
    }