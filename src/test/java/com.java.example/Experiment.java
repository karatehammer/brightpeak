package com.java.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Experiment {

    @Test
    public void testing123() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Nick\\IdeaProjects\\java_example\\driver\\geckodriver.exe");
        WebDriver firefox = new FirefoxDriver();

        firefox.get("https://www.brightpeakfinancial.com/");
    }
}
