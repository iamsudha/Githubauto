package com.githubauto.webdriver.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubuserHomePage {
	private WebDriver webdriver;

	public GithubuserHomePage(WebDriver driver) {
		webdriver = driver;
	}

	public boolean locateStartButton() {
		// WebElement btn =
		// webdriver.findElement(By.cssSelector("div.shelf-content
		// a[href='/new']"));
		WebElement btn = webdriver.findElement(By.linkText("Start a project"));
		return btn.isDisplayed();
	}

	public void creategitProject(String text) {
		GithubHomePage homepage = new GithubHomePage(webdriver);
		WebElement btn = webdriver.findElement(By.linkText("Start a project"));
		btn.click();
		WebElement txtreponame = webdriver.findElement(By.id("repository_name"));		
		webdriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		txtreponame.click();
		txtreponame.sendKeys(text);
		//webdriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement btncreaterepo = webdriver.findElement(By.className("first-in-line"));
		btncreaterepo.click();
		WebElement settings = webdriver.findElement(By.className("reponav-item"));
		settings.click();

	}

}
