package com.githubauto.webdriver.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubHomePage {
  private WebDriver webdriver;
  
  public GithubHomePage(WebDriver driver) {
    webdriver=driver;
  }

 public GithubLoginPage signIn(){
   webdriver.get("http://www.github.com");
   webdriver.manage().window().maximize();
   WebElement link = webdriver.findElement(By.linkText("Sign in"));
   link.click();
   webdriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
   GithubLoginPage loginpage=new GithubLoginPage(webdriver);
   return loginpage;
      }

}


