package com.githubauto.webdriver;

import com.githubauto.webdriver.pages.CreaterepoPage;
import com.githubauto.webdriver.pages.FeaturesPage;
import com.githubauto.webdriver.pages.GithubHomePage;
import com.githubauto.webdriver.pages.GithubLoginPage;
import com.githubauto.webdriver.pages.GithubuserHomePage;
import com.githubauto.webdriver.pages.SearchPage;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithubuserHomeTest {
	public WebDriver driver;

public GithubuserHomeTest() {
	driver = WebdriverBuilder.getDriver();
	
}
//on home page, signIn() -> GithubLoginpage
	// on GithubLoginPage, login(String userName, String password) ->GithubuserHomePage
		/*@Test
	public void verifySignIn() {
		driver.manage().deleteAllCookies(); //will delete all cookies	
		GithubHomePage homepage = new GithubHomePage(driver);
		homepage.load();
		GithubLoginPage loginpage = homepage.signIn();
		GithubuserHomePage userhomepage = loginpage.logIn("testwipauto", "shr1ya02");

	}

	@Test
	public void verfiyStartButtonExists() {
		driver.manage().deleteAllCookies(); //will delete all cookies
		GithubHomePage homepage = new GithubHomePage(driver);
		homepage.load();
		GithubLoginPage loginpage = homepage.signIn();
		GithubuserHomePage userhomepage = loginpage.logIn("testwipauto", "shr1ya02");
		//GithubuserHomePage userhomepage = new GithubuserHomePage(driver);
		userhomepage.locateStartButton();

	}*/
	
	// on GithubuserHomePage ->click on Start a project and enter repository name in the text box and click on create a repository button

	@Test
	public void verifynewGitProject(){
		driver.manage().deleteAllCookies();
		GithubHomePage homepage = new GithubHomePage(driver);
		homepage.load();
		GithubLoginPage loginpage = homepage.signIn();
		GithubuserHomePage userhomepage = loginpage.logIn("testwipauto", "shr1ya02");
		userhomepage.creategitProject("testproject4");
		
		
	}
	
	
}
