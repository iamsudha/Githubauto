package com.githubauto.webdriver;

import com.githubauto.webdriver.pages.FeaturesPage;
import com.githubauto.webdriver.pages.GithubHomePage;
import com.githubauto.webdriver.pages.GithubLoginPage;
import com.githubauto.webdriver.pages.GithubuserHomePage;
import com.githubauto.webdriver.pages.SearchPage;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithubHomeTest {
	public WebDriver driver;

	public GithubHomeTest() {
		driver = WebdriverBuilder.getDriver();

	}
	/*
	 * open browser,go to github.com verify title Automation: create a webdriver
	 * create a gitbubhomepage instance and pass driver to it
	 * githubhomepage.load will load githubhomepage githubhomepage.gettitle
	 * verify the title. private WebDriver driver;trying use a constructor
	 * doesn't solve the problem of initiating the webdriver object i.e.,
	 * opening the browser multiple times, so we have to use singleton class
	 * public GithubHomeTest() { System.setProperty("webdriver.gecko.driver",
	 * "/Users/sudhakatta/Downloads/geckodriver"); WebDriver driver = new
	 * FirefoxDriver(); }
	 */

	@Test
	public void verifyTitlewithoutlogin() {
		GithubHomePage homepage = new GithubHomePage(driver);
		homepage.load();
		String title = homepage.getTitle(); // assert that the title is expected
		Assert.assertEquals("The world's leading software development platform · GitHub", title);
	}

	@Test
	public void verifyFeaturespageTitle() {

		GithubHomePage homepage = new GithubHomePage(driver);
		homepage.load();
		FeaturesPage featurespage = new FeaturesPage(driver);
		homepage.gotoFeatures(); // homepage.getTitle();
		String title = homepage.getTitle();
		Assert.assertEquals("Features For Collaborative Coding - Developers Work Better, Together | GitHub · GitHub",
				title);
	}

	// 1.go to homepage2. search with some query, it should navigate to
	// searchresults page
	// 3.on results page get the number of results 4.get all project
	// titles,should return all list of titles
	/*
	 * @Test 
	 * public void verifySearchresults() {	 
	 * GithubHomePage homepage = new GithubHomePage(driver); SearchPage
	 * searchpage = new SearchPage(driver); homepage.load();
	 * homepage.search("hibernate"); searchpage.getProjectTitles();
	 * Assert.assertEquals(10, searchpage.getResultcount()); // String
	 * projectTitle = searchpage.getProjectTitles().get(0); // implementing
	 * inner class String projectTitle =
	 * searchpage.getResult(0).getProjectTitle();
	 * Assert.assertEquals(projectTitle, "vireshmanagooli/hibernate"); }
	 */

	// on home page, signIn() -> GithubLoginpage
	// on GithubLoginPage, login(String userName, String password) ->
	// GithubuserHomePage
	// on GithubuserHomePage

	public void verifySignIn() {
		GithubHomePage homepage = new GithubHomePage(driver);
		homepage.load();
		GithubLoginPage loginpage = homepage.signIn();
		GithubuserHomePage userhomepage = loginpage.logIn("wipauto123", "Github123$");
	}

}
