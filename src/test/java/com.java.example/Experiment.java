package com.java.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class Experiment {

    @Test
    public void testing123() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Nick\\IdeaProjects\\java_example\\driver\\geckodriver.exe");
        WebDriver firefox = new FirefoxDriver();

        firefox.get("https://www.brightpeakfinancial.com/");

        WebElement homeLink = firefox.findElement(By.id("menu-item-link-home"));
        WebElement productsLink = firefox.findElement(By.id("menu-item-link-products"));
        WebElement adviceLink = firefox.findElement(By.id("menu-item-link-advice"));
        WebElement resourcesLink = firefox.findElement(By.id("menu-item-link-resources"));

        assertEquals(firefox.getCurrentUrl(),"https://www.brightpeakfinancial.com/");

    }
}
