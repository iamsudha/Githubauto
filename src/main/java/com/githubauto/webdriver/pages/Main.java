package com.githubauto.webdriver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "/Users/sudhakatta/Downloads/geckodriver");
    WebDriver driver1 = new FirefoxDriver();
    GithubHomePage homePage = new GithubHomePage(driver1);
    GithubLoginPage loginPage = homePage.signIn();
    loginPage.logIn("iamsudha", "shr1ya02");
  }

}
