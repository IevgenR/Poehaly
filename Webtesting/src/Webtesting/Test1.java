package Webtesting;

import org.testng.annotations.Test;

import WebtestingSeleniumHelpler.PrepareWebdriver;
import WebtestingSeleniumHelpler.*;
import bsh.Console;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.*;
//Test
//Test2
//Testcommit
//Branch local IevgenR
public class Test1 {
	
	private WebDriver driver;
	
  @Test
  public void GetTile() {
	  
	  PrepareWebdriver prepare = new PrepareWebdriver();
	  this.driver = prepare.initwebdriver();
	  prepare.driver.get("http://lb.ua/");
	  
	 
	 
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }


  @AfterSuite
  public void afterSuite() {
	  this.driver.close();
  }

}
