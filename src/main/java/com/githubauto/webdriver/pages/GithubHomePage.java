package com.githubauto.webdriver.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubHomePage {
  private WebDriver webdriver;

  public GithubHomePage(WebDriver driver) {
    webdriver = driver;
  }

  public void load() {
    webdriver.get("http://www.github.com");
  }
  
  public String getTitle(){
   return webdriver.getTitle();    
  }
  
  public GithubLoginPage signIn() {
    webdriver.get("http://www.github.com");
    webdriver.manage().window().maximize();
    WebElement link = webdriver.findElement(By.linkText("Sign in"));
    link.click();
    webdriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    GithubLoginPage loginpage = new GithubLoginPage(webdriver);
    return loginpage;
  }

  public FeaturesPage gotoFeatures(){
    WebElement featuresLink = webdriver.findElement(By.linkText("Features"));
    featuresLink.click();
    //webdriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    return new FeaturesPage(webdriver);
  }

  public SearchPage search(String text){
	  WebElement searchfield = webdriver.findElement(By.name("q"));
	  searchfield.sendKeys(text);
	  searchfield.sendKeys(Keys.ENTER);;
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return new SearchPage(webdriver); 
	  
  }
}


