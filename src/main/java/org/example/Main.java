package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Main {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){

        DesiredCapabilities Caps = new DesiredCapabilities();
        System.setProperty("WebDriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://ww1.demoaut.com/?usid=20&utid=12337869234");
        driver.manage().window().maximize();

    }

    @Test
    public void Prueba1(){
        System.out.println("hola");

    }

    @Test
    public void Prueba2(){
        Assert.assertTrue(1==1);
            System.out.println("El navegador se ha cerrado");


    }
}