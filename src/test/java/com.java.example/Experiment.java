package com.java.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class Experiment {

    @Test
    public void testHomePage() {
        System.setProperty("webdriver.gecko.driver","driver/geckodriver");
        WebDriver firefox = new FirefoxDriver();

        firefox.get("https://www.brightpeakfinancial.com/");

        WebElement homeLink = firefox.findElement(By.id("menu-item-link-get-started"));
        WebElement productsLink = firefox.findElement(By.id("menu-item-link-products"));
        WebElement adviceLink = firefox.findElement(By.id("menu-item-link-resources"));
        WebElement resourcesLink = firefox.findElement(By.id("menu-item-link-about"));
        WebElement tipsAndStoriesLink = firefox.findElement(By.id("menu-item-link-tips-&-stories"));
        WebElement searchLink = firefox.findElement(By.cssSelector(".mk-search-trigger"));


        assertEquals(firefox.getCurrentUrl(),"https://www.brightpeakfinancial.com/");

    }
}
