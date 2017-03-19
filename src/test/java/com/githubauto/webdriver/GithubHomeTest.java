package com.githubauto.webdriver;
import com.githubauto.webdriver.pages.FeaturesPage;
import com.githubauto.webdriver.pages.GithubHomePage;
import com.githubauto.webdriver.pages.SearchPage;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithubHomeTest {
	public WebDriver driver;

  /*
   * open browser,go to github.com verify title Automation: create a webdriver create a
   * gitbubhomepage instance and pass driver to it githubhomepage.load will load githubhomepage
   * githubhomepage.gettitle verify the title.
   */
  /*
   * private WebDriver driver;trying use a constructor doesn't solve the problem of initiating the
   * webdriver object i.e., opening the browser multiple times, so we have to use singleton class
   * 
   * public GithubHomeTest() { System.setProperty("webdriver.gecko.driver",
   * "/Users/sudhakatta/Downloads/geckodriver"); WebDriver driver = new FirefoxDriver(); }
   */ 
  /*public GithubHomeTest() {
	    driver = WebdriverBuilder.getDriver();

	}*/

  /*@Test
  public void verifyTitlewithoutlogin() {
    // System.setProperty("webdriver.gecko.driver", "/Users/sudhakatta/Downloads/geckodriver");
    // WebDriver driver = new FirefoxDriver();
    System.setProperty("webdriver.chrome.driver", "/Users/sudhakatta/Downloads/chromedriver");
    WebDriver chromedriver = new ChromeDriver();
    chromedriver.get("http://www.github.com");
    GithubHomePage homepage = new GithubHomePage(chromedriver);
    homepage.load();
    String title = homepage.getTitle();
    // assert that the title is expected
    Assert.assertEquals("The world's leading software development platform · GitHub", title);
  }

  @Test
  public void verifyFeaturespageTitle() {
    // System.setProperty("webdriver.gecko.driver", "/Users/sudhakatta/Downloads/geckodriver");
    // WebDriver driver = new FirefoxDriver();
    System.setProperty("webdriver.chrome.driver", "/Users/sudhakatta/Downloads/chromedriver");
    WebDriver chromedriver = new ChromeDriver();
    chromedriver.get("http://www.github.com");
    GithubHomePage homepage = new GithubHomePage(chromedriver);
    homepage.load();
    FeaturesPage featurespage = new FeaturesPage(chromedriver);
    homepage.gotoFeatures();
    // homepage.getTitle();
    String title = homepage.getTitle();
    Assert.assertEquals(
        "Features For Collaborative Coding - Developers Work Better, Together | GitHub · GitHub",
        title);
  }*/
  
  @Test
  public void verifySearchresults(){
	  System.setProperty("webdriver.chrome.driver", "/Users/sudhakatta/Downloads/chromedriver");
	    WebDriver chromedriver = new ChromeDriver();
	    chromedriver.get("http://www.github.com");
	    GithubHomePage homepage = new GithubHomePage(chromedriver);
	    SearchPage searchpage = new SearchPage(chromedriver);
	    homepage.search("hibernate");
	    int textcount=searchpage.getResultscount();
	    System.out.println("Number of textresults are: "+ textcount);
	    searchpage.printResults();
  }

}
