package com.githubauto.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubLoginPage {
  private WebDriver webdriver;
  public GithubLoginPage(WebDriver driver) {
    webdriver = driver;
  }

 public void logIn(String uname,String pwd){
   WebElement userName = webdriver.findElement(By.id("login_field"));
   userName.sendKeys(uname);
   WebElement password = webdriver.findElement(By.id("password"));
   password.sendKeys(pwd);
   WebElement linkElement1 = webdriver.findElement(By.className("btn"));
   linkElement1.click();
      }

}
