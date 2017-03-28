package com.githubauto.webdriver.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	// if a variable is constant you can make it private static final
	private final WebDriver webdriver;
	// every constant should be with uppercase and underscore
	private static final By RESULT_LOCATOR = By.cssSelector("div.codesearch-results li");
	private static final By TEXT_LOCATOR = By.tagName("h3");

	public SearchPage(WebDriver driver) {

		webdriver = driver;
	}

	public int getResultcount() {

		return webdriver.findElements(RESULT_LOCATOR).size();
	}

	public List<String> getProjectTitles() {

		// By resultLocator = By.cssSelector("div.codesearch-results li"); make
		// it private to the class as it is repeated
		List<WebElement> resultEles = webdriver.findElements(RESULT_LOCATOR);
		List<String> titles = new ArrayList<>();
		// By textLocator = By.tagName("h3");
		for (WebElement resEle : resultEles) {
			String title = resEle.findElement(TEXT_LOCATOR).getText();
			titles.add(title);
		}
		return titles;
	}

	// inner class getting the results of githup searchpage instead of getting
	// all the elements at once
	public Result getResult(int index) {

		WebElement resultEle = webdriver.findElements(RESULT_LOCATOR).get(index);
		return new Result(resultEle);
	}

	public static class Result {

		WebElement resultEle;

		public Result(WebElement resultEle) {
			this.resultEle = resultEle;
			// TODO Auto-generated constructor stub
		}

		public String getProjectTitle() {

			return resultEle.findElement(TEXT_LOCATOR).getText();
		}

	}
}
