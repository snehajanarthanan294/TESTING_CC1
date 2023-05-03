package com.cia1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class q2 {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//url of the page
		driver.get("https://www.saucedemo.com/");
		
		//maximise the window
		driver.manage().window().maximize();
		
		//enter username and password
		WebElement username = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input"));
		password.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//apply the filter for backwards and forwards sorting 
		WebElement c1=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		c1.click();
		Thread.sleep(2000);
		WebElement c2=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]"));
		c2.click();
		Thread.sleep(2000);
		String e1=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		System.out.println("ORDER A - Z PRODUCT 1"+e1);
		WebElement c3=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]"));
		c3.click();
		Thread.sleep(2000);
		String e2=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
		System.out.println("ORDER Z-A: PRODUCT 1"+e2);
		Thread.sleep(1000);
		
		//apply filter low to high sorting
		WebElement c4=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]"));
		c4.click();
		Thread.sleep(2000);
		String e3=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
		System.out.println("LOW TO HIGH PRODUCT 1"+e3);
		WebElement c5=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]"));
		c5.click();
		Thread.sleep(2000);
		String e4=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
		System.out.println("LOW TO HIGH PRODUCT 1"+e4);
		Thread.sleep(1000);
		
	}
}
