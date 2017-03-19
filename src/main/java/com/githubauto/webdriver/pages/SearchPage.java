package com.githubauto.webdriver.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class SearchPage {
	  private WebDriver webdriver;
	  public SearchPage(WebDriver driver) {
	    webdriver = driver;
	  }

	public int getResultscount(){
		List<WebElement> lst = webdriver.findElements(By.className("col-12"));
		return lst.size();		     
	}
	
	public void printResults(){
		List<WebElement> lst = webdriver.findElements(By.className("col-12").className("v-align-middle"));	
		for(int i=0;i<lst.size();i++){
			System.out.println(lst.get(i).getText());
		}
	}
	  
	}

