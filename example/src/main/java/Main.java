import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import org.openqa.selenium.Keys;


public class Main {
     public static void main(String[] args){


        System.setProperty("webdriver.chrom.driver", "C:\\Users\\Klien\\IdeaProjects\\example\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/");
         WebElement serach_input=driver.findElement(By.id("edit-search-block-form--2"));
         serach_input.sendKeys("interview questions",Keys.ENTER);
         List<WebElement> result= driver.findElements(By.cssSelector(".search-result>.title"));
        for(int i=0;i<result.size();i++) {
             String res=result.get(i).getText().toLowerCase();
            if (res.contains("interview questions")) {
                System.out.println("The text is found-->" + res);

            } else {
                System.out.println("Not matcht");
            }
        }
driver.quit();

    }
}
