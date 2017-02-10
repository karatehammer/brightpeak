package com.java.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Experiment {

    @Test
    public void testing123() {
        System.out.println("HelloWorld");

        WebDriver firefox = new FirefoxDriver();

        firefox.get("www.brightpeak");
    }
}
